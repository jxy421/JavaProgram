package day01;

public class TestIndexOf {
	public static void main(String[] args) {
		/**
		 * indexOf(str）
		 * indexOf(str,from)
		 */
		//indexOf(str）
		String str="Think in Java";
		int index =str.indexOf("Java");
		System.out.println("Java出现的位置: "+index);
		//indexOf(str,from)
		index=str.indexOf("i");
		System.out.println("i " +"出现的位置: "+index);
		//indexOf(str,from)
		index=str.indexOf("i",4);//4~length
		System.out.println("4~length：i " +"出现的位置: "+index);
		
		String instr="in";
		index=str.indexOf(instr);
		index=str.indexOf(instr,index+instr.length());
		System.out.println(instr +"出现的位置: "+index);
		/**
		 * lastIndex(str)
		 * lastIndex(str,from)
		 * 从后往前找
		 */
		index=str.lastIndexOf(instr);	
		System.out.println(instr +"最后出现的位置: "+index);
		index=str.lastIndexOf(instr,2);	//0~2
		System.out.println("0~2 "+instr +"最后出现的位置: "+index);
		index=str.lastIndexOf(instr,7);	//0~7
		
		System.out.println("0~7 "+instr +"最后出现的位置: "+index);
	}
	
}
