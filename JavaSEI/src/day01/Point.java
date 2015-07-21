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
	 * ��дObject���̳й����ĸ÷��������ڶ���������ݵıȽϹ���
	 * ��дequalsһ��Ҫ�жϸ������������
	 */
	@Override
	public boolean equals(Object obj) {
		/*
		 * �жϸ��������Ƿ������
		 */
		if(this==obj){
			return true;
		}
		//�Ƚ�ǰ��֤�����Ƿ�Ϊ�����ã���ֹ��ָ���쳣
		if(obj==null){
			return false;
		}
		/**
		 * ֱ�ӽ�Objectת��Ϊ�����Ǵ��ڷ��յ�
		 * ���ǲ��ܱ�֤object������Ҫ�ȽϵĶ�����ͬһ������
		 * �������ClassCastexception���ǳ�Ϊ���������쳣��
		 */
		if(obj instanceof Point){
			Point p=(Point)obj;
			return this.x==p.x&&this.y==p.y;
		}else{
			return false;
		}
		
	}
	
}
