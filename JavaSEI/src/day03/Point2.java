package day03;

/**
 * @author hdoop
 *
 * @param <X>
 * @param <Y>
 * @param <Z>
 */
public class Point2<X,Y,Z> {
	private X x;
	private Y y;
	private Z z;
	
	public Point2(X x, Y y, Z z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public X getX() {
		return x;
	}
	public void setX(X x) {
		this.x = x;
	}
	public Y getY() {
		return y;
	}
	public void setY(Y y) {
		this.y = y;
	}
	public Z getZ() {
		return z;
	}
	public void setZ(Z z) {
		this.z = z;
	}
//	@Override
//	public boolean equals(Object obj) {
//		if(obj!=null&&obj instanceof Point2){
//			Point2 p=(Point2)obj;
//			return this.x== p.x&&this.y==p.y&&this.z==p.z;
//		}else{
//			return false;
//		}
//	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return x+","+y+","+z;
	}
	
	
}
