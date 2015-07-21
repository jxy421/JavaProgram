package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * Map СӦ��
 * boolean contains(K key):��ǰMap���Ƿ��������Key
 * boolean containsValue(V value):��ǰMap���Ƿ����������value
 * @author sunddenly
 *
 */
public class DemoMap2 {
	public static void main(String[] args) {
		/**
		 * ����ͳ��ÿ�����ֳ��ֵĴ���
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
				 * JDK 5�Ժ�����Զ���װ��
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
