package io.characters.brbw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 使用缓冲字符输入流读取键盘输入信息
 * @author sunddenly
 *
 */
public class DemoSystemIn {
	public static void main(String[] args) throws IOException {
		/**
		 * 将键盘的输入流转换为字符输入流
		 * 将字符输入流转换为缓冲字符输入流
		 */
		//键盘字节输入流转换为字符输入流
		InputStreamReader isr = new InputStreamReader(System.in);
		//字符流转换字符缓冲流
		BufferedReader br = new BufferedReader(isr);
		
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("systemin.txt"));
		BufferedWriter writer = new BufferedWriter(osw);
		
		String info = null;
		while(true){
			info = br.readLine();
			if("exit".equals(info.trim())){
				break;
			}
			/**
			 * 若我们不输出到控制台，而是通过对文件输出流进行写操作
			 * ，可以将控制台的信息写到文本文件中
			 */
			//System.out.println(info);
			writer.write(info);
			writer.newLine();
			writer.flush();
		}
		br.close();
		writer.close();
		
	}
}
	