package day01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author hdoop
 * ����������ʽ
 * 
 */
public class TestRegExp {
	/*
	 * ������ʽ��Լ���ַ�����ʽ
	 * �������䣺
	 * 1. [a-zA-Z0-9_]{1,}@[a-zA-Z0-9]{1.}(\.com|\.cn|\.net)
	 * 2. [a-zA-Z0-9_]+@a-zA-Z0-9]+(\.com|\.cn|\.net)
	 * 3. \w+@[a-zA-Z0-9]+(\.com|\.cn|\.net)
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Pattern ������������������ʽ�ĸ�ʽ֧��
		 * ʹ�þ�̬����compileע��������ʽ����ʵ��
		 */
		/*
		 * �����ʽ��������ʽ
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
			System.out.println(str+"�����ֻ���");
		}else{
			System.out.println(str+"�������ֻ���");
		}
	}

	private static void MatchMail(String str) {
		String regMail="^\\w+@[A-Za-z0-9]+(\\.com|\\.cn\\.net)$";
		System.out.println("Regular Expression: "+regMail);
		
		//ƥ���ַ�������������ƥ������Matcherʵ��
		Pattern pattern = Pattern.compile(regMail);
		Matcher matcher = pattern.matcher(str);
		//ͨ��matcher��find������֪�Ƿ�ƥ��ɹ�
		if(matcher.find()){
			System.out.println(str+"�������ʽ��ȷ");
		}else{
			System.out.println(str+"�������ʽ����");
		}
	}
}
