package day03;
/**
 * ��װ��ĳ��ù���
 * 1. �ַ���ת�������ַ���ת����������
 * 2. ����parse()
 * 3. �ַ�����ʽ������Ҫ����
 * 4. ����ת��
 */
public class DemoInteger2 {
	public static void main(String[] args) {
		/*
		 * �ַ���ת��
		 */
		String numstr="123";
		int intNum = Integer.parseInt("123");
		long longNum = Long.parseLong(numstr);
		double DoubleNum = Double.parseDouble(numstr);
		
		System.out.println(intNum);
		System.out.println(longNum);
		System.out.println(DoubleNum);
		/*
		 * ����ת���ַ���
		 */
		String bstr = Integer.toBinaryString(intNum);
		String hstr = Integer.toHexString(intNum);
		System.out.println(bstr);
		System.out.println(hstr);
		/**
		 * ���а�װ����м�����ͬ�ĳ���
		 */
		int max=Integer.MAX_VALUE;
		int min=Integer.MIN_VALUE;
		System.out.println(Integer.toHexString(max));
		System.out.println(Integer.toHexString(min));
		
	}
}
