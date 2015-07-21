package day04;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 数据结构队列
 * @author sunddenly
 * Queue接口: 
 * 			1. offer(): 将元素放入队列
 * 			2. poll():  从队列里取出元素，取得是最早放进去的
 * 			3. peek():  取队首元素，但不删除元素
 * 			3. 队列本着先进先出的原则存放数据FIFO
 * 			4. 队列不支持插队
 * 
 * LinkedList就是队列的子类
 *          
 */

public class DemoQueue {
	public static void main(String[] args) {
		/**
		 * 1. 创建一个LinkedList实例
		 * 2. 将其当作队列来看待
		 * 3. 队列中我们也应该之存放一种数据类型的数据
		 */
		/*
		 * 将元素放入队列：offer()
		 * 
		 */
		Queue<String> queue = new LinkedList<String>();
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		System.out.println(queue);
		/*
		 * peek()
		 * 查看队首元素,不出队
		 */
		System.out.println("队首："+queue.peek());
		/*
		 * 队列取元素：poll()
		 * 1. 取出的是最早放进去的
		 * 2. 取出后，该元素会从队列中删除
		 */
		String element=null;
		while((element=queue.poll())!=null){
			System.out.print(element+" ,");
		}
		
		
		
	}
	
}
