package io.bytes.fios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * IO工具类
 * @author sunddenly
 *
 */
public class IOUtils {
	/**
	 * 读取给定文件，并将数据以字节数组的形式返回
	 * @param src
	 * @return
	 * @throws IOException
	 */
	public static byte[] loadBytes(File src)throws IOException{
		if(src==null){
			throw new IllegalArgumentException("文件为空！");
		}
		if(!src.exists()){
			throw new IllegalArgumentException(src+"不存在！");
		}
		FileInputStream fis = null;
		try{
			fis = new FileInputStream(src);
//			byte [] data = new byte[(int)src.length()];
		    /**
		     * 以字节数组缓冲的方式读入
		     * FileInputStream 的avaiable()方法:
		     * 返回当前字节输入流可读取的字节数
		     */
			byte[] data = new byte[fis.available()];
			int sum=fis.read(data);
			return data;
		}catch(IOException e){
			//读取错误抛给调用者
			throw e;
		}finally{
			if(fis==null){
				fis.close();
			}
		}
	}
	/**
	 * 将给定的数组写入文件中
	 * @param src
	 * @param data
	 */
	public static void saveBytes(File src,byte[] data) throws IOException{
		if(src==null){
			throw new IllegalArgumentException("文件为空！");
		}
		/**
		 * 不用判断FileOutputStream 向file文件写入数据时
		 * 若该文件不存在，则会创建该文件
		 */
//		if(!src.exists()){
//			throw new IllegalArgumentException("文件不存在！");
//		}
		FileOutputStream fos=null;
		try {
			fos = new FileOutputStream(src);
			fos.write(data);
		} catch (IOException e) {
			throw e;
		}finally{
			if(fos!=null){
				fos.close();
			}
		}
		
	}
	/**
	 * 复制文件
	 * @param src
	 * @param des
	 * @throws IOException
	 */
	public static void copy(File src,File des)throws IOException{
		if(src==null||des==null){
			throw new IllegalArgumentException("源文件为空!");
		}
		if(!src.exists()){
			throw new IllegalArgumentException("源文件不存在！");
		}
		FileOutputStream fos=null;
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(des);
			/**
			 * 以字节方式读出
			 * byte by byte
			 */
			int data = 0;
			while((data=fis.read())!=-1){
				fos.write(data);
			}
			/**
			 * 一字节数组缓冲的方式写出
			 */
//			byte[] data = new byte[fis.available()];
//			fis.read(data);
//			fos.write(data);
		} catch (IOException e) {
			throw e;
		} finally{
			if(fis!=null){
				fis.close();
			}
			if(fos!=null){
				fos.close();
			}
		}
	}
	
	/**
	 * 使用缓冲字符输入输出流完成文本文件拷贝
	 * 缓冲字符输入流使用BufferedReader
	 * 缓冲字符输出流使用BufferedWriter或PrintWriter
	 * @param src
	 * @param des
	 */
	public static void copyFile3(File src,File des){
		
	}
}
