package day03;

import java.math.BigInteger;

/**
 * BigInteger
 * 作用：可以保留更长位数的整数
 * 类包：java.math.BigInteger
 * @author hdoop
 *
 */
public class TestBigInteger {
	public static void main(String[] args) {
		/*
		 * BigInteger
		 * 支持用字符串描述更长位数的整数
		 * 创建BigInteger
		 */
		BigInteger num = new BigInteger("123456789000000000");
		System.out.println(num);
		/**
		 * BigInteger与Integer不同
		 * BigInteger.valueOf(long num)
		 * new BigInteger(String num)
		 * 注意，通过new来包装时，只能是字符串，不支持数字转换
		 */
		num=BigInteger.valueOf(12345678);
		/*
		 * 200阶乘
		 */
		num=BigInteger.valueOf(1);
		for(int i=1;i<=200;i++){
			num=num.multiply(BigInteger.valueOf(i));
		}
		System.out.println(num+"\n"+num.toString().length());
		/*
		 * 理论上：BigInteger存放的整数位数只受内存容量影响
		 */
	}
}
