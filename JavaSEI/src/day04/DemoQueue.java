package day04;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ���ݽṹ����
 * @author sunddenly
 * Queue�ӿ�: 
 * 			1. offer(): ��Ԫ�ط������
 * 			2. poll():  �Ӷ�����ȡ��Ԫ�أ�ȡ��������Ž�ȥ��
 * 			3. peek():  ȡ����Ԫ�أ�����ɾ��Ԫ��
 * 			3. ���б����Ƚ��ȳ���ԭ��������FIFO
 * 			4. ���в�֧�ֲ��
 * 
 * LinkedList���Ƕ��е�����
 *          
 */

public class DemoQueue {
	public static void main(String[] args) {
		/**
		 * 1. ����һ��LinkedListʵ��
		 * 2. ���䵱������������
		 * 3. ����������ҲӦ��֮���һ���������͵�����
		 */
		/*
		 * ��Ԫ�ط�����У�offer()
		 * 
		 */
		Queue<String> queue = new LinkedList<String>();
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		System.out.println(queue);
		/*
		 * peek()
		 * �鿴����Ԫ��,������
		 */
		System.out.println("���ף�"+queue.peek());
		/*
		 * ����ȡԪ�أ�poll()
		 * 1. ȡ����������Ž�ȥ��
		 * 2. ȡ���󣬸�Ԫ�ػ�Ӷ�����ɾ��
		 */
		String element=null;
		while((element=queue.poll())!=null){
			System.out.print(element+" ,");
		}
		
		
		
	}
	
}
