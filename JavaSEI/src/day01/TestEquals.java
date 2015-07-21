package day01;

public class TestEquals {
	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		/*
		 * == 比较双方的值是否相等
		 * p1和p2是两个引用类型的变量，而引用类型的变量保存的是对象的句柄
		 * 对象地址的hashcode
		 */
		MyObject obj = new MyObject();
		if(p1.equals(obj)){
			System.out.println("两个值相等");
		}else{
			System.out.println("两个值不相等：");
			System.out.println("点1："+p1);
			System.out.println("点2："+p2);
		}
	}
}
