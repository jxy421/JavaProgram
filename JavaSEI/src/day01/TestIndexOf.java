package day01;

public class TestIndexOf {
	public static void main(String[] args) {
		/**
		 * indexOf(str��
		 * indexOf(str,from)
		 */
		//indexOf(str��
		String str="Think in Java";
		int index =str.indexOf("Java");
		System.out.println("Java���ֵ�λ��: "+index);
		//indexOf(str,from)
		index=str.indexOf("i");
		System.out.println("i " +"���ֵ�λ��: "+index);
		//indexOf(str,from)
		index=str.indexOf("i",4);//4~length
		System.out.println("4~length��i " +"���ֵ�λ��: "+index);
		
		String instr="in";
		index=str.indexOf(instr);
		index=str.indexOf(instr,index+instr.length());
		System.out.println(instr +"���ֵ�λ��: "+index);
		/**
		 * lastIndex(str)
		 * lastIndex(str,from)
		 * �Ӻ���ǰ��
		 */
		index=str.lastIndexOf(instr);	
		System.out.println(instr +"�����ֵ�λ��: "+index);
		index=str.lastIndexOf(instr,2);	//0~2
		System.out.println("0~2 "+instr +"�����ֵ�λ��: "+index);
		index=str.lastIndexOf(instr,7);	//0~7
		
		System.out.println("0~7 "+instr +"�����ֵ�λ��: "+index);
	}
	
}
