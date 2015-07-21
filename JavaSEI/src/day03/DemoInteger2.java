package day03;
/**
 * 包装类的常用功能
 * 1. 字符串转换，将字符串转换基本类型
 * 2. 调用parse()
 * 3. 字符串格式和类型要兼容
 * 4. 进制转换
 */
public class DemoInteger2 {
	public static void main(String[] args) {
		/*
		 * 字符串转换
		 */
		String numstr="123";
		int intNum = Integer.parseInt("123");
		long longNum = Long.parseLong(numstr);
		double DoubleNum = Double.parseDouble(numstr);
		
		System.out.println(intNum);
		System.out.println(longNum);
		System.out.println(DoubleNum);
		/*
		 * 进制转换字符串
		 */
		String bstr = Integer.toBinaryString(intNum);
		String hstr = Integer.toHexString(intNum);
		System.out.println(bstr);
		System.out.println(hstr);
		/**
		 * 所有包装类具有几个共同的常量
		 */
		int max=Integer.MAX_VALUE;
		int min=Integer.MIN_VALUE;
		System.out.println(Integer.toHexString(max));
		System.out.println(Integer.toHexString(min));
		
	}
}
