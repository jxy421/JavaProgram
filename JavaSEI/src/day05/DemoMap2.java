package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * Map 小应用
 * boolean contains(K key):当前Map中是否包含给定Key
 * boolean containsValue(V value):当前Map中是否包含给定的value
 * @author sunddenly
 *
 */
public class DemoMap2 {
	public static void main(String[] args) {
		/**
		 * 需求：统计每个数字出现的次数
		 */
		String str="123,456,789,456,789,225,698,759,456";
		Map<String, Integer> map = new HashMap<String,Integer>();
		String[] split = str.split(",");
		for(int i=0;i<split.length;i++){
			if(map.containsKey(split[i])){
//				Integer v = map.get(split[i]);
//				v+=1;
//				map.put(split[i], v);
				/**
				 * JDK 5以后可以自动拆装箱
				 */
				int sum=map.get(split[i]);
				sum+=1;
				map.put(split[i], sum);
			}else{
				map.put(split[i], 1);
			}
		}
		System.out.println(map.toString());
	}
}
