package day01;

public class TestCharAt {
	public static void main(String[] args) {
		/**
		 * ��ȡָ��λ�õ����ַ�
		 */
		String str="�Ϻ�����ˮ���Ժ���";
		char ch=str.charAt(0);
		System.out.println(ch);
		/**
		 * �жϻ��ģ����Ҷ���һ��
		 * ˼·��
		 * 		1. 1 vs len
		 * 		2. 2 vs len-1
		 * 		3. 3 vs len-2
		 */
		boolean flag=true;
		int low=0;
		int high=str.length()-1;
		do{
			if(str.charAt(low)==str.charAt(high)){
				high--;
				low++;
			}else{
				flag=false;
				break;
				
			}
		}while(low<high);
		if(flag){
			System.out.println("�ǻ���");
		}else{
			System.out.println("���ǻ���");
		}
	}
}
