package day01;

public class TestString {
	public static void main(String[] args) {
		/**
		 * �ַ������󲻿ɸı�
		 * �ַ�����������������ᴴ���¶���
		 * ����Ӱ����ǰ�Ķ���
		 */
		String s1="	 Hello 	";
		System.out.println("HELLO".equalsIgnoreCase(s1));
		System.out.println("HEllo".toLowerCase());
		System.out.println("HEllo".toUpperCase());
		System.out.println("HEllo".equalsIgnoreCase(s1));
		System.out.println(s1);
		System.out.println("HEllo".equalsIgnoreCase(s1.trim()));
		System.out.println("HEllo".startsWith("HE"));
	}
}
