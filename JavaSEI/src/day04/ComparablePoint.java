package day04;
/**
 * �ɱȽϵĵ�
 * �����Ƕ��������������򼯺��п�������
 * ��Ҫ����ǰ��ʵ��Comparable�ӿڣ�������ȽϹ���
 * @author sunddenly
 *
 */
public class ComparablePoint implements Comparable<ComparablePoint>{
	private int x;
	private int y;
	public ComparablePoint(int x,int y){
		this.x=x;
		this.y=y;
	}
	/**
	 * �ȽϷ������÷�����Comparable�ӿڶ���
	 * �����������Ҫʵ�ָ÷���������ȽϹ���
	 * �ȽϹ���
	 * 		   �Ƚϵ㵽ԭ��ľ��룬˭�ĳ�˭��
	 * ����0������Ȳ�����
	 * ����0��������ڲ���ֵ
	 * С��0������Ȳ���ֵС
	 * 
	 * ��Ҫע�⣺
	 * 		  equals����trueʱ��
	 * 		  CompareTo����ֵ��0
	 */
	@Override
	public int compareTo(ComparablePoint o) {
		//����ԭ�����
		int r=x*x+y*y;
		//������ԭ��ľ���
		int other=o.x*o.x+o.y*o.y;
		return r-other;
	}
	@Override
	public String toString() {
		return "ComparablePoint [x=" + x + ", y=" + y + "]";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
}