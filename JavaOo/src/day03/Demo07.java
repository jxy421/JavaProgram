package day03;
/**
 * �ڶ����ϵ��÷���
 * ��̬������û����������this
 * ��̬�����в��ܷ���this�����Ժͷ���
 */
public class Demo07 {
	public static void main(String[] args) {
		Point p1 = new Point(3,4);
		Point p2 = new Point(6,8);
		System.out.println(p1.distance(p2));
		System.out.println(Point.distance(p1, p2));
	}
}
class Point{
	int x;
	int y;
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	public static double distance(Point p1,Point p2){
		int a=p1.x-p2.x;
		int b=p1.y-p2.y;
		int c=a*a+b*b;
		return Math.sqrt(c);
	}
	public double distance(Point other){
		int a=this.x-other.x;
		int b=this.y-other.y;
		int c=a*a+b*b;
		return Math.sqrt(c);
	}
}