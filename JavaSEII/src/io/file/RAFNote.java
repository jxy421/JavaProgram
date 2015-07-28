package io.file;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 将控制台输入写入文件
 * @author sunddenly
 *
 */
public class RAFNote {
	public static void main(String[] args) throws IOException {
		File file = new File("rafnote.txt");
		Scanner console = new Scanner(System.in);
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		while(true){
			String str = console.nextLine();
			if(str.equals("exit"))
				break;
			/** 再写入时候加入长度 **/
//			raf.writeUTF(str);
			str+="\n";
			byte[] bytes = str.getBytes("UTF-8");
			raf.write(bytes);
		}
		
		
	}
}
