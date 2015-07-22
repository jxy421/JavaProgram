package isrosw;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * �ַ������
 * @author sunddenly
 * OutputStreamWriter: �߼������������ַ�Ϊ��λ��д ����
 *
 */
public class DemoOutputStreamWriter {
	public static void main(String[] args) throws IOException {
		/**
		 * ���ļ���д���ַ�
		 * 1. �����ļ���������ֽ�����
		 * 2. �����ַ���������߼�����
		 * 	  2.1 �����ļ��������Ŀ�����ǿ������ֽ�Ϊ��λд����
		 * 3. д���ַ�
		 * 4. д���ر�
		 */
		OutputStreamWriter writer=null;
		try {
			FileOutputStream fos = new FileOutputStream("writer.txt");
			writer = new OutputStreamWriter(fos);
			writer.write("��ã�");
			writer.flush();
		} catch (IOException e) {
			throw e;
		} finally{
			if(writer!=null){
				writer.close();
			}
		}
	}
}
