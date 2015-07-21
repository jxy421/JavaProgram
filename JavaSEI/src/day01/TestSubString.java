package day01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class TestSubString {
	public static void main(String[] args) {
		/**
		 * subString(int start,int end)
		 * 作用：从给定位置截取字符串
		 * 注意：含头不含尾
		 */
		String str="HelloWorld";
		String sub=str.substring(0,str.length()-1);
		System.out.println(sub);
		/**
		 * subString(int start)
		 * 作用：从start截取到尾部
		 */
		sub=str.substring(0);
		System.out.println(sub);

		/**
		 * 将字符串转换为相应的字节
		 * getBytes()
		 * 将字符串转换为字节数组并返回
		 */
		String info="我爱java";
		/**
		 * 以当前系统默认的字符串编码集转换为字节
		 * window的默认编码集：GBK
		 * GBK：英文用一个字节描述，汉字用两个字节描述
		 */
		byte[] ary=info.getBytes();
		System.out.println(Arrays.toString(ary));
		/**
		 * getBytes()重载方法，用于将字符串以指定的编码集
		 * 转换字节数组
		 */
		/*
		 * 这个方法需要捕获异常
		 * 可能引发没有这个编码的异常
		 * iso8859-1
		 */
		try{
			/**
			 * 编码：将数据以特定格式转换为字节
			 * 解码：将字节以特定格式转换为数据
			 */
			byte[] utf=info.getBytes("UTF-8");
			System.out.println(Arrays.toString(utf));
			
			String infoUTF = new String(utf,"UTF-8");
			System.out.println(infoUTF);
			String infoGBK =new String(utf,"GBK");
			System.out.println(infoGBK);
		}catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}
		
		

	}
}
