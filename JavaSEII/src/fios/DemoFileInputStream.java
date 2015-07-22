package fios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * �ļ��ֽ�������
 * FileInputStream:���ڶ�ȡ�ļ����ݵ���
 * @author sunddenly
 *
 */
public class DemoFileInputStream {
	public static void main(String[] args) throws IOException {
		/**
		 * �����ļ��������ڶ�ȡ�����ݵ� �ļ�������
		 */
		File file = new File("data.dat");
		FileInputStream fis = 
				new FileInputStream(file);
		int b = 0;
		while((b = fis.read())!=-1){
			//�������ֽڵ�16������ʽ
			System.out.print(Integer.toHexString(b)+" ");
		}
		fis.close();
	}
}
