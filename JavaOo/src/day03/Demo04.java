package day03;
/**
 * ���԰󶨵����������ͣ��ɱ��������;��������ĸ�����
 * �����󶨵������ɶ�������;��������ĸ�����
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
	String name="��̫��";
	public void whoau(){
		System.out.println(this.name);
	}
}
class Cheater extends Person{
	String name="ϲ����";
	public void whoau(){
		System.out.println(this.name);
	}
}
