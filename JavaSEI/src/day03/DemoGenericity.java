package day03;

import java.util.ArrayList;
import java.util.Iterator;

import day01.Point;

/**
 * ����
 * @author hdoop
 *
 */
public class DemoGenericity {
	public static void main(String[] args) {
		/**
		 * 1. ��Ԫ�ط��뼯���к�
		 * 2. �������ͽ��ᱻ����
		 * 3. ����Ԫ��ʱ��Ҫǿ������ת��
		 * 4. ǿ������ת�����ڰ�ȫ�����������Ǽ����з��˲�ͬ���͵�Ԫ��
		 * 5. Ϊ��Ӧ�԰�ȫ��������Ҫ��instance of�����ж�
		 * 6. ���������
		 */
//		ArrayList list = new ArrayList();
//		list.add(new Point(1,2));
//		list.add(new Point(3,4));
//		list.add(new Point(5,6));
//		list.add("jjj");
//		for (Object obj : list) {
//			Point p=(Point) obj;
//			System.out.println(p.getX());
//		}
		/**
		 * ArrayList ֧�ַ��ͻ���
		 * public class ArrayList<E>{
		 * 		.....
		 * 		public boolean add(E e){}
		 * 		public E get (int index){}
		 * }
		 */
		ArrayList<Point> list1 = new ArrayList<Point>();
		list1.add(new Point(1,2));
		list1.add(new Point(3,4));
		list1.add(new Point(5,6));
		//list1.add("jjj");�������
		for (Point point : list1) {
			System.out.println(point);
		}
		/**
		 * Iterator ���͵�����
		 * Iterator<E>
		 */
		Iterator<Point> it=list1.iterator();
		while(it.hasNext()){
			Point p = it.next();
			System.out.println(p);
		}
		
	}
}
