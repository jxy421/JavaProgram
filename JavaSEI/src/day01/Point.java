package day01;

/**
 * @author hdoop
 * 
 */
public class Point {
	int x;
	int y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
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


	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	/*
	 * 重写Object及继承过来的该方法，用于定义对象内容的比较规则
	 * 重写equals一定要判断给定对象的类型
	 */
	@Override
	public boolean equals(Object obj) {
		/*
		 * 判断给定对象是否对象本身
		 */
		if(this==obj){
			return true;
		}
		//比较前验证对象是否为空引用，防止空指针异常
		if(obj==null){
			return false;
		}
		/**
		 * 直接将Object转换为子类是存在风险的
		 * 我们不能保证object和我们要比较的对象是同一个类型
		 * 这会引发ClassCastexception我们称为【类造型异常】
		 */
		if(obj instanceof Point){
			Point p=(Point)obj;
			return this.x==p.x&&this.y==p.y;
		}else{
			return false;
		}
		
	}
	
}
