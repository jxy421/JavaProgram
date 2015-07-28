package io.characters.fwfr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 文件字符输入流
 * @author sunddenly
 *
 */
public class DemoFileReader {
	public static void main(String[] args) throws IOException {
		FileReader reader = 
				new FileReader("filewriter.txt");
//		int c = -1;
//		while((c = reader.read())!=-1){
//			System.out.print((char)c);
//		}
		BufferedReader br = 
				new BufferedReader(reader);
		String str = null;
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		reader.close();
	}
}
