package io.bytes.fios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * IO������
 * @author sunddenly
 *
 */
public class IOUtils {
	/**
	 * ��ȡ�����ļ��������������ֽ��������ʽ����
	 * @param src
	 * @return
	 * @throws IOException
	 */
	public static byte[] loadBytes(File src)throws IOException{
		if(src==null){
			throw new IllegalArgumentException("�ļ�Ϊ�գ�");
		}
		if(!src.exists()){
			throw new IllegalArgumentException(src+"�����ڣ�");
		}
		FileInputStream fis = null;
		try{
			fis = new FileInputStream(src);
//			byte [] data = new byte[(int)src.length()];
		    /**
		     * ���ֽ����黺��ķ�ʽ����
		     * FileInputStream ��avaiable()����:
		     * ���ص�ǰ�ֽ��������ɶ�ȡ���ֽ���
		     */
			byte[] data = new byte[fis.available()];
			int sum=fis.read(data);
			return data;
		}catch(IOException e){
			//��ȡ�����׸�������
			throw e;
		}finally{
			if(fis==null){
				fis.close();
			}
		}
	}
	/**
	 * ������������д���ļ���
	 * @param src
	 * @param data
	 */
	public static void saveBytes(File src,byte[] data) throws IOException{
		if(src==null){
			throw new IllegalArgumentException("�ļ�Ϊ�գ�");
		}
		/**
		 * �����ж�FileOutputStream ��file�ļ�д������ʱ
		 * �����ļ������ڣ���ᴴ�����ļ�
		 */
//		if(!src.exists()){
//			throw new IllegalArgumentException("�ļ������ڣ�");
//		}
		FileOutputStream fos=null;
		try {
			fos = new FileOutputStream(src);
			fos.write(data);
		} catch (IOException e) {
			throw e;
		}finally{
			if(fos!=null){
				fos.close();
			}
		}
		
	}
	/**
	 * �����ļ�
	 * @param src
	 * @param des
	 * @throws IOException
	 */
	public static void copy(File src,File des)throws IOException{
		if(src==null||des==null){
			throw new IllegalArgumentException("Դ�ļ�Ϊ��!");
		}
		if(!src.exists()){
			throw new IllegalArgumentException("Դ�ļ������ڣ�");
		}
		FileOutputStream fos=null;
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(des);
			/**
			 * ���ֽڷ�ʽ����
			 * byte by byte
			 */
			int data = 0;
			while((data=fis.read())!=-1){
				fos.write(data);
			}
			/**
			 * һ�ֽ����黺��ķ�ʽд��
			 */
//			byte[] data = new byte[fis.available()];
//			fis.read(data);
//			fos.write(data);
		} catch (IOException e) {
			throw e;
		} finally{
			if(fis!=null){
				fis.close();
			}
			if(fos!=null){
				fos.close();
			}
		}
	}
	
	/**
	 * ʹ�û����ַ��������������ı��ļ�����
	 * �����ַ�������ʹ��BufferedReader
	 * �����ַ������ʹ��BufferedWriter��PrintWriter
	 * @param src
	 * @param des
	 */
	public static void copyFile3(File src,File des){
		
	}
}
