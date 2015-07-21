package day01;

public class TestReplace {
	public static void main(String[] args) {
		String info = "12345ABC67890DEF123HI";
		/**
		 * 目标：
		 * 		将字符串中的数字部分替换为“#NUMBER#”
		 * replaceAll方法：
		 * 		可以替换字符串中满足正则表达式部分的内容
		 * replaceAll(String regex,String replacement)
		 */
		String str=info.replaceAll("[0-9]+","#NUMBER#");
		System.out.println(str);
	}
}
