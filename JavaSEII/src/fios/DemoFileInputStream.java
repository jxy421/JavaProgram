package fios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 文件字节输入流
 * FileInputStream:用于读取文件内容的流
 * @author sunddenly
 *
 */
public class DemoFileInputStream {
	public static void main(String[] args) throws IOException {
		/**
		 * 根据文件创建用于读取其数据的 文件输入流
		 */
		File file = new File("data.dat");
		FileInputStream fis = 
				new FileInputStream(file);
		int b = 0;
		while((b = fis.read())!=-1){
			//输出这个字节的16进制形式
			System.out.print(Integer.toHexString(b)+" ");
		}
		fis.close();
	}
}
