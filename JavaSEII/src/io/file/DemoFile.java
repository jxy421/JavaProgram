package io.file;

import java.io.File;
import java.io.IOException;

/**
 * File类--创建空文件
 * @author sunddenly
 *
 */
public class DemoFile {
	public static void main(String[] args) {
		/**
		 * 实例化一个文件代表给定路径的文件或目录
		 * 创建该对象并不意味着硬盘上对应路径上就有该文件了，
		 * 只是在内存中创建了该对象去代表路径指定的文件
		 */
		File file = new File("."+File.separator+"data.dat");
		String name = file.getName();
		System.out.println(name);
		/**
		 * 判断该文件是否在硬盘中真是存在
		 * 不存在就创建
		 */
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("文件创建失败！");
			}
		}
	}
}
