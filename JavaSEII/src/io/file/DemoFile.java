package io.file;

import java.io.File;
import java.io.IOException;

/**
 * File��--�������ļ�
 * @author sunddenly
 *
 */
public class DemoFile {
	public static void main(String[] args) {
		/**
		 * ʵ����һ���ļ��������·�����ļ���Ŀ¼
		 * �����ö��󲢲���ζ��Ӳ���϶�Ӧ·���Ͼ��и��ļ��ˣ�
		 * ֻ�����ڴ��д����˸ö���ȥ����·��ָ�����ļ�
		 */
		File file = new File("."+File.separator+"data.dat");
		String name = file.getName();
		System.out.println(name);
		/**
		 * �жϸ��ļ��Ƿ���Ӳ�������Ǵ���
		 * �����ھʹ���
		 */
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("�ļ�����ʧ�ܣ�");
			}
		}
	}
}
