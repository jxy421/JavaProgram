package day01;

import java.util.Arrays;

/**
 * �����ַ������
 * @author sunddenly
 *
 */
public class TestSplit {
	public static void main(String[] args) {
		String info="hello!world!java";
		String[] split = info.split("!");
		System.out.println(Arrays.toString(split));
		/**
		 * ��ͼƬ���¶��壬����ͼƬԭ���ĺ�׺
		 * ע�⣻�漰������ʽ ����ת���ַ�
		 */
		String name = "me.jpg";
		//String newname = "1233332313.jpg";
		String[] namearr = name.split("\\.");
		String newname="1232323232323."+namearr[1];
		System.out.println(newname);
	}
}
