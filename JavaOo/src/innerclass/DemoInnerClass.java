package innerclass;
/**
 * �ڲ������
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
		 * OutterClassName.this ��ʾ�����ⲿ�����
		 * �ڲ�������ⲿ�������
		 * ǰ���������+this
		 */
		public void sayAge(){
			DemoInnerClass.this.sayAge();
			System.out.println("inner"+age);
		}
	}
}
