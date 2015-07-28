package io.characters.isrosw;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 缓冲字节输入流
 * @author sunddenly
 *
 */
public class DemoBufferedReader {
	public static void main(String[] args) throws IOException {
		/**
		 * 读取 src/isrosw/DemoBufferedWriter.java
		 * readLine不包含回行符
		 */
		FileInputStream fis =
				new FileInputStream("src\\isrosw\\DemoBufferedWriter.java");
		InputStreamReader isr =
				new InputStreamReader(fis);
		BufferedReader br = 
				new BufferedReader(isr);
		/**
		 * readLine() 读取一行字符并以字符串形式返回
		 * 返回值中不带有换行符
		 * 若返回null，说明返回到了文件末尾
		 * EOF: end of file 文件末尾
		 */
		String str = null;
		while((str = br.readLine())!=null){
			System.out.println(str);
		}
	}
}
