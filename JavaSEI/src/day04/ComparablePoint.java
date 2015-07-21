package day04;
/**
 * 可比较的点
 * 若我们定义的类想在数组或集合中可以排序
 * 需要将当前类实现Comparable接口，并定义比较规则
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
	 * 比较方法，该方法由Comparable接口定义
	 * 所有子类均需要实现该方法来定义比较规则
	 * 比较规则：
	 * 		   比较点到原点的距离，谁的长谁大
	 * 大于0：自身比参数大
	 * 等于0：自身等于参数值
	 * 小于0：自身比参数值小
	 * 
	 * 主要注意：
	 * 		  equals返回true时候
	 * 		  CompareTo返回值是0
	 */
	@Override
	public int compareTo(ComparablePoint o) {
		//自身到原点距离
		int r=x*x+y*y;
		//参数到原点的距离
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