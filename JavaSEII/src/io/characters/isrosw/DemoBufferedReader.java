package io.characters.isrosw;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �����ֽ�������
 * @author sunddenly
 *
 */
public class DemoBufferedReader {
	public static void main(String[] args) throws IOException {
		/**
		 * ��ȡ src/isrosw/DemoBufferedWriter.java
		 * readLine���������з�
		 */
		FileInputStream fis =
				new FileInputStream("src\\isrosw\\DemoBufferedWriter.java");
		InputStreamReader isr =
				new InputStreamReader(fis);
		BufferedReader br = 
				new BufferedReader(isr);
		/**
		 * readLine() ��ȡһ���ַ������ַ�����ʽ����
		 * ����ֵ�в����л��з�
		 * ������null��˵�����ص����ļ�ĩβ
		 * EOF: end of file �ļ�ĩβ
		 */
		String str = null;
		while((str = br.readLine())!=null){
			System.out.println(str);
		}
	}
}
