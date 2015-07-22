package file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RawndomAccessFile的其他操作
 * @author sunddenly
 *
 */
public class DemoRandomAccessFile2 {
	public static void main(String[] args) throws IOException {
		/**
		 * 创建RandomAccessFile的另一个构造方法
		 * 直接根据文件路径指定
		 * 前提文件必须存在
		 */
		RandomAccessFile raf = new RandomAccessFile("data.dat","rw");
		
		/*
		 * 写Int最大值
		 * 一次写4字节
		 */
		raf.writeInt(Integer.MAX_VALUE);
		/*
		 * 写Long字节
		 * 一次写8字节 
		 */
		raf.writeLong(Long.MAX_VALUE);
		/*
		 * 写字符串
		 * 以UTF-8编码将字符串写入文件
		 */
		raf.writeUTF("Hello");
		
		raf.seek(0);
		int intMax = raf.readInt();
		long longMax = raf.readLong();
		String str = raf.readUTF();
		raf.close();
		System.out.println("int最大值"+Integer.toHexString(intMax));
		System.out.println("long最大值"+Long.toHexString(longMax));
		System.out.println("String "+str);
	}
}
