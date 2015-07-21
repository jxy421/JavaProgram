package day03;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ȡ��������
 * @author hdoop
 *
 */
public class TestListSubList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		/**
		 * ����һ�����ϣ��򼯺ϴ��0-9������
		 */
		for(int i=0;i<10;i++){
			list.add(i);
		}
		System.out.println(list);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		/**
		 * ȡ�Ӽ���3-7��
		 * subList(fromIndex, toIndex)
		 * ��ͷ����β
		 */
		List<Integer> subList = list.subList(3, 8);
		System.out.println(subList);//[3, 4, 5, 6, 7]
		/**
		 * ���������Լ���Ԫ�ؽ����޸Ļ᲻��Ӱ��ԭ���ļ���?
		 * ע�⣺
		 * 	   �����ڻ�ȡ�Ӽ��������Ӽ�Ԫ�ؽ����޸ģ���Ӱ��ԭ���ļ���Ԫ��
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
