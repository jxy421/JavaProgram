package exception;
/**
 * 异常测试
 * @author sunddenly
 *
 */
public class DemoException {
	public static void main(String[] args) {
		try {
			String info = "hello";
			System.out.println("这个字符串的长度："+info.length());
			System.out.println("第十个字符："+info.charAt(10));
			/**
			 * 当上面出现的异常没有捕获处理
			 * 则下面的程序将不在继续执行
			 * 
			 * 注意，当在捕获块中出现异常，try{}之后的程序可执行
			 * try{}内部出现异常的行后面将不会再次执行
			 */
			System.out.println("try中这个程序结束了！");
		} catch (NullPointerException e) {
			System.out.println("这个字符串是空！");
		} catch (StringIndexOutOfBoundsException e){
			System.out.println("字符串下标越界！");
		} catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("这个程序结束了！");
	}
}
