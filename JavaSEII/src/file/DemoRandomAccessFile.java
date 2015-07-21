package file;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class DemoRandomAccessFile {
	/**
	 * @param args
	 * @throws IOException
	 */
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		File file = new File("data.dat");
		if(file.exists()){
			file.createNewFile();
		}
		RandomAccessFile raf=new RandomAccessFile(file, "rw");
		int i=0x7fffffff;
		raf.write(i>>>24);
		raf.write(i>>>16);
		raf.write(i>>>8);
		raf.write(i);
		
		byte[] data=new byte[]{0,1,2,3,4,5,6,7,8,9};
		raf.write(data);
		raf.write(data,0,5);
		/**
		 *       01111111 11111111 11111111 11111111
		 * num   00000000 00000000 00000000 00000000
		 *  b    00000000 00000000 00000000 01111111
		 * b<<24 01111111 00000000 00000000 00000000 
		 */
		System.out.println("当前指针位置："+raf.getFilePointer());
		raf.seek(0);//将指针移动到文件开始位置
		int num=0;
		
		int b=raf.read();//读取第一个字节
		num=num|(b<<24);
		System.out.println(Integer.toHexString(num));
		
		b=raf.read();//读取第二字节
		num=num|(b<<16);
		System.out.println(Integer.toHexString(num));
		
		b=raf.read();//读取第三字节
		num=num|(b<<8);
		System.out.println(Integer.toHexString(num));
		
		b=raf.read();//读取第四字节
		num=num|b;
		System.out.println(Integer.toHexString(num));
		raf.close();
	}
}
