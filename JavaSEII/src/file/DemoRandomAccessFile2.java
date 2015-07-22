package file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RawndomAccessFile����������
 * @author sunddenly
 *
 */
public class DemoRandomAccessFile2 {
	public static void main(String[] args) throws IOException {
		/**
		 * ����RandomAccessFile����һ�����췽��
		 * ֱ�Ӹ����ļ�·��ָ��
		 * ǰ���ļ��������
		 */
		RandomAccessFile raf = new RandomAccessFile("data.dat","rw");
		
		/*
		 * дInt���ֵ
		 * һ��д4�ֽ�
		 */
		raf.writeInt(Integer.MAX_VALUE);
		/*
		 * дLong�ֽ�
		 * һ��д8�ֽ� 
		 */
		raf.writeLong(Long.MAX_VALUE);
		/*
		 * д�ַ���
		 * ��UTF-8���뽫�ַ���д���ļ�
		 */
		raf.writeUTF("Hello");
		
		raf.seek(0);
		int intMax = raf.readInt();
		long longMax = raf.readLong();
		String str = raf.readUTF();
		raf.close();
		System.out.println("int���ֵ"+Integer.toHexString(intMax));
		System.out.println("long���ֵ"+Long.toHexString(longMax));
		System.out.println("String "+str);
	}
}
