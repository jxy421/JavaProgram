package day03;

import java.util.ArrayList;
import java.util.List;

import day01.Point;

/**
 * ����ArrayList
 * @author sunddenly
 *
 */
public class TestList2 {
	public static void main(String[] args) {
		List list = new ArrayList();
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		Point p3 = new Point(2,3);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		System.out.println(list);
		/**
		 * contains(Object obj)
		 * 1. ����������obj�Ƿ񱻰����ڼ�����
		 * 2. �����򣺽�obj�뼯���е�ÿһ���������equals�Ƚ�
		 */
		Point p = new Point(1,2);
		System.out.println("p���ϴ�����"+list.contains(p));
		list.remove(p);
		list.remove(p);
		System.out.println(list);
	}
}
