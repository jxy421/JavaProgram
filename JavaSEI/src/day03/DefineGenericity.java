package day03;

import java.util.ArrayList;

/**
 * �Զ��巺��
 * 
 * @author sunddenly 1. ���Զ�̬�ı����ͣ����ӳ���������
 * 
 */
public class DefineGenericity {
	public static void main(String[] args) {
		// Point<Integer> p1 = new Point<Integer>(1, 1);
		// Point<Long> p2 = new Point<Long>(1l, 2l);
		// Point<Double> p3 = new Point<Double>(1.5, 1.5);
		// System.out.println(p1);
		// System.out.println(p2);
		// System.out.println(p3);
		Point2<Long, Integer, String> p = new Point2<Long, Integer, String>(1l,
				2, "3");
		Point2<Long, Integer, String> p21 = new Point2<Long, Integer, String>(
				1l, 2, "3");
		Point2<Long, Integer, String> p22 = new Point2<Long, Integer, String>(
				2l, 2, "3");
		ArrayList<Point2<Long, Integer, String>> list = new ArrayList<Point2<Long, Integer, String>>();
		list.add(p21);
		list.add(p22);
		/**
		 * ʹ����ѭ����������
		 * 
		 * ע�⣺ 1. ����ʹ����ѭ����Ӧ��Ϊ�䶨�巺�� 2. ��������ֻ��ʹ��Object������Ԫ�ص����� 3. ͨ������¶�Ҫʹ�÷��� 4.
		 * ��ѭ������������Ҫ���ݼ����е�Ԫ������
		 */

		System.out.println(list.contains(p));
		for (Point2<Long, Integer, String> point2 : list) {
			System.out.println(point2);
		}
	}
}
