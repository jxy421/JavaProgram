package exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * throws 关键字
 * 生命抛出异常的种类
 * 作用是通知调用者必须捕获异常
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
	 * 字符串转换为一个Date对象返回
	 * @param str yyyy-MM-dd形式的字符串
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
