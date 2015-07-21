package day01;

public class TestCharAt {
	public static void main(String[] args) {
		/**
		 * 获取指定位置单个字符
		 */
		String str="上海自来水来自海上";
		char ch=str.charAt(0);
		System.out.println(ch);
		/**
		 * 判断回文：左右读都一样
		 * 思路：
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
			System.out.println("是回文");
		}else{
			System.out.println("不是回文");
		}
	}
}
