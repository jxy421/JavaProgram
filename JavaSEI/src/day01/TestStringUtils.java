package day01;

import org.apache.commons.lang3.StringUtils;

/**
 * ����Commons-lang�µ�StringUtils
 * @author sunddenly
 */
public class TestStringUtils {
	public static void main(String[] args) {
		/*
		 * repeat:�������ַ����ظ�ƴ�Ӳ�����
		 * 
		 * http://translate.google.com
		 */
		String repeat = StringUtils.repeat("hello", 5);//hellohellohellohellohello
		System.out.println(repeat);
		
		String leftPad = StringUtils.leftPad("Hello", 20, "a");//aaaaaaaaaaaaaaaHello
		System.out.println(leftPad);
		
	}
}
