package io.characters.isrosw;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 字符输入流
 * @author sunddenly
 *
 */
public class DemoInputStreamReader {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = null;
		try{
			//创建用于读取文件的字节输入流
			FileInputStream fis = new FileInputStream("writer.txt");
			//创建用于以字符为单位读取数据的高级流
			reader = new InputStreamReader(fis,"UTF-8");
			//读取数据
			int c = -1;
			while((c=reader.read())!=-1){
				System.out.print((char)c);
			}
		} catch(IOException e){
			throw e;
		} finally{
			if(reader!=null){
				reader.close();
			}
		}
	}
}
