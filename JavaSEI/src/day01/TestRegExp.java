package day01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author hdoop
 * 测试正则表达式
 * 
 */
public class TestRegExp {
	/*
	 * 正则表达式：约束字符串格式
	 * 描述邮箱：
	 * 1. [a-zA-Z0-9_]{1,}@[a-zA-Z0-9]{1.}(\.com|\.cn|\.net)
	 * 2. [a-zA-Z0-9_]+@a-zA-Z0-9]+(\.com|\.cn|\.net)
	 * 3. \w+@[a-zA-Z0-9]+(\.com|\.cn|\.net)
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Pattern 的作用是描述正则表达式的格式支持
		 * 使用静态方法compile注册正则表达式生成实例
		 */
		/*
		 * 邮箱格式的正则表达式
		 * sunddenly@163.com
		 */
		String MailStr="ssunddenly@163.com";
		String PhoneStr="18812668674";
		MatchPhone(PhoneStr);
		MatchMail(MailStr);
	}

	private static void MatchPhone(String str) {
		String regPhone="^(\\+86)?\\d{11}$";
		System.out.println(regPhone);
		Pattern pattern = Pattern.compile(regPhone);
		Matcher matcher = pattern.matcher(str);
		if(matcher.find()){
			System.out.println(str+"：是手机号");
		}else{
			System.out.println(str+"：不是手机号");
		}
	}

	private static void MatchMail(String str) {
		String regMail="^\\w+@[A-Za-z0-9]+(\\.com|\\.cn\\.net)$";
		System.out.println("Regular Expression: "+regMail);
		
		//匹配字符串，返回描述匹配结果的Matcher实例
		Pattern pattern = Pattern.compile(regMail);
		Matcher matcher = pattern.matcher(str);
		//通过matcher的find方法得知是否匹配成功
		if(matcher.find()){
			System.out.println(str+"：邮箱格式正确");
		}else{
			System.out.println(str+"：邮箱格式错误");
		}
	}
}
