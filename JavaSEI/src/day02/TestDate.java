package day02;

import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		
		/*
		 * ��ǰ����
		 * Sun Jul 19 17:53:01 CST 2015
		 */
		Date date = new Date();
		System.out.println(date);
		/**
		 * 1970����ǰ�ĺ��룺1437299581970
		 */
		long time = date.getTime();
		System.out.println(time);
		/**
		 * Long ���ֵ���߶�����
		 */
		long num=Long.MAX_VALUE;
		long year = num/1000/60/60/24/365+1970;
		System.out.println(year);
		/**
		 * һ���ĵ�ǰʱ��
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
