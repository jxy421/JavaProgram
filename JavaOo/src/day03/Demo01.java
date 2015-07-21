package day03;
/**
 * 1. 递归加载所有类，搭配方法区
 * 2. 分配父子类型的内存（实例变量）
 * 3. 递归调用构造器
 */
public class Demo01 {
	public static void main(String[] args) {
		Goo goo = new Goo();
		System.out.println(goo.a+","+goo.b+","+goo.c);
	}
}
class Foo{
	int a=1;
	public Foo(){
		a=5;
	}
}
class Koo extends Foo{
	int b=2;
	public Koo(){
		super();
		a=7;
		b=6;
	}
}
class Goo extends Koo{
	int c=3;
	public Goo(){
		super();
		a=8;
		b=9;
		c=10;
	}
}
