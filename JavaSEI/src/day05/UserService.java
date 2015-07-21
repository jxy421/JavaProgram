package day05;

import java.util.*;

/**
 * �û�ҵ���߼���
 * @author sunddenly
 * 
 *
 */
public class UserService {
	Map<String,User> users = new HashMap<String,User>();
	/**
	 * ��¼����
	 * @param username
	 * @param password
	 * @return 
	 */
	public User login(String username,String password){
		/**
		 * �����û�������û�����ѯusers
		 */
		User user=users.get(username);
		//�鿴map���Ƿ�������û�
		if(user==null){
			throw new RuntimeException("û�и��û���");
		}
		/**
		 * ��û�и��û�����ô���ж��û�����������User�����б�
		 * ��ĸ��û������Ƿ�һ��
		 */
		if(!user.getPassword().equals(password)){
			throw new RuntimeException("�����������");
		}
		//�û������������ȷ�����ظ��û���Ϣ
		return user;
	}
	public static void main(String[] args){
		UserService service = new UserService(); 
		/**
		 * ���뼸��ģ������
		 */
		service.users.put("Xiloer",new User("Xiloer","1234"));
		service.users.put("Tom",new User("Tom","12345"));
		service.users.put("Jerry",new User("Jerry","123456"));
		service.users.put("Kulli",new User("Kulli","1457"));
		/**
		 *���Ե�½
		 */
		//service.login("ABC", "1234");
		User user = service.login("Jerry", "123456");
		System.out.println(user.getUsername()+"��½�ɹ�");
		

	}
}
