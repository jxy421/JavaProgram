package day04;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ջ���ݽṹ
 * Deque:˫�˶���
 * 		1. push : ѹ�� ��ջ�д�������
 *      2. pop  : ���� ��ջ��ȡ������
 *      3. peek : ��ȡջ��Ԫ�� ����ջ
 * ջ�ṹ���ţ�����ȳ���ԭ��FILO��
 * LinkedListʵ����Deque�ӿ�
 * 
 * @author sunddenly
 *
 */
public class DemoStack {
	public static void main(String[] args) {
		/**
		 * ��ʼ����ջ��
		 */
		Deque<Character> deque=new LinkedList<Character>();
		for(int i=0;i<5;i++){
			deque.push((char)('A'+i));
		}
		System.out.println(deque);
		
//		Character ch=null;
//		while(((ch=deque.pop())!=null)){
//			System.out.println(ch);
//		}
		/**
		 * ��ջ��
		 * 		1. ��pop֮ǰ��ȡջ��Ԫ��֮ǰ����ʹ��peek()������֤�Ƿ�Ϊ��
		 *      2. ��Ϊ����pop���������NoSuchElementException
		 */
		while(deque.peek()!=null){
			System.out.print(deque.pop()+", ");
		}
	}
	
	
}
