package isrosw;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 高级流
 * 可以以行为单位读写字符
 * @author sunddenly
 *
 */
public class DemoBufferedWriter {
	public static void main(String[] args) throws IOException{
		//创建用于写文件的输出流
		FileOutputStream fos = 
				new FileOutputStream("buffered.txt");
		OutputStreamWriter osw =
				new OutputStreamWriter(fos,"UTF-8");
		/**
		 * BufferedWiter的构造器 不支持给定一个字节输出流
		 * 只能给定一个字符输出流Writer的子类
		 * Writer：字符输出流的父类
		 */
		BufferedWriter writer = new BufferedWriter(osw);
		
		writer.write("你好呀！");
		writer.newLine();
		writer.write("我是第二行");
		writer.newLine();
		writer.write("我是第三行！");
		writer.flush();
		writer.close();
	}
}
