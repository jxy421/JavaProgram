package de_serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import downinfo.DownloadInfo;

/**
 * 对象序列化
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
							"E:\\公式编辑器.exe"
					);
			info.setPos(12587);
			info.setFileSize(55668987);
			/**
			 * 将info对象序列化后写到文件中
			 */
			File file = new File("obj.tmp");
			FileOutputStream fos = new FileOutputStream(file);
			//通过oos可以将对象序列化后写入obj.tmp
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(info);
			oos.close();
			/**
			 * 反序列化操作
			 */
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			//反序列化
			DownloadInfo obj = (DownloadInfo) ois.readObject();
			System.out.println("url: "+obj.getUrl());
			System.out.println("name: "+obj.getFileName());
			System.out.println("pos: "+obj.getPos());
			System.out.println("size: "+obj.getFileSize());
			System.out.println("是同一个对象吗？"+(info==obj));
			ois.close();
		} catch(Exception e){
			e.printStackTrace();
			System.out.println("非常Sorry！");
		}
	}
}
