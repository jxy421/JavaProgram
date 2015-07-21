package day02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期转化类SimpleDateFormat测试
 * 作用：实现日期和字符串之间的转换
 * 格式：yyyy-MM-dd 2012-12-15
 * 		yy-MM-dd   12-12-30
 * 		yyyy-MM-dd hh:mm:ss 12-12-30 20:16:35
 */
public class TestSimpleDateFormat {
	public static void main(String[] args) throws ParseException {
		/**
		 * 字符串转换为date
		 * 1. 创建SimpleDateformat
		 * 2. 告知读取日期的格式
		 * 3. 调用：parse
		 */
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String dateFormat = "2013-05-14";
		Date date = simpleDateFormat.parse(dateFormat);
		System.out.println(date);
		/**
		 * 反向操作：将日期转换为字符串
		 * 格式：由SimpleDateFormat初始化指定
		 * 调用：format
		 */
		Date date2 = new Date();
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String format = simpleDateFormat2.format(date2);
		System.out.println(format);
	}
}
