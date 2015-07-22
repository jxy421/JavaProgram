package exception;

public class DemoThrow {
	public static void main(String[] args) {
		try {
			/**
			 * 通常我们调用方法需要传入参数的话，那么这些方法
			 * 都不会自动处理异常，而是将错误抛给我们解决
			 */
			String result= getGirlFirend("女神");
			System.out.println("我追到女神了吗？"+result);
		} catch (Exception e) {
			//我们应该在这里捕获异常并处理
			System.out.println("我没追到。。。。。");
		}
	}
	/**
	 * 介绍女朋友
	 * @param name 女友名字
	 * @return     是否同意
	 */
	public static String getGirlFirend(String name)throws RuntimeException{
		try {
			if("sundddenly".equals(name)){
				return "行";
			}else if("Jerry".equals(name)){
				return "行";
			}else if("我有女朋友".equals(name)){
				return "不行";
			}else{
				/**
				 * 当出现了错误(可能是业务上的，不一定是真实的)
				 * 我们主动抛出异常
				 */
				throw new RuntimeException("人家不干！");
			}
		} catch (NullPointerException e) {
			throw e;//出错了不解决，抛给调用者，因为传参出问题
		}
	}
}
