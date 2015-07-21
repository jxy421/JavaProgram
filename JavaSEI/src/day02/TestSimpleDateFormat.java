package day02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����ת����SimpleDateFormat����
 * ���ã�ʵ�����ں��ַ���֮���ת��
 * ��ʽ��yyyy-MM-dd 2012-12-15
 * 		yy-MM-dd   12-12-30
 * 		yyyy-MM-dd hh:mm:ss 12-12-30 20:16:35
 */
public class TestSimpleDateFormat {
	public static void main(String[] args) throws ParseException {
		/**
		 * �ַ���ת��Ϊdate
		 * 1. ����SimpleDateformat
		 * 2. ��֪��ȡ���ڵĸ�ʽ
		 * 3. ���ã�parse
		 */
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String dateFormat = "2013-05-14";
		Date date = simpleDateFormat.parse(dateFormat);
		System.out.println(date);
		/**
		 * ���������������ת��Ϊ�ַ���
		 * ��ʽ����SimpleDateFormat��ʼ��ָ��
		 * ���ã�format
		 */
		Date date2 = new Date();
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String format = simpleDateFormat2.format(date2);
		System.out.println(format);
	}
}
