package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * Map����
 * @author sunddenly
 * 1. ��ŵ�������Key-value��ʽ����
 * 2. ���ݿ����ظ���key������
 * 3. ���ظ�������ͬkey��value��ʵ����value�滻
 */
public class DemoMap {
	public static void main(String[] args) {
		/**
		 * ����Mapʹ�÷��ͣ�keyԼ����vauleԼ��
		 */
		Map<String, Point> map = new HashMap<String,Point>();
		map.put("1,2", new Point(1,2));
		map.put("3,4", new Point(3,4));
		/*
		 * Map���Ѿ������keyΪ��1��2����Ԫ��
		 * ���ٴ��Ը�key������ݣ���ôPoint(5��6)���滻֮ǰ��Point(1,2)
		 */
		map.put("1,2", new Point(5,6));
		System.out.println(map);//{3,4=Point [x=3, y=4], 1,2=Point [x=5, y=6]}
		/**
		 * ȡԪ��
		 * get(k key)
		 */
		Point point = map.get("1,2");
		System.out.println("x= "+point.getX()+" y= "+point.getY());
		/**
		 * ��������key������map�У�����null
		 * ���ԣ�ԭ���ϴ�map�л�ȡԪ��ʱ��Ҫ�ж��Ƿ��и�Ԫ��
		 * �����ָ���쳣
		 * 
		 * map�ڻ�ȡԪ��ʱ�ǳ��������
		 * �������ȡԪ��ʱ��Ҫ�����������ݣ���Map����Ҫ
		 * Map����Ҫ��ֻ�����key���ɻ�ȡԪ��
		 * 
		 * Խ���ĳ�������Խ�����Map���ܵ���list
		 * ͬ����һ��Ԫ�أ�listҪ��Map�죬�Լ���ȫ��������ʱ��listһ����Map��
		 * ��������ʱMap����Ҫ��������list��Ҫ����list����Map
		 * Mapά��һ��key
		 * 
		 */
	}
}
