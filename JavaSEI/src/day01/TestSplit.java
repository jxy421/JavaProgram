package day01;

import java.util.Arrays;

/**
 * 测试字符串拆分
 * @author sunddenly
 *
 */
public class TestSplit {
	public static void main(String[] args) {
		String info="hello!world!java";
		String[] split = info.split("!");
		System.out.println(Arrays.toString(split));
		/**
		 * 对图片重新定义，保留图片原来的后缀
		 * 注意；涉及正则表达式 考虑转义字符
		 */
		String name = "me.jpg";
		//String newname = "1233332313.jpg";
		String[] namearr = name.split("\\.");
		String newname="1232323232323."+namearr[1];
		System.out.println(newname);
	}
}
