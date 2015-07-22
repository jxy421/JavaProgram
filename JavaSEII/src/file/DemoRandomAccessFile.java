package file;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * RandomAccesFile��д�ļ�
 * @author sunddenly
 *
 */
public class DemoRandomAccessFile {
	public static void main(String[] args) throws IOException {
		/**
		 * ���ļ� .\data.dat��д����
		 * ���裺
		 * 		1. ����file����
		 * 		2. �������򴴽�
		 * 		3. ����RandomAccessFile��File��ʾ���ļ����ж�д����
		 * 		4. ���ļ�д������
		 */
		File file = new File("data.dat");
		if(!file.exists()){
			//�������ļ�
			file.createNewFile();
		}
		//��file�ļ����Խ��ж�д����
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		/**
		 * write(int) дһ���ֽ�
		 * 
		 * 01111111 11111111 11111111 11111111
		 * 00000000 0000000  00000000 01111111 00 00 00 7f
		 * 00000000 0000000  01111111 11111111 00 00 7f ff
		 * 00000000 01111111 11111111 11111111 00 7f ff ff
		 * 01111111 11111111 11111111 11111111 7f ff ff ff
		 * 
		 */
		int i=0x7fffffff;
		raf.write(i>>>24);
		raf.write(i>>>16);
		raf.write(i>>>8);
		raf.write(i);//����4�ֽ�
		//����һ��10�ֽ�����
		byte[]data = new byte[]{0,1,2,3,4,5,6,7,8,9};
		//����10���ֽ�����ȫ��д��
		raf.write(data);//����14�ֽ�
		/**
		 * Щ�ֽ��������ط���
		 * write(byte[] data,int offset,int length)
		 * ��data�����offsetλ�ÿ�ʼд������дlength���ֽڵ��ļ���
		 * {0,1,2,3,4}
		 */
		raf.write(data,0,5);
		
		raf.seek(0);
		int num=0;
		
		int b = raf.read();
		num=num|(b<<24);
		
		b = raf.read();
		num=num|(b<<16);
		
		b = raf.read();
		num=num|(b<<8);
		
		b = raf.read();
		num=num|b;
		System.out.println("int ���ֵ��"+Integer.toHexString(num));
		
		raf.seek(0);
		byte[] buf = new byte[1024];//��ȡ1k
		
		int sum1=raf.read(buf);
		System.out.println("�ܹ���ȡ��"+sum1+"���ֽ�");
		System.out.println(Arrays.toString(buf));
		raf.close();
	}
}
