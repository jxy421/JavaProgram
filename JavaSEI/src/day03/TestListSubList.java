package day03;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取集合子类
 * @author hdoop
 *
 */
public class TestListSubList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		/**
		 * 创建一个集合，向集合存放0-9的数字
		 */
		for(int i=0;i<10;i++){
			list.add(i);
		}
		System.out.println(list);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		/**
		 * 取子集（3-7）
		 * subList(fromIndex, toIndex)
		 * 含头不含尾
		 */
		List<Integer> subList = list.subList(3, 8);
		System.out.println(subList);//[3, 4, 5, 6, 7]
		/**
		 * 若对我们自己的元素进行修改会不会影响原来的集合?
		 * 注意：
		 * 	   我们在获取子集后，若对子集元素进行修改，会影响原来的集合元素
		 */
		for(int i=0;i<subList.size();i++){
			Integer element = subList.get(i);
			element*=10;
			subList.set(i,element);
			//subList.set(i, subList.get(i)*10);
		}
		System.out.println(subList);//[30, 40, 50, 60, 70]
		System.out.println(list);//[0, 1, 2, 30, 40, 50, 60, 70, 8, 9]
		
	}
}
