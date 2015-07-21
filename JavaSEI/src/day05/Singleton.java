package day05;
/**
 * 单例模式
 * @author sunddenly
 * 三步：
 * 		1. 私有静态当前类实例为属性
 *      2. 私有构造函数
 *      3. 静态获取实例函数，并判断实例是否创建过
 *
 */
public class Singleton {
	private static Singleton singleton=null;
	private Singleton(){
		
	}

	public static Singleton getInstance(){
		if(singleton==null){
			singleton = new Singleton();
		}
		return singleton;
	}
}
