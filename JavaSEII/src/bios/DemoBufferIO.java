package bios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import fios.IOUtils;


/**
 * ���������Ʋ���
 * @author sunddenly
 *
 */
public class DemoBufferIO {
	public static void main(String[] args) throws IOException {
		File src = new File("E:\\����\\ѧϰ\\��Ƶ�̳�\\Java\\04_JavaSE����II\\04_JavaSE����II\\JAVA SE����2 day01 am.wmv");
		File des = new File("E:\\����\\a.avi");
		/**
		 * �Ը߼��������ķ�ʽ��д
		 */
		copyFile(src, des);
		/**
		 * һ��ͨ�ֽ����ķ�ʽ��д
		 */
		//IOUtils.copy(src, des);
	}
	/**
	 * ʹ�û����������ļ�����
	 * @param src
	 * @param des
	 * @throws IOException
	 */
	public static void copyFile(File src,File des)throws IOException{
		if(src==null){
			throw new IllegalArgumentException("�ļ�Ϊ�գ�");
		}
		if(!src.exists()){
			throw new IllegalArgumentException("Դ�ļ������ڣ�");
		}
		//����������
		//�Զ����� ctrl+shift+o
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(src));
			bos = new BufferedOutputStream(new FileOutputStream(des));
			
			//********(������)"(������)"*****************
			/**
			 * ��Ȼ����ķ�ʽ����Ȼ�ǰ��ֽ��ڶ�д��
			 * ������BufferedOutputStream��ά����һ���ֽڻ�����
			 * ÿ��ȡһ���ֽڱ�д�뵽��������
			 */
			int data = -1;
			while((data=bis.read())!=-1){
				bos.write(data);
			}
			/**
			 * ���ݶ�д���Ӧ��flush
			 * flush��������
			 * ���������л�δд��������һ����д��
			 */
			bos.flush();
		} catch (IOException e) {
			throw e;
		} finally{
			/**
			 * ͨ������£�����ֻ��Ҫ�ر���������
			 */
			if(bis!=null){
				bis.close();
			}
			if(bos!=null){
				bos.close();
			}
		}
	}
}
