package day05;
/**
 * 测试联系人信息
 * @author sunddenly
 */
public class DemoContact {
	public static void main(String[] args) {
		/**
		 * 创建一个联系人信息
		 */
		Contact someone=new Contact();
		someone.set("name", "sunddenly");
		someone.set("phone", "18812668674");
		someone.set("Email", "sunddenly@163.com");
		someone.set("qq", "1086571904");
		System.out.println(someone);
		System.out.println(
			someone.get("name")
			+" qq是:"
			+someone.get("qq")
		);
		Contact other=new Contact();
		other.set("name","Silence");
		other.set("phone", "14233390582");
		
	}
}
