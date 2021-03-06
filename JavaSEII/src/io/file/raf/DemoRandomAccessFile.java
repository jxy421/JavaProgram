package io.file.raf;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * RandomAccesFile读写文件
 * @author sunddenly
 *
 */
public class DemoRandomAccessFile {
	public static void main(String[] args) throws IOException {
		/**
		 * 向文件 .\data.dat中写数据
		 * 步骤：
		 * 		1. 创建file对象
		 * 		2. 不存在则创建
		 * 		3. 创建RandomAccessFile对File表示的文件进行读写操作
		 * 		4. 向文件写入内容
		 */
		File file = new File("data.dat");
		if(!file.exists()){
			//创建该文件
			file.createNewFile();
		}
		//对file文件可以进行读写操作
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		/**
		 * write(int) 写一个字节
		 * 
		 * 01111111 11111111 11111111 11111111
		 * 00000000 0000000  00000000 01111111 00 00 00 7f
		 * 00000000 0000000  01111111 11111111 00 00 7f ff
		 * 00000000 01111111 11111111 11111111 00 7f ff ff
		 * 01111111 11111111 11111111 11111111 7f ff ff ff
		 * 
		 */
		
		/**========写入一个字节8为========*/
		int i=0x7fffffff;
		raf.write(i>>>24);
		raf.write(i>>>16);
		raf.write(i>>>8);
		raf.write(i);//容量4字节
		/**========写入一个字节数组========*/
		byte[]data = new byte[]{0,1,2,3,4,5,6,7,8,9};//定义一个10字节数组
		raf.write(data);//将这10个字节数组全部写入容量14字节
		/**
		 * 些字节数组重载方法
		 * write(byte[] data,int offset,int length)
		 * 从data数组的offset位置开始写，连续写length个字节到文件中
		 * {0,1,2,3,4}
		 */
		raf.write(data,0,5);
		/**========按字节读取一个int最大值========*/
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
		System.out.println("int 最大值："+Integer.toHexString(num));
		/**========按字节数组读取内容========*/
		raf.seek(0);
		byte[] buf = new byte[1024];//读取1k
		int sum1=raf.read(buf);
		System.out.println("总共读取了"+sum1+"个字节");
		System.out.println(Arrays.toString(buf));
		raf.close();
		/**========字符串读写========*/
		File strfile = new File("str.dat");
		RandomAccessFile strRaf = new RandomAccessFile(strfile, "rw");
		String str = "Hello World！";
		byte[] bytes = str.getBytes("GBK");
		strRaf.write(bytes);
		strRaf.seek(0);
		byte[] buf2 = new byte[bytes.length];
		int num2=strRaf.read(buf2);
		System.out.println("读取了["+num2+"]个字节: "+Arrays.toString(buf2));
		System.out.println("读取了["+num2+"]个字节: "+new String(buf2));
		
		/**========跳过部分字节再次读取========*/
		System.out.println("指针位置："+strRaf.getFilePointer());
		strRaf.seek(0);
		System.out.println("指针位置："+strRaf.getFilePointer());
		strRaf.skipBytes(5);
		System.out.println("指针位置："+strRaf.getFilePointer());
		byte[] buf3 = new byte[10];
		int num3= strRaf.read(buf3);
		System.out.println(new String(buf3,0,num3));
	}
}
