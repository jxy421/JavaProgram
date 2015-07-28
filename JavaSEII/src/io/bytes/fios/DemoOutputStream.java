package io.bytes.fios;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �����ļ������
 * @author sunddenly
 * FileOutputstream
 * write(int d): д��8λ
 * write(byte[] d)
 * write(byte[] d,int offset,int length)
 *
 */
public class DemoOutputStream {
	public static void main(String[] args) throws IOException{
		File file = new File("out.dat");
		if(!file.exists()){
			file.createNewFile();
		}
		/**
		 * FileOutputStream(File file)
		 * FileOutputStream(File file,boolean append)
		 * FileOutputStream(String file)
		 * FileOutputStream(String file, boolean append)
		 */
		FileOutputStream fos = new FileOutputStream(file,true);
		String info = "hello!";
		//���ַ������ֽ���ʽд��
		byte[] data = info.getBytes("UTF-8");
		fos.write(data);
		fos.close();
	}
}
