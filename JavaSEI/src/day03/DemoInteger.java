package day03;

public class DemoInteger {
	public static void   main(String[] args) {
		DemoInteger demo = new DemoInteger();
		say(demo);
		int a=1;
		
		//say(a);
		/**
		 * Integer int���Ͱ�װ��
		 * ���ã���һ��int����һ��objectȥ����
		 * װ�䣺 new Integer()
		 * 	    Integer.valueOf()
		 * ���䣺 i.intValue();
		 */
		Integer i = new Integer(a);
		Integer ii = Integer.valueOf(a);
		int num=i.intValue();
	}
	public static void say(Object obj){
		System.out.println(obj);
	}
}
