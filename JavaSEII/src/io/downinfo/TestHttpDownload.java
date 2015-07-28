package io.downinfo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 断点续传测试
 * @author sunddenly
 *
 */
public class TestHttpDownload {
	public static void main(String[] args) {
		/**
		 * 1. 创建下载任务 DownloadInfo实例
		 * 2. 根据任务中的下载地址打开网络连接，获取对应的输入?
		 * 3. 创建任务中保存在本地的文件的输出?
		 * 4. 进行读写操作
		 * 5. 关闭?
		 */
		try{
			//1
			DownloadInfo info = new DownloadInfo(
					"http://dlsw.baidu.com/sw-search-sp/soft/74/14927/MathType_V2014.7.28.0_setup.1431660820.exe"
					,
					"E:\\公式编辑.exe");
			
			//2
			URL url = new URL(info.getUrl());//给定网络地址
			//通过地址打开网络连接（和服务器通信）
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			//3
			long totalSize = Long.parseLong(conn.getHeaderField("CONTENT-LENGTH"));
			//long totalSize = 1000;
			info.setFileSize(totalSize);
			conn.disconnect();
			conn = (HttpURLConnection) url.openConnection();
			/**
			 * 要想实现断点续传。我们必须告诉服务器我们当次读取文件的开始位置
			 * 相当于我们本地调用seek()因为我们不可能直接调用服务器对象的方法
			 * 因此，我们只可能通过某种方法告诉服务器我们要干什么让他自行调用自己
			 * 流对象的seek()到我们想读的位置
			 * 
			 * bytes = 0-    的意思是告诉服务器从第一个字节开始读seek(0)
			 * bytes = 128-  的意识是告诉服务器从129个字节开始读seek(128)
			 */
			String prop = "bytes="+info.getPos()+"-";
			//通过连接设置参数，通知服务器从什么地方来
			conn.setRequestProperty("RANGE", prop);
			//打开输入流开始读取文本
			InputStream in = conn.getInputStream();
/*			DownloadInfo info = 
					new DownloadInfo(
							"C:\\视频\\04_JavaSE核心II\\04_JavaSE核心II\\JAVA SE核心2 day01 am.wmv"
							,
							"sss.avi");
			FileInputStream in =
					new FileInputStream(info.getUrl());*/
			//将任务中记录的本地文件作为要写出的目标文本
			RandomAccessFile raf = 
					new RandomAccessFile(info.getFileName(),"rw");
			//服务器seek的位置就是我们要写的位置
			raf.seek(info.getPos());
			//创建字符缓冲
			byte[] buffer = 
					new byte[1024*10];//10k缓冲区
			int sum = -1;
			/**
			 * 进行下载操作
			 * 从输入流读取数据
			 * 通过输出流写数据
			 */
			while((sum=in.read(buffer))>0){
				raf.write(buffer,0,sum);
				info.setPos(info.getPos()+sum);
				System.out.println(info.getPos());
			}
			raf.close();
			in.close();
			//conn.disconnect();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
