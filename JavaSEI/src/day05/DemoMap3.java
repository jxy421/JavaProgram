package day05;

import java.util.*;

/**
 * Map遍历
 * 1. 迭代key
 *    1.1 Map获取key集合的方法：keySet()
 *    1.2 MaP获取Value集合的方法：ValueSet()
 * 2. 
 * @author sunddenly
 *
 */
public class DemoMap3 {
	public static void main(String[] args) {
		Map<String, Point> map = new LinkedHashMap<String,Point>();
		map.put("1,2", new Point(1,2));
		map.put("2,3", new Point(2,3));
		map.put("3,4", new Point(3,4));
		map.put("4,5", new Point(4,5));
		/**
		 * 获取当前Map中所有的Key
		 */
		Set<String> keySet = map.keySet();
		/**
		 * 根据所有key集合,遍历map中的value
		 */
		for (String key : keySet) {
			Point point = map.get(key);
			System.out.println("Key="+point.getX()+","+"Value"+point.getY());
		}
//		System.out.println("-------------------------------------");
//		for(Iterator<String> it=keySet.iterator();it.hasNext();){
//			String key=it.next();
//			Point point = map.get(key);
//			System.out.println("Key="+point.getX()+","+"Value"+point.getY());
//		}
	}
}
