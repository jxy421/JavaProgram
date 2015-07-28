package io.file;

import java.io.File;
import java.io.FileFilter;

/**
 * 文件过滤器
 * 用于获取某个子目录下的子项时筛选出符合条件的子项
 * @author sunddenly
 *
 */
public class DemoFileter {
	public static void main(String[] args){
		/**
		 * 定义一个文件过滤器，用于过滤.java文件
		 */
		FileFilter filter = new FileFilter(){
			/**
			 * accept方法
			 * 1. 用于定义过滤条件
			 * 2. 参数pathname是奖杯过滤的目录中的每个子项
			 *    依次传入进行匹配
			 * 3. 若我们认为孩子项满足条件放回true
			 */
			public boolean accept(File pathname){
//				System.out.println(pathname.getName());
				boolean tf = pathname.getName().endsWith(".java");
				return tf
						;
			}
		};
		//创建一个目录
		File dir = new File(".");
		//获取所有子项
//		File[] sub = dir.listFiles();
		File[] sub = dir.listFiles(filter);//回调模式
		for (File file : sub) {
			
			System.out.println(file);
		}
	}
}
