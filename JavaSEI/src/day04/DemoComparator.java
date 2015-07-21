package day04;
/**
 * 自定义比较器练习
 * @author hdoop
 *
 */
import java.util.*;
public class DemoComparator {
	public static void main(String[] args) {
		/**
		 * 定义一个字符串集合
		 * 集合中存放："Tom","Jerry","Boos","Killer","Clark"
		 * 使用自然排序查看排序结果
		 * 自定义排序规则：字母长的在后面，进行排序
		 */
		List<String> list = new ArrayList<String>();
		list.add("Jim01");
		list.add("Tom");
		list.add("Jerry456");
		list.add("Killer");
		list.add("Clark");
		Comparator c=new Comparator<String>(){
			/**
			 * 自定义比较器
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
