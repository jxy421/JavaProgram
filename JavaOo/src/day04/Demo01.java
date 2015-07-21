package day04;

public class Demo01 {
	public static void main(String[] args) {
		new Goo();
		new Goo();
	}
}
class Goo{
	{//代码块，在创建对象的时候执行，类似于构造器的作用
		System.out.println("Hi");
	}
	static{//静态代码块，在类夹在其间执行，只执行一次
		System.out.println("loading Goo.class");
	}//系统第三方资源
}