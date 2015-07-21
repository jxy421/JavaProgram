package day03;
/**
 * final 类不能被继承子类，可以防止子类对父类的修改
 * final 方法，不能被子类覆盖
 * final 变量，只能被初始化一次，不能被修改
 * 常量： PI 直接数的代名词，是名字
 * 字面量： 直接写出的数值 3.1415926
 */
public class Demo08 {
	public double x=1.2;
	public static final double y=3.1;
	public static void main(String[] args) {
		
	}
//	public static void a(){
//		c();
//		double c=x;
//	}
	public void c(){
		double a=x;
		//a();
		double c=y;
	}
}
final class Soo{ 
	
}
