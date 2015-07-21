package day03;

import java.math.BigDecimal;

/**
 * BigDecimal
 *   ��ʾ�߾��ȵĸ�����
 *   java.Math.BigDecimal
 *   ���ã��߾��ȸ�������
 * 	 @author sunddenly
 * 	
 */
public class TestBigDecimal {
	public static void main(String[] args) {
		/*
		 * ����һ��BigDecimalʵ��
		 * new BigDecimal(String numberFormatString)
		 * ��һ���ַ�������һ����������Ϊ��������
		 */
		BigDecimal num1 = new BigDecimal("3.0");
		BigDecimal num2 = new BigDecimal("2.9");
		BigDecimal res = num1.subtract(num2);
		System.out.println(res);
		/*
		 * BigDecimal��������Ȼ��BigDecimal����
		 * 		1. ����ת�����κλ�������
		 * 		2. �п��ܶ�ʧ����
		 */
		float f = res.floatValue();
		int i = res.intValue();
		System.out.println(f);
		System.out.println(i);
		/*
		 * BigDecimal �������Ӽ��˳�����
		 * ע�������
		 * 	      1. ����������޲�ѡС��
		 * 		  2. ����ȡ��ģʽ������һֱ������ȥ
		 */
		/**
		 * ������������λ������������
		 */
		res=num1.divide(num2,9,BigDecimal.ROUND_HALF_UP);
		System.out.println(res);
		/*
		 * add���ӷ�
		 * multiply���˷�
		 */
	}
}
