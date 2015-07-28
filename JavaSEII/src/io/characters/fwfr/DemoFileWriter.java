package io.characters.fwfr;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 文件字符输出流
 * @author sunddenly
 *
 */
public class DemoFileWriter {
	public static void main(String[] args) throws IOException {
		/**
		 * FileWriter(File file)
		 * FileWriter(String filepath)
		 */
		FileWriter writer = 
				new FileWriter("filewriter.txt");
		writer.write("Hello!Honey!");
		writer.close();
		
		
		
	}
}
