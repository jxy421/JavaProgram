package io.file;

import java.io.File;
import java.io.IOException;

/**
 * 文件工具类
 * @author sunddenly
 *
 */
public class FileUtils {
	public static void main(String[] args){
		File dir = new File("dir");
		try {
			listDirectory(dir);
			deleteDirectory(dir);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 递归列出指定目录下的所有子项
	 * @param dir
	 */
	public static void listDirectory(File dir)throws IOException{
		if(dir==null){
			throw new IllegalArgumentException(dir+"为空！");
		}
		/**
		 * 判断目录是否存在
		 * 要对参数的合法性进行判断，避免程序出错
		 */
		if(!dir.exists()){
			//无效参数异常
			throw new IllegalArgumentException("目录："+dir+"不存在");
		}
		/**
		 * 再次安全验证，查看是否为一个目录下而不是文件
		 */
		if(!dir.isDirectory()){
			throw new IllegalArgumentException(dir+"不是一个目录！");
		}
		//获取当前目录下的所有子项
		File[] files = dir.listFiles();
		if(files!=null&&files.length>0){
			for (File file : files) {
				if(file.isDirectory()){
					listDirectory(file);
				}else{
					System.out.println(file);
				}
			}
		}
	}
	/*

	 */
	/**
	 * 递归删除指定的目录
	 * @param dir
	 */
	public static void deleteDirectory(File dir)throws IOException{
		if(dir==null){
			throw new IllegalArgumentException(dir+"为空");
		}
		if(!dir.exists()){
			throw new IllegalArgumentException(dir+"不存在");
		}
		if(!dir.isDirectory()){
			throw new IllegalArgumentException(dir+"不是目录");
		}
		File[] files = dir.listFiles();
		for (File file : files) {
			if(file.isDirectory()){
				deleteDirectory(file);
			}else{
				if(!file.delete()){
					throw new IOException("无法删除文件："+file);
				}
			}
		}
		//当前所有子项都被删除后，我们要删除当前方法传入参数的这个目录
		if(!dir.delete()){
			throw new IOException("无法删除目录："+dir);
		}else{
			System.out.println(dir+"删除成功！");
		}
		
	}
}
