package io.characters.isrosw;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class DemoSystemOut {
	public static void main(String[] args) throws FileNotFoundException {
		//控制台输出流
		System.out.println("您好！！");
		PrintStream out = System.out;
		//文件字节输出流
		PrintStream fileOut = 
				new PrintStream(new FileOutputStream("SystemOut.txt"));
		//将我们给定的输出流赋值到System.out上
		/**
		 * 将System.out中的out原来指向的是控制台
		 * 下面将其替换为 文件字节输出流
		 */
		System.setOut(fileOut);
		System.out.println("您好！！我是输出到控制台的");
		
		System.setOut(out);
		System.out.println("我是输出到控制台的！");
		fileOut.close();
		
	}
}
