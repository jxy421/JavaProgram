package io.characters.isrosw;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class DemoSystemOut {
	public static void main(String[] args) throws FileNotFoundException {
		//����̨�����
		System.out.println("���ã���");
		PrintStream out = System.out;
		//�ļ��ֽ������
		PrintStream fileOut = 
				new PrintStream(new FileOutputStream("SystemOut.txt"));
		//�����Ǹ������������ֵ��System.out��
		/**
		 * ��System.out�е�outԭ��ָ����ǿ���̨
		 * ���潫���滻Ϊ �ļ��ֽ������
		 */
		System.setOut(fileOut);
		System.out.println("���ã����������������̨��");
		
		System.setOut(out);
		System.out.println("�������������̨�ģ�");
		fileOut.close();
		
	}
}
