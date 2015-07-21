package day01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class TestSubString {
	public static void main(String[] args) {
		/**
		 * subString(int start,int end)
		 * ���ã��Ӹ���λ�ý�ȡ�ַ���
		 * ע�⣺��ͷ����β
		 */
		String str="HelloWorld";
		String sub=str.substring(0,str.length()-1);
		System.out.println(sub);
		/**
		 * subString(int start)
		 * ���ã���start��ȡ��β��
		 */
		sub=str.substring(0);
		System.out.println(sub);

		/**
		 * ���ַ���ת��Ϊ��Ӧ���ֽ�
		 * getBytes()
		 * ���ַ���ת��Ϊ�ֽ����鲢����
		 */
		String info="�Ұ�java";
		/**
		 * �Ե�ǰϵͳĬ�ϵ��ַ������뼯ת��Ϊ�ֽ�
		 * window��Ĭ�ϱ��뼯��GBK
		 * GBK��Ӣ����һ���ֽ������������������ֽ�����
		 */
		byte[] ary=info.getBytes();
		System.out.println(Arrays.toString(ary));
		/**
		 * getBytes()���ط��������ڽ��ַ�����ָ���ı��뼯
		 * ת���ֽ�����
		 */
		/*
		 * ���������Ҫ�����쳣
		 * ��������û�����������쳣
		 * iso8859-1
		 */
		try{
			/**
			 * ���룺���������ض���ʽת��Ϊ�ֽ�
			 * ���룺���ֽ����ض���ʽת��Ϊ����
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
