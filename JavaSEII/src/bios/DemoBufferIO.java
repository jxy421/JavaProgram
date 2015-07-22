package bios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import fios.IOUtils;


/**
 * 缓冲流复制操作
 * @author sunddenly
 *
 */
public class DemoBufferIO {
	public static void main(String[] args) throws IOException {
		File src = new File("E:\\资料\\学习\\视频教程\\Java\\04_JavaSE核心II\\04_JavaSE核心II\\JAVA SE核心2 day01 am.wmv");
		File des = new File("E:\\资料\\a.avi");
		/**
		 * 以高级缓冲流的方式读写
		 */
		copyFile(src, des);
		/**
		 * 一普通字节流的方式读写
		 */
		//IOUtils.copy(src, des);
	}
	/**
	 * 使用缓冲流进行文件拷贝
	 * @param src
	 * @param des
	 * @throws IOException
	 */
	public static void copyFile(File src,File des)throws IOException{
		if(src==null){
			throw new IllegalArgumentException("文件为空！");
		}
		if(!src.exists()){
			throw new IllegalArgumentException("源文件不存在！");
		}
		//创建缓冲流
		//自动导包 ctrl+shift+o
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(src));
			bos = new BufferedOutputStream(new FileOutputStream(des));
			
			//********(￣▽￣)"(￣▽￣)"*****************
			/**
			 * 虽然下面的方式人仍然是按字节在读写的
			 * 但是在BufferedOutputStream中维护着一个字节缓冲区
			 * 每读取一个字节便写入到缓冲区中
			 */
			int data = -1;
			while((data=bis.read())!=-1){
				bos.write(data);
			}
			/**
			 * 数据都写完后，应该flush
			 * flush的作用是
			 * 将缓冲区中还未写出的数据一次性写出
			 */
			bos.flush();
		} catch (IOException e) {
			throw e;
		} finally{
			/**
			 * 通常情况下，我们只需要关闭最外层的流
			 */
			if(bis!=null){
				bis.close();
			}
			if(bos!=null){
				bos.close();
			}
		}
	}
}
