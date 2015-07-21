package day04;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈数据结构
 * Deque:双端队列
 * 		1. push : 压入 向栈中存入数据
 *      2. pop  : 弹出 从栈中取出数据
 *      3. peek : 获取栈顶元素 不出栈
 * 栈结构本着：后进先出的原则（FILO）
 * LinkedList实现了Deque接口
 * 
 * @author sunddenly
 *
 */
public class DemoStack {
	public static void main(String[] args) {
		/**
		 * 初始化不栈结
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
		 * 出栈：
		 * 		1. 在pop之前获取栈顶元素之前，先使用peek()方法验证是否为空
		 *      2. 不为空则pop，否则出现NoSuchElementException
		 */
		while(deque.peek()!=null){
			System.out.print(deque.pop()+", ");
		}
	}
	
	
}
