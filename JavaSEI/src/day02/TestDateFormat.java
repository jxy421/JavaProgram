package day02;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDateFormat {
	public static void main(String[] args) {
		/**
		 * getDateInstance(style, aLocale)
		 * style:   ���ڸ�ʽ
		 * alocale: ������Ϣ
		 */
		Date date = new Date();
		DateFormat format = DateFormat.getDateInstance(DateFormat.DATE_FIELD,Locale.CANADA);
		System.out.println(format.format(date));
		
	}
}
