package day02;

import java.util.Calendar;
import java.util.Date;

/**
 * 日历类测试
 * 1. 简化日期计算
 * 2. 避免千年虫问题
 * 3. 想要表示某个日期还应使用Date
 * 4. Calendar是可以将其描述的时间转化为Date，调用getTime()即可
 * @author hdoop
 *
 */
public class TestCalender {
	public static void main(String[] args) {
		/**
		 * 通过静态方法获取一个实例
		 * 该方法自行决定时区，帮我们创建Calendar实例
		 * 该方法会根据当前系统所在地区来决定时区
		 * 注意：
		 * 		实际上根据不同的地区，Calendar有若干个子类实现
		 * 		而Calendar本身是抽象类，不能被实例化
		 * 		我们不需要关心创建实例具体为哪个子类
		 * 		我们只需要根据Calendar规定的方法来使用就可以了
		 */
		Calendar calendar=Calendar.getInstance();
		Date now = calendar.getTime();
		//Sun Jul 19 19:37:29 CST 2015
		System.out.println(now);
		/*
		 * 通过日历类计算时间
		 * calendar.set(field, value)
		 * field:时间分量,year
		 * value:对应值
		 * 		 Calendar.YEAR： 年份
		 * 		 Calendar.MONTH：月份,从0开始
		 * 		 Calendar.DAY_OF_MONTH：月份里第几天
		 *       Calendar.DAY_OF_YEAR：  年份里第几天
		 *       Calendar.DAY_OF_WEEK：  一周里第几天//星期几，第一天是周日
		 *       
		 */
		calendar.set(Calendar.YEAR, 2012);//设置年份
		calendar.set(Calendar.MONTH,11);//设置月份，注意从0开始
		calendar.set(Calendar.DAY_OF_MONTH, 13);
		calendar.set(Calendar.DAY_OF_WEEK,2);//设置日期
		System.out.println(calendar.getTime());
		/**
		 * 22天后是哪天
		 */
		calendar.add(Calendar.DAY_OF_YEAR, 22);
		System.out.println("22天："+calendar.getTime());
		/**
		 * 5天前是哪天
		 */
		calendar.add(Calendar.DAY_OF_YEAR, -5);
		System.out.println("5天："+calendar.getTime());
		/**
		 * 一个月后
		 */
		calendar.add(Calendar.MONTH, 1);
		System.out.println("一个月："+calendar.getTime());
		/**
		 * 2012-02-29
		 * 一年后
		 * 2013年2月没有29号
		 */
		calendar.set(Calendar.YEAR, 2012);
		calendar.set(Calendar.MONTH, 1);
		calendar.set(Calendar.DAY_OF_MONTH, 29);
		System.out.println(calendar.getTime());
		calendar.add(Calendar.YEAR, 1);
		System.out.println(calendar.getTime());
		
		/**
		 * 获取当前日历表示的日期中的某个时间
		 * 调用get()
		 */
		calendar=Calendar.getInstance();
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;
		int day=calendar.get(calendar.DAY_OF_MONTH);
		System.out.println(year+"年"+month+"月"+day+"日");
	}
}
