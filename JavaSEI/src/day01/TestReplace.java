package day01;

public class TestReplace {
	public static void main(String[] args) {
		String info = "12345ABC67890DEF123HI";
		/**
		 * Ŀ�꣺
		 * 		���ַ����е����ֲ����滻Ϊ��#NUMBER#��
		 * replaceAll������
		 * 		�����滻�ַ���������������ʽ���ֵ�����
		 * replaceAll(String regex,String replacement)
		 */
		String str=info.replaceAll("[0-9]+","#NUMBER#");
		System.out.println(str);
	}
}
