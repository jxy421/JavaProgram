package day01;

public class TestEquals {
	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		/*
		 * == �Ƚ�˫����ֵ�Ƿ����
		 * p1��p2�������������͵ı��������������͵ı���������Ƕ���ľ��
		 * �����ַ��hashcode
		 */
		MyObject obj = new MyObject();
		if(p1.equals(obj)){
			System.out.println("����ֵ���");
		}else{
			System.out.println("����ֵ����ȣ�");
			System.out.println("��1��"+p1);
			System.out.println("��2��"+p2);
		}
	}
}
