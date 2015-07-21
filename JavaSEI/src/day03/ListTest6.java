package day03;

import java.util.ArrayList;

import day01.Point;

/**
 * 集合toArray()
 * @author hdoop
 *
 */
public class ListTest6 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Point(1,2));
		list.add(new Point(2,3));
		/**
		 * list.toArray()
		 * 1. 转换成数组
		 * 2. 访问元素要类型转换
		 */
		Object[] array = list.toArray();
		for (Object object : array) {
			Point p=(Point)object;
			System.out.println("x: "+p.getX()+" Y: "+p.getY());
		}
		/**
		 * list.toArray(new type[])
		 * 1. 转换成数组
		 * 2. 访问数组元素不需要类型转换
		 */
		Point[] array2 = (Point[])list.toArray(new Point[0]);
		for (Point point : array2) {
			System.out.println("X:"+point.getX()+" Y:"+point.getY());
		}
	}
}
