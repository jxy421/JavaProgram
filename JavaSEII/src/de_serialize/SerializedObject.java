package de_serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import downinfo.DownloadInfo;

/**
 * �������л�
 * 
 * @author sunddenly
 * 
 */
public class SerializedObject {
	public static void main(String[] args) {
		try{
			DownloadInfo info =
					new DownloadInfo(
							"http://dlsw.baidu.com/sw-search-sp/soft/74/14927/MathType_V2014.7.28.0_setup.1431660820.exe"
							,
							"E:\\��ʽ�༭��.exe"
					);
			info.setPos(12587);
			info.setFileSize(55668987);
			/**
			 * ��info�������л���д���ļ���
			 */
			File file = new File("obj.tmp");
			FileOutputStream fos = new FileOutputStream(file);
			//ͨ��oos���Խ��������л���д��obj.tmp
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(info);
			oos.close();
			/**
			 * �����л�����
			 */
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			//�����л�
			DownloadInfo obj = (DownloadInfo) ois.readObject();
			System.out.println("url: "+obj.getUrl());
			System.out.println("name: "+obj.getFileName());
			System.out.println("pos: "+obj.getPos());
			System.out.println("size: "+obj.getFileSize());
			System.out.println("��ͬһ��������"+(info==obj));
			ois.close();
		} catch(Exception e){
			e.printStackTrace();
			System.out.println("�ǳ�Sorry��");
		}
	}
}
