package day05;

import java.util.*;

/**
 * 用户业务逻辑类
 * @author sunddenly
 * 
 *
 */
public class UserService {
	Map<String,User> users = new HashMap<String,User>();
	/**
	 * 登录方法
	 * @param username
	 * @param password
	 * @return 
	 */
	public User login(String username,String password){
		/**
		 * 根据用户输入的用户名查询users
		 */
		User user=users.get(username);
		//查看map中是否有这个用户
		if(user==null){
			throw new RuntimeException("没有该用户！");
		}
		/**
		 * 若没有该用户，那么就判断用户输入的密码和User对象中保
		 * 存的改用户密码是否一致
		 */
		if(!user.getPassword().equals(password)){
			throw new RuntimeException("密码输入错误");
		}
		//用户名与密码均正确，返回该用户信息
		return user;
	}
	public static void main(String[] args){
		UserService service = new UserService(); 
		/**
		 * 存入几个模拟数据
		 */
		service.users.put("Xiloer",new User("Xiloer","1234"));
		service.users.put("Tom",new User("Tom","12345"));
		service.users.put("Jerry",new User("Jerry","123456"));
		service.users.put("Kulli",new User("Kulli","1457"));
		/**
		 *测试登陆
		 */
		//service.login("ABC", "1234");
		User user = service.login("Jerry", "123456");
		System.out.println(user.getUsername()+"登陆成功");
		

	}
}
