package day03;
/**
 * 静态变量
 * 1. 静态变量在类加载期间初始化，存在方法区中
 * 2. 是全体对象共享的一份变量
 * 3. 经常使用类名访问静态变量
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		Cat c1=new Cat(5);
		Cat c2=new Cat(6);
		System.out.println(c1.age+","+c2.age+","+Cat.numOfCats);
	}
}
class Cat{
	int age; //实例变量，每个对象一份
	static int numOfCats=0;//静态变量，只有一份
	public Cat(int age){
		this.age=age;
		numOfCats++;
	}
}

