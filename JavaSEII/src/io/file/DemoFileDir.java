package io.file;

import java.io.File;

/**
 * ʹ��File�ഴ��Ŀ¼
 * @author sunddenly
 *
 */
public class DemoFileDir {
	public static void main(String[] args) {
		try {
			/**
			 * ����Ŀ�ĸ�Ŀ¼�´���demoĿ¼������AĿ¼
			 */
			File filedir = new File("."+File.separator+"demo"+
										File.separator+"A");
			if(!filedir.exists()){
				//mkdirs �������ڵĸ�Ŀ¼Ҳ��������
				filedir.mkdirs();
				System.out.println("����Ŀ¼�ɹ���");
			}
		} catch (Exception e) {
			System.out.println("Ŀ¼����ʧ�ܣ�");
		}
	}
}
