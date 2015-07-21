package day03;
/**
 * 重载和重写的差别
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		Woo w = new Woo();
		Super s = new Sub();
		w.t(s);//重载的方法调用由，参数s类型Super决定，与对象Sub无关
	}
}
class Woo{
	public void t(Super obj){
		System.out.println("Goo t(Super)");
		obj.s();
	}
	public void t(Sub obj){
		System.out.println("Goo t(Sub)");
		obj.s();
	}
}
class Super{
	public void s(){
		System.out.println("Super s()");
	}
}
class Sub extends Super{
	public void s(){
		System.out.println("Sub s()");
	}
}
