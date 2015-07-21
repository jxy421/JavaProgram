package day04;
/**
 * �Զ���Ƚ�����ϰ
 * @author hdoop
 *
 */
import java.util.*;
public class DemoComparator {
	public static void main(String[] args) {
		/**
		 * ����һ���ַ�������
		 * �����д�ţ�"Tom","Jerry","Boos","Killer","Clark"
		 * ʹ����Ȼ����鿴������
		 * �Զ������������ĸ�����ں��棬��������
		 */
		List<String> list = new ArrayList<String>();
		list.add("Jim01");
		list.add("Tom");
		list.add("Jerry456");
		list.add("Killer");
		list.add("Clark");
		Comparator c=new Comparator<String>(){
			/**
			 * �Զ���Ƚ���
			 * @param o1
			 * @param o2
			 * @return
			 */
			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
			
		};
		System.out.println(list);
		Collections.sort(list,c);
		System.out.println(list);
	}
}
