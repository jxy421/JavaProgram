package day05;

import java.util.*;
import java.util.Map.Entry;

/**
 * 迭代Map的方式2
 * 以键值对的方式进行迭代
 * 
 * map支持另一个方法entrySet()
 * 该方法返回一个Set集合，里面的元素是Map中的每一组键值对
 * map以Entry类的实例来描述每一个键值对
 * 
 * Entry描述一个键值对
 * 		1. getKey()
 * 		2. getValule()
 * @author sunddenly
 */
public class DemoHashMap {
	public static void main(String[] args) {
		Map<String, Point> map = new LinkedHashMap<String,Point>();
		map.put("1,2", new Point(1,2));
		map.put("2,3", new Point(2,3));
		map.put("3,4", new Point(3,4));
		map.put("4,5", new Point(4,5));
		/**
		 * 使用entrySet()遍历Map
		 * 获取map中的所有 键值对
		 * Set的泛型不会变，就是Entry
		 */
		Set<Entry<String, Point>> entrySet = map.entrySet();
		for (Entry<String, Point> entry : entrySet) {
			//获取key
			String key = entry.getKey();
			//获取value
			Point value = entry.getValue();
			System.out.println(key+" : "+value.getX()+","+value.getY());
		}
		
	}
}
