package day01;
/**
 * StringBuilder测试
 * @author hdoop
 */
public class TestStringBuiler {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		/**
		 * 向字符串追加内容
		 * append是有返回值的，返回类型是StringBuilder
		 * 而返回的这个StrigBuilder其实就是自己（this）
		 */
		builder.append("大家好!")
		.append("我是Sunddenly ")
		.append("I love Java");
		System.out.println(builder.toString());
		/**
		 * insert(int pos,string str)
		 * 在当前字符串中的指定位置插入字符串
		 * pos为从0开始的插入位置，元内容往后移
		 */
		builder.insert(4, "!");
		System.out.println(builder.toString());
		/**
		 * 字符串替换
		 */
		builder.replace(7,16, "jiang");
		System.out.println(builder.toString());
		/**
		 * delete(start, end)
		 * 删除字符串中的某个内容
		 * 大家好!!我是jiang I love Java
		 */
		builder.delete(12, builder.length());
		System.out.println(builder.toString());
		
		/**
		 * StringBuilder与StringBuffer
		 * 效果一样
		 * 区别：
		 * 		StringBuilder是非线程安全的
		 * 		StringBuffer是程不安全的
		 * 因为StringBuffer是线程安全的，由于顾及安全问题，进行必要的安全验证
		 * 所以效率上不如StringBuilder
		 * 
		 */
		
		
		
	}

	private static void StringBuilderAppend() {
		StringBuilder builder = new StringBuilder("java");
		for(int i=0;i<10000;i++){
			builder.append("java\n");
		}
		String string = builder.toString();
		System.out.println(string);
	}

	private static void StringConnect() {
		String info="java";
		try{
			for(int i=0;i<1000;i++){
				info+="java";
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(info);
		System.out.println("end");
	}
}
