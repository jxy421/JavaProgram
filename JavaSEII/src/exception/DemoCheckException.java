package exception;

import java.text.ParseException;
import java.util.Date;

/**
 * �׳��쳣�淶
 * @author sunddenly
 *
 */
public class DemoCheckException {
	public static void main(String[] args) {
		
	}
	public  static Date stringToDate(String str) throws ParseException{
		if(str==null){
			//throw new NullPointerException("�д���");
			throw new ParseException("�д���", 0);
		}
		return null;
	}
}