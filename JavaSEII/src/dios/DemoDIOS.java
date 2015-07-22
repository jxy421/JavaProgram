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
 * 测试DI/OS
 * @author sunddenly
 *
 */
public class DemoDIOS {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("o.txt");
			saveString("大家好才是真的好！", fos);
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
	 * 向给定的输出流中写字符串
	 * @param info
	 * @param out
	 * @throws IOException
	 */
	public static void saveString(String info,OutputStream out)
			throws IOException{
		/**
		 * 1. 创建DataOutputStream并 处理参数out 这个输出流
		 * 2. 通过Dos直接将一个字符串写出
		 * 3. 清空Dos缓冲区，确保每个字符都写出
		 */
		DataOutputStream dos = new DataOutputStream(out);
		dos.writeUTF(info);
		dos.flush();
		//dos.close();不能关
	}
	/**
	 * 从输入流中读取字符串
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
