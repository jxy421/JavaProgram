package day01;

import org.apache.commons.lang3.StringUtils;

/**
 * 测试Commons-lang下的StringUtils
 * @author sunddenly
 */
public class TestStringUtils {
	public static void main(String[] args) {
		/*
		 * repeat:将给定字符串重复拼接并返回
		 * 
		 * http://translate.google.com
		 */
		String repeat = StringUtils.repeat("hello", 5);//hellohellohellohellohello
		System.out.println(repeat);
		
		String leftPad = StringUtils.leftPad("Hello", 20, "a");//aaaaaaaaaaaaaaaHello
		System.out.println(leftPad);
		
	}
}
