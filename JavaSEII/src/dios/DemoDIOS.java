package dios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ����DI/OS
 * @author sunddenly
 *
 */
public class DemoDIOS {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("o.txt");
			saveString("��Һò�����ĺã�", fos);
			FileInputStream fis = new FileInputStream("o.txt");
			String loadString = loadString(fis);
			System.out.println(loadString);
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * ��������������д�ַ���
	 * @param info
	 * @param out
	 * @throws IOException
	 */
	public static void saveString(String info,OutputStream out)
			throws IOException{
		/**
		 * 1. ����DataOutputStream�� �������out ��������
		 * 2. ͨ��Dosֱ�ӽ�һ���ַ���д��
		 * 3. ���Dos��������ȷ��ÿ���ַ���д��
		 */
		DataOutputStream dos = new DataOutputStream(out);
		dos.writeUTF(info);
		dos.flush();
		//dos.close();���ܹ�
	}
	/**
	 * ���������ж�ȡ�ַ���
	 * @param in
	 * @return
	 * @throws IOException
	 */
	public static  String loadString(InputStream in)
			throws IOException{
		DataInputStream dis = new DataInputStream(in);
		String str = dis.readUTF();
		return str;
	}
}
