package exception;

import java.text.ParseException;
import java.util.Date;

/**
 * 抛出异常规范
 * @author sunddenly
 *
 */
public class DemoCheckException {
	public static void main(String[] args) {
		
	}
	public  static Date stringToDate(String str) throws ParseException{
		if(str==null){
			//throw new NullPointerException("有错误");
			throw new ParseException("有错误", 0);
		}
		return null;
	}
}