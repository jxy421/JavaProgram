package day03;

import java.util.ArrayList;
import java.util.Iterator;

import day01.Point;

/**
 * 泛型
 * @author hdoop
 *
 */
public class DemoGenericity {
	public static void main(String[] args) {
		/**
		 * 1. 将元素放入集合中后
		 * 2. 数据类型将会被忘记
		 * 3. 访问元素时需要强制类型转换
		 * 4. 强制类型转换存在安全隐患，尤其是集合中放了不同类型的元素
		 * 5. 为了应对安全隐患，需要用instance of进行判断
		 * 6. 增加灵活性
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
		 * ArrayList 支持泛型机制
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
		//list1.add("jjj");编译错误
		for (Point point : list1) {
			System.out.println(point);
		}
		/**
		 * Iterator 泛型迭代器
		 * Iterator<E>
		 */
		Iterator<Point> it=list1.iterator();
		while(it.hasNext()){
			Point p = it.next();
			System.out.println(p);
		}
		
	}
}
