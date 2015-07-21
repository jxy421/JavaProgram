package day02;

import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		
		/*
		 * 当前日期
		 * Sun Jul 19 17:53:01 CST 2015
		 */
		Date date = new Date();
		System.out.println(date);
		/**
		 * 1970到当前的毫秒：1437299581970
		 */
		long time = date.getTime();
		System.out.println(time);
		/**
		 * Long 最大值能走多少年
		 */
		long num=Long.MAX_VALUE;
		long year = num/1000/60/60/24/365+1970;
		System.out.println(year);
		/**
		 * 一天后的当前时间
		 */
		date.setTime(time+1000*3600*24);
		System.out.println(date);
		/**
		 * 
		 */
		int year1=date.getYear();
		System.out.println(year1+70);
	}
}
