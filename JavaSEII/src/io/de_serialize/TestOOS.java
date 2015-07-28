package io.de_serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 使用ObjectOutputStream将对象写入文件
 * @author sunddenly
 *
 */
public class TestOOS {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		List<String> otherInfo = new ArrayList<String>();
		otherInfo.add("其他信息1");
		otherInfo.add("其他信息2");
		otherInfo.add("其他信息3");
		Person person = new Person(
				"张一",
				25,
				15819238,
				1,
				otherInfo
				);
		System.out.println(person);
		/**===序列化===**/
//		FileOutputStream fos = new FileOutputStream("person.obj");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(person);
//		oos.close();
		/**===反序列化===**/
		FileInputStream fis = new FileInputStream("person.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person obj = (Person) ois.readObject();
		System.out.println(obj);
		ois.close();
		//System.out.println(br.readLine());

	}
}
