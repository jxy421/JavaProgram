package io.file;

import java.io.File;
import java.io.IOException;

public class DemoCreateFile {
	public static void main(String[] args){
		//createFile1();
		createFile2();
	}

	private static void createFile2() {
		/**
		 * ����:
		 * 		1. ����һ��fileʵ��������data.dat������ŵ�Ŀ¼
		 * 		2. ����Ŀ¼�����ڣ��򴴽�������Ŀ¼
		 * 		3. ����һ��fileʵ��������data.dat�ļ�
		 *         �����ǻ�����һ������Ŀ¼��Fileʵ��
		 *      4. �������ļ�data.dat
		 */
		try {
			//1
			File dir=new File("."+File.separator+"demo"+File.separator+"a");
			//2
			if(!dir.exists()){
				dir.mkdirs();
			}
			//3
			File file=new File(dir,"data.dat");
			//4
			if(!file.exists()){
				file.createNewFile();
			}
			System.out.println("�ļ������ɹ���");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("�ļ�����ʧ�ܣ�");
		}
	}

	private static void createFile1() throws IOException {
		File file = new File("."+File.separator+"demo"+File.separator+"A"
	                            +File.separator+"data.dat");
		if(!file.exists()){
			file.createNewFile();
			System.out.println("�ļ������ɹ�");
		}
	}
}
