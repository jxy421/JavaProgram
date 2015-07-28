package io.file;

import java.io.File;
import java.io.IOException;

/**
 * �ļ�������
 * @author sunddenly
 *
 */
public class FileUtils {
	public static void main(String[] args){
		File dir = new File("dir");
		try {
			listDirectory(dir);
			deleteDirectory(dir);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * �ݹ��г�ָ��Ŀ¼�µ���������
	 * @param dir
	 */
	public static void listDirectory(File dir)throws IOException{
		if(dir==null){
			throw new IllegalArgumentException(dir+"Ϊ�գ�");
		}
		/**
		 * �ж�Ŀ¼�Ƿ����
		 * Ҫ�Բ����ĺϷ��Խ����жϣ�����������
		 */
		if(!dir.exists()){
			//��Ч�����쳣
			throw new IllegalArgumentException("Ŀ¼��"+dir+"������");
		}
		/**
		 * �ٴΰ�ȫ��֤���鿴�Ƿ�Ϊһ��Ŀ¼�¶������ļ�
		 */
		if(!dir.isDirectory()){
			throw new IllegalArgumentException(dir+"����һ��Ŀ¼��");
		}
		//��ȡ��ǰĿ¼�µ���������
		File[] files = dir.listFiles();
		if(files!=null&&files.length>0){
			for (File file : files) {
				if(file.isDirectory()){
					listDirectory(file);
				}else{
					System.out.println(file);
				}
			}
		}
	}
	/*

	 */
	/**
	 * �ݹ�ɾ��ָ����Ŀ¼
	 * @param dir
	 */
	public static void deleteDirectory(File dir)throws IOException{
		if(dir==null){
			throw new IllegalArgumentException(dir+"Ϊ��");
		}
		if(!dir.exists()){
			throw new IllegalArgumentException(dir+"������");
		}
		if(!dir.isDirectory()){
			throw new IllegalArgumentException(dir+"����Ŀ¼");
		}
		File[] files = dir.listFiles();
		for (File file : files) {
			if(file.isDirectory()){
				deleteDirectory(file);
			}else{
				if(!file.delete()){
					throw new IOException("�޷�ɾ���ļ���"+file);
				}
			}
		}
		//��ǰ���������ɾ��������Ҫɾ����ǰ����������������Ŀ¼
		if(!dir.delete()){
			throw new IOException("�޷�ɾ��Ŀ¼��"+dir);
		}else{
			System.out.println(dir+"ɾ���ɹ���");
		}
		
	}
}
