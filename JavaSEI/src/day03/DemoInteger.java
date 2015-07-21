package day03;

public class DemoInteger {
	public static void   main(String[] args) {
		DemoInteger demo = new DemoInteger();
		say(demo);
		int a=1;
		
		//say(a);
		/**
		 * Integer int类型包装类
		 * 作用：将一个int当作一个object去看待
		 * 装箱： new Integer()
		 * 	    Integer.valueOf()
		 * 拆箱： i.intValue();
		 */
		Integer i = new Integer(a);
		Integer ii = Integer.valueOf(a);
		int num=i.intValue();
	}
	public static void say(Object obj){
		System.out.println(obj);
	}
}
