package day01;

public class TestString {
	public static void main(String[] args) {
		/**
		 * 字符串对象不可改变
		 * 字符串的任意操作，都会创建新对象
		 * 而不影响以前的对象
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
