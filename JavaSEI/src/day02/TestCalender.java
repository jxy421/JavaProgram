package day02;

import java.util.Calendar;
import java.util.Date;

/**
 * ���������
 * 1. �����ڼ���
 * 2. ����ǧ�������
 * 3. ��Ҫ��ʾĳ�����ڻ�Ӧʹ��Date
 * 4. Calendar�ǿ��Խ���������ʱ��ת��ΪDate������getTime()����
 * @author hdoop
 *
 */
public class TestCalender {
	public static void main(String[] args) {
		/**
		 * ͨ����̬������ȡһ��ʵ��
		 * �÷������о���ʱ���������Ǵ���Calendarʵ��
		 * �÷�������ݵ�ǰϵͳ���ڵ���������ʱ��
		 * ע�⣺
		 * 		ʵ���ϸ��ݲ�ͬ�ĵ�����Calendar�����ɸ�����ʵ��
		 * 		��Calendar�����ǳ����࣬���ܱ�ʵ����
		 * 		���ǲ���Ҫ���Ĵ���ʵ������Ϊ�ĸ�����
		 * 		����ֻ��Ҫ����Calendar�涨�ķ�����ʹ�þͿ�����
		 */
		Calendar calendar=Calendar.getInstance();
		Date now = calendar.getTime();
		//Sun Jul 19 19:37:29 CST 2015
		System.out.println(now);
		/*
		 * ͨ�����������ʱ��
		 * calendar.set(field, value)
		 * field:ʱ�����,year
		 * value:��Ӧֵ
		 * 		 Calendar.YEAR�� ���
		 * 		 Calendar.MONTH���·�,��0��ʼ
		 * 		 Calendar.DAY_OF_MONTH���·���ڼ���
		 *       Calendar.DAY_OF_YEAR��  �����ڼ���
		 *       Calendar.DAY_OF_WEEK��  һ����ڼ���//���ڼ�����һ��������
		 *       
		 */
		calendar.set(Calendar.YEAR, 2012);//�������
		calendar.set(Calendar.MONTH,11);//�����·ݣ�ע���0��ʼ
		calendar.set(Calendar.DAY_OF_MONTH, 13);
		calendar.set(Calendar.DAY_OF_WEEK,2);//��������
		System.out.println(calendar.getTime());
		/**
		 * 22���������
		 */
		calendar.add(Calendar.DAY_OF_YEAR, 22);
		System.out.println("22�죺"+calendar.getTime());
		/**
		 * 5��ǰ������
		 */
		calendar.add(Calendar.DAY_OF_YEAR, -5);
		System.out.println("5�죺"+calendar.getTime());
		/**
		 * һ���º�
		 */
		calendar.add(Calendar.MONTH, 1);
		System.out.println("һ���£�"+calendar.getTime());
		/**
		 * 2012-02-29
		 * һ���
		 * 2013��2��û��29��
		 */
		calendar.set(Calendar.YEAR, 2012);
		calendar.set(Calendar.MONTH, 1);
		calendar.set(Calendar.DAY_OF_MONTH, 29);
		System.out.println(calendar.getTime());
		calendar.add(Calendar.YEAR, 1);
		System.out.println(calendar.getTime());
		
		/**
		 * ��ȡ��ǰ������ʾ�������е�ĳ��ʱ��
		 * ����get()
		 */
		calendar=Calendar.getInstance();
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;
		int day=calendar.get(calendar.DAY_OF_MONTH);
		System.out.println(year+"��"+month+"��"+day+"��");
	}
}
