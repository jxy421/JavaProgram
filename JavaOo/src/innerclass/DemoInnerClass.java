package innerclass;
/**
 * 内部类测试
 * @author sunddenly
 *
 */
public class DemoInnerClass {
	private int age;
	public static void main(String[] args) {
		DemoInnerClass obj = new DemoInnerClass();
		obj.sayAge();
		Inner inner = obj.new Inner();
		inner.sayAge();
	}
	public void sayAge(){
		System.out.println("DemoInnerClass"+age);
	}
	class Inner{
		/**
		 * OutterClassName.this 表示的是外部类对象
		 * 内部类调用外部类的属性
		 * 前面加上类名+this
		 */
		public void sayAge(){
			DemoInnerClass.this.sayAge();
			System.out.println("inner"+age);
		}
	}
}
