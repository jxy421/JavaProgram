package io.de_serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * ʹ��ObjectOutputStream������д���ļ�
 * @author sunddenly
 *
 */
public class TestOOS {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		List<String> otherInfo = new ArrayList<String>();
		otherInfo.add("������Ϣ1");
		otherInfo.add("������Ϣ2");
		otherInfo.add("������Ϣ3");
		Person person = new Person(
				"��һ",
				25,
				15819238,
				1,
				otherInfo
				);
		System.out.println(person);
		/**===���л�===**/
//		FileOutputStream fos = new FileOutputStream("person.obj");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(person);
//		oos.close();
		/**===�����л�===**/
		FileInputStream fis = new FileInputStream("person.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person obj = (Person) ois.readObject();
		System.out.println(obj);
		ois.close();
		//System.out.println(br.readLine());

	}
}
