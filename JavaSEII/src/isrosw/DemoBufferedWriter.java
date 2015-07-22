package isrosw;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * �߼���
 * ��������Ϊ��λ��д�ַ�
 * @author sunddenly
 *
 */
public class DemoBufferedWriter {
	public static void main(String[] args) throws IOException{
		//��������д�ļ��������
		FileOutputStream fos = 
				new FileOutputStream("buffered.txt");
		OutputStreamWriter osw =
				new OutputStreamWriter(fos,"UTF-8");
		/**
		 * BufferedWiter�Ĺ����� ��֧�ָ���һ���ֽ������
		 * ֻ�ܸ���һ���ַ������Writer������
		 * Writer���ַ�������ĸ���
		 */
		BufferedWriter writer = new BufferedWriter(osw);
		
		writer.write("���ѽ��");
		writer.newLine();
		writer.write("���ǵڶ���");
		writer.newLine();
		writer.write("���ǵ����У�");
		writer.flush();
		writer.close();
	}
}
