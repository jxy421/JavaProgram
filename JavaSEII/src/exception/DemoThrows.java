package exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * throws �ؼ���
 * �����׳��쳣������
 * ������֪ͨ�����߱��벶���쳣
 * @author sunddenly
 *
 */
public class DemoThrows {
	public static void main(String[] args) throws ParseException {
//			try {
				Date date = stringToDate("weqwqe2013-05-20sds");
				System.out.println(date);
//			} catch (ParseException e) {
//				e.printStackTrace();
//			}
	}
	/**
	 * �ַ���ת��Ϊһ��Date���󷵻�
	 * @param str yyyy-MM-dd��ʽ���ַ���
	 * @return
	 * @throws ParseException 
	 */
	public static Date stringToDate(String str) throws ParseException{
		SimpleDateFormat format=
				new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(str);
		return date;
	}
}
