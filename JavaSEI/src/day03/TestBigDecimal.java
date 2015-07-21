package day03;

import java.math.BigDecimal;

/**
 * BigDecimal
 *   表示高精度的浮点型
 *   java.Math.BigDecimal
 *   作用：高精度浮点运算
 * 	 @author sunddenly
 * 	
 */
public class TestBigDecimal {
	public static void main(String[] args) {
		/*
		 * 创建一个BigDecimal实例
		 * new BigDecimal(String numberFormatString)
		 * 用一个字符串描述一个浮点数作为参数传入
		 */
		BigDecimal num1 = new BigDecimal("3.0");
		BigDecimal num2 = new BigDecimal("2.9");
		BigDecimal res = num1.subtract(num2);
		System.out.println(res);
		/*
		 * BigDecimal计算结果依然是BigDecimal类型
		 * 		1. 可以转换成任何基本类型
		 * 		2. 有可能丢失精度
		 */
		float f = res.floatValue();
		int i = res.intValue();
		System.out.println(f);
		System.out.println(i);
		/*
		 * BigDecimal 可以做加减乘除运算
		 * 注意除法：
		 * 	      1. 结果存在无限不选小数
		 * 		  2. 定制取舍模式，否则一直计算下去
		 */
		/**
		 * 保留给定精度位数后四舍五入
		 */
		res=num1.divide(num2,9,BigDecimal.ROUND_HALF_UP);
		System.out.println(res);
		/*
		 * add：加法
		 * multiply：乘法
		 */
	}
}
