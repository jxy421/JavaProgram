package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RandomAccessFile完成文件复制
 * @author sunddenly
 * 思路：
 * 		读取一个文件，将这个文件中的每一个字节写到另一个文件中
 *      就完成了复制功能
 *
 */
public class CopyFile {
	public static void main(String[] args) throws IOException {
		/**
		 * 1. 创建一个用于读取文件的RandomAccessFIle,用于读取被拷贝的文件
		 * 2. 创建一个用于写入文件的RandomAccessFile,用于写入考本文件
		 * 3. 读取被拷贝文件的所有字节并重写到拷贝文件
		 */
		//1
		//File srcFile = new File("src"+File.separator+"file"+File.separator+"DemoFile.java");
		
		File srcFile = new File("E:\\资料\\学习\\视频教程\\Java\\04_JavaSE核心II\\04_JavaSE核心II\\JAVA SE核心2 day01 am.wmv");
		RandomAccessFile src = new RandomAccessFile(srcFile,"rw");
		
		//2
		//File desFile = new File("DemoFile_copy.java");
		File desFile = new File("E:\\04_JavaSE核心II");
		RandomAccessFile des = new RandomAccessFile(desFile,"rw");
		
		//3
		/**
		 * byte by byte 读取
		 */
//		int data = 0;//用于保存每次读取的字节
//		//data=src.readByte();
//		while((data=src.read())!=-1){
//			des.write(data);//将读取的字节写入
//		}
		/**
		 * 多字节缓冲读取
		 */
		byte[] buff = new byte[1024*100];//创建一个字节数组作为缓冲区
		int sum=0;
		while((sum=src.read(buff))>0){
			des.write(buff,0,sum);
		}
				
		src.close();
		des.close();
		System.out.println("复制完毕！");
		
		
		
	}
}
