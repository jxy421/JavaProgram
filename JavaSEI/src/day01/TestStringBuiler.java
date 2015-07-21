package day01;
/**
 * StringBuilder����
 * @author hdoop
 */
public class TestStringBuiler {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		/**
		 * ���ַ���׷������
		 * append���з���ֵ�ģ�����������StringBuilder
		 * �����ص����StrigBuilder��ʵ�����Լ���this��
		 */
		builder.append("��Һ�!")
		.append("����Sunddenly ")
		.append("I love Java");
		System.out.println(builder.toString());
		/**
		 * insert(int pos,string str)
		 * �ڵ�ǰ�ַ����е�ָ��λ�ò����ַ���
		 * posΪ��0��ʼ�Ĳ���λ�ã�Ԫ����������
		 */
		builder.insert(4, "!");
		System.out.println(builder.toString());
		/**
		 * �ַ����滻
		 */
		builder.replace(7,16, "jiang");
		System.out.println(builder.toString());
		/**
		 * delete(start, end)
		 * ɾ���ַ����е�ĳ������
		 * ��Һ�!!����jiang I love Java
		 */
		builder.delete(12, builder.length());
		System.out.println(builder.toString());
		
		/**
		 * StringBuilder��StringBuffer
		 * Ч��һ��
		 * ����
		 * 		StringBuilder�Ƿ��̰߳�ȫ��
		 * 		StringBuffer�ǳ̲���ȫ��
		 * ��ΪStringBuffer���̰߳�ȫ�ģ����ڹ˼���ȫ���⣬���б�Ҫ�İ�ȫ��֤
		 * ����Ч���ϲ���StringBuilder
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
