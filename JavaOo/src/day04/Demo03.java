package day04;
/**
 * 二维数组
 * 元素是一维数组的数组
 */
public class Demo03 {
	public static void main(String[] args) {
		int[][] ary=new int[2][3];
		ary[1]=new int[]{4,5,6,7};
		System.out.println(ary[1][2]);
		System.out.println(ary.length);
		System.out.println(ary[0].length);
		System.out.println(ary[1].length);
		for(int i=0;i<ary.length;i++){
			int[] tmp=ary[i];
			for(int j=0;j<tmp.length;j++){
				int n=tmp[j];
				System.out.print(n);
			}
			System.out.println();
		}
		
	}
}
