package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * Map测试
 * @author sunddenly
 * 1. 存放的数据以Key-value形式保存
 * 2. 数据可以重复，key不可以
 * 3. 若重复保存相同key的value，实际是value替换
 */
public class DemoMap {
	public static void main(String[] args) {
		/**
		 * 创建Map使用泛型，key约束，vaule约束
		 */
		Map<String, Point> map = new HashMap<String,Point>();
		map.put("1,2", new Point(1,2));
		map.put("3,4", new Point(3,4));
		/*
		 * Map中已经存放了key为“1，2”的元素
		 * 若再次以该key存放数据，那么Point(5，6)会替换之前的Point(1,2)
		 */
		map.put("1,2", new Point(5,6));
		System.out.println(map);//{3,4=Point [x=3, y=4], 1,2=Point [x=5, y=6]}
		/**
		 * 取元素
		 * get(k key)
		 */
		Point point = map.get("1,2");
		System.out.println("x= "+point.getX()+" y= "+point.getY());
		/**
		 * 若给定的key不存在map中，返回null
		 * 所以，原则上从map中获取元素时，要判断是否有该元素
		 * 避免控指针异常
		 * 
		 * map在获取元素时非常有针对性
		 * 集合项获取元素时需要遍历集合内容，而Map不需要
		 * Map不需要，只需给定key即可获取元素
		 * 
		 * 越灵活的程序性能越差，所以Map性能低于list
		 * 同样拿一个元素，list要比Map快，对集合全遍历访问时，list一定比Map快
		 * 但做查找时Map不需要遍历，而list需要所以list不如Map
		 * Map维护一个key
		 * 
		 */
	}
}
