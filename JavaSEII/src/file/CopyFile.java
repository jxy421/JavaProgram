package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ʹ��RandomAccessFile����ļ�����
 * @author sunddenly
 * ˼·��
 * 		��ȡһ���ļ���������ļ��е�ÿһ���ֽ�д����һ���ļ���
 *      ������˸��ƹ���
 *
 */
public class CopyFile {
	public static void main(String[] args) throws IOException {
		/**
		 * 1. ����һ�����ڶ�ȡ�ļ���RandomAccessFIle,���ڶ�ȡ���������ļ�
		 * 2. ����һ������д���ļ���RandomAccessFile,����д�뿼���ļ�
		 * 3. ��ȡ�������ļ��������ֽڲ���д�������ļ�
		 */
		//1
		//File srcFile = new File("src"+File.separator+"file"+File.separator+"DemoFile.java");
		
		File srcFile = new File("E:\\����\\ѧϰ\\��Ƶ�̳�\\Java\\04_JavaSE����II\\04_JavaSE����II\\JAVA SE����2 day01 am.wmv");
		RandomAccessFile src = new RandomAccessFile(srcFile,"rw");
		
		//2
		//File desFile = new File("DemoFile_copy.java");
		File desFile = new File("E:\\04_JavaSE����II");
		RandomAccessFile des = new RandomAccessFile(desFile,"rw");
		
		//3
		/**
		 * byte by byte ��ȡ
		 */
//		int data = 0;//���ڱ���ÿ�ζ�ȡ���ֽ�
//		//data=src.readByte();
//		while((data=src.read())!=-1){
//			des.write(data);//����ȡ���ֽ�д��
//		}
		/**
		 * ���ֽڻ����ȡ
		 */
		byte[] buff = new byte[1024*100];//����һ���ֽ�������Ϊ������
		int sum=0;
		while((sum=src.read(buff))>0){
			des.write(buff,0,sum);
		}
				
		src.close();
		des.close();
		System.out.println("������ϣ�");
		
		
		
	}
}
