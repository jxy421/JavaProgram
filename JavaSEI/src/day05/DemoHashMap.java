package day05;

import java.util.*;
import java.util.Map.Entry;

/**
 * ����Map�ķ�ʽ2
 * �Լ�ֵ�Եķ�ʽ���е���
 * 
 * map֧����һ������entrySet()
 * �÷�������һ��Set���ϣ������Ԫ����Map�е�ÿһ���ֵ��
 * map��Entry���ʵ��������ÿһ����ֵ��
 * 
 * Entry����һ����ֵ��
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
		 * ʹ��entrySet()����Map
		 * ��ȡmap�е����� ��ֵ��
		 * Set�ķ��Ͳ���䣬����Entry
		 */
		Set<Entry<String, Point>> entrySet = map.entrySet();
		for (Entry<String, Point> entry : entrySet) {
			//��ȡkey
			String key = entry.getKey();
			//��ȡvalue
			Point value = entry.getValue();
			System.out.println(key+" : "+value.getX()+","+value.getY());
		}
		
	}
}
