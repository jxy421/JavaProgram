package printwriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * �ֽڻ��������
 * @author sunddenly
 *
 */
public class DemoPrintWriter {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter writer = 
				new PrintWriter("printwriter.txt");
		//���ļ�д��һ���ַ���
		writer.write("��ã�PrintWriter");
		writer.flush();
		writer.close();
		/**
		 *�����ر��������Ҳ�flushʱ���ļ�����Ϊ��
		 *��Ϊ���ݶ��ڻ�������
		 *����������д������ʱ��Ҫȷ����������������flush
		 */
	}
}
