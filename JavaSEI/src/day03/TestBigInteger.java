package day03;

import java.math.BigInteger;

/**
 * BigInteger
 * ���ã����Ա�������λ��������
 * �����java.math.BigInteger
 * @author hdoop
 *
 */
public class TestBigInteger {
	public static void main(String[] args) {
		/*
		 * BigInteger
		 * ֧�����ַ�����������λ��������
		 * ����BigInteger
		 */
		BigInteger num = new BigInteger("123456789000000000");
		System.out.println(num);
		/**
		 * BigInteger��Integer��ͬ
		 * BigInteger.valueOf(long num)
		 * new BigInteger(String num)
		 * ע�⣬ͨ��new����װʱ��ֻ�����ַ�������֧������ת��
		 */
		num=BigInteger.valueOf(12345678);
		/*
		 * 200�׳�
		 */
		num=BigInteger.valueOf(1);
		for(int i=1;i<=200;i++){
			num=num.multiply(BigInteger.valueOf(i));
		}
		System.out.println(num+"\n"+num.toString().length());
		/*
		 * �����ϣ�BigInteger��ŵ�����λ��ֻ���ڴ�����Ӱ��
		 */
	}
}
