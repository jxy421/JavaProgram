package io.file;

import java.io.File;
import java.io.FileFilter;

/**
 * �ļ�������
 * ���ڻ�ȡĳ����Ŀ¼�µ�����ʱɸѡ����������������
 * @author sunddenly
 *
 */
public class DemoFileter {
	public static void main(String[] args){
		/**
		 * ����һ���ļ������������ڹ���.java�ļ�
		 */
		FileFilter filter = new FileFilter(){
			/**
			 * accept����
			 * 1. ���ڶ����������
			 * 2. ����pathname�ǽ������˵�Ŀ¼�е�ÿ������
			 *    ���δ������ƥ��
			 * 3. ��������Ϊ���������������Ż�true
			 */
			public boolean accept(File pathname){
//				System.out.println(pathname.getName());
				boolean tf = pathname.getName().endsWith(".java");
				return tf
						;
			}
		};
		//����һ��Ŀ¼
		File dir = new File(".");
		//��ȡ��������
//		File[] sub = dir.listFiles();
		File[] sub = dir.listFiles(filter);//�ص�ģʽ
		for (File file : sub) {
			
			System.out.println(file);
		}
	}
}
