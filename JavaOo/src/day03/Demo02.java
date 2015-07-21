package day03;
/**
 * 方法动态绑定到，运行期间的对象方法
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		Moo moo=new Noo(); //父类型变量引用了子类型对象
		moo.test(); //父类型声明的方法，子类型重写的方法
		//动态绑定到Noo对象，执行Noo对象的方法
	}
}
class Moo{
	public void test(){
		System.out.println("Moo test");
	}
}
class Noo extends Moo{
	public void test(){
		System.out.println("Noo test");
	}
}
