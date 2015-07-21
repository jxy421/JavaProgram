package day04;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet�ص�
 * @author sunddenly
 *
 */
public class DemoHashSet2 {
	public static void main(String[] args) {
		/**
		 * ����һ��set���ϣ�����������Pointʵ��
		 */
		Set<Point> set = new HashSet<Point>();
		/**
		 * ������������һ���Ķ���
		 */
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		System.out.println("p1��p2�Ƿ�Ϊͬһ����"+(p1==p2));
		System.out.println("p1��p2�����Ƿ�һ��"+p1.equals(p2));
		System.out.println("p1��p2��hashcode�Ƿ�һ��"+(p1.hashCode()==p2.hashCode()));
		/**
		 * ��������д��Point��equals��hashcode�������֣�
		 * ��Ȼp1��p2���������󣬵��ǵ����ǽ�����ͬʱ���뼯��ʱ��
		 * p2����û�б���ӽ����ϡ���Ϊp1�ڷ����
		 * p2����ʱ����p2��hashCode�����λ����ͬ��
		 * ��p2���λ�õ�p1��equals�Ƚ�Ϊtrue��
		 *  hashSet��Ϊ�ö����Ѿ����ڣ����Ծܾ���p2���뼯��
		 */
		set.add(p1);
		set.add(p2);
		System.out.println("Ԫ������"+set.size());
		for (Point p : set) {
			System.out.println(p);
		}
		/**
		 * ��д    ��equals()
		 * ����д ��hashcode()
		 */
		Point1 p11 = new Point1(1,2);
		Point1 p12 = new Point1(1,2);
		Point1 p13 = new Point1(1,2);
		Set<Point1> set1 = new HashSet<Point1>();
		set1.add(p11);
		set1.add(p12);
		System.out.println("Ԫ������"+set1.size());
		System.out.println(set1.contains(p11));
		System.out.println(set1.contains(p13));
		System.out.println(set1);
		/**
		 * ��д��hashcode()
		 * ����д��equals()
		 */
		Point2 p21 = new Point2(1,2);
		Point2 p22 = new Point2(1,2);
		Point2 p23 = new Point2(1,2);
		Set<Point2> set2 = new HashSet<Point2>();
		set2.add(p21);
		set2.add(p22);
		System.out.println("Ԫ������"+set2.size());
		System.out.println(set2.contains(p21));
		System.out.println(set2.contains(p23));
		System.out.println(set2);
	}
}
