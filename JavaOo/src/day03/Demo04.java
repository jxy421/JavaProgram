package day03;
/**
 * 属性绑定到变量的类型，由变量的类型决定访问哪个属性
 * 方法绑定到对象，由对象的类型决定访问哪个方法
 */
public class Demo04 {
	public static void main(String[] args) {
		Cheater c = new Cheater();
		Person p=c;
		System.out.println(p.name+","+c.name);
		p.whoau();
		c.whoau();
	}
}
class Person{
	String name="灰太狼";
	public void whoau(){
		System.out.println(this.name);
	}
}
class Cheater extends Person{
	String name="喜羊羊";
	public void whoau(){
		System.out.println(this.name);
	}
}
