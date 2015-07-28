package socket.v2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * �ͻ���
 * @author sunddenly
 */
public class DemoClient {
	private Socket socket;
	/** �������Ӳ���ͻ��˷�����Ϣ
	 *  1. ͨ���������ĵ�ַ���˿������������
	 *  2. ������Socketʱ��Ҫ������������
	 *  3. ���ӳɹ����ͨ��Socket��ȡ���������������
	 *  4. ʹ�����������շ���˷��͹�������Ϣ��
	 *  5. �ر�����
	 */
	public void send(){
		try {
			/**
			 * 1 ���ӷ�����
			 * 	   һ��Socket��ʵ��������ô���Ϳ�ʼͨ�� �����ĵ�ַ�Ͷ˿ں� 
			 *   ȥ������������������ӣ��Զ��ģ���
			 *   ����ĵ�ַ"localhost"�Ƿ������ĵ�ַ��
			 *   8088�˿��Ƿ���������Ķ˿ڡ�
			 *   ��������Ķ˿���ϵͳ����ģ���������֪��
			 */
			System.out.println("��ʼsocket���ӡ�������");
			socket = new Socket("127.0.0.1",8088);
			/**
			 * �ͷ�����ͨ��
			 * ʹ�� socket ��ȡ���������
			 */
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			//���������ɴ����ַ����Ļ����ַ���
			//ʹ��Printwriter����Ҫ���ֽ�������תΪ�ַ���
			PrintWriter writer = new PrintWriter(out);
			writer.println("��÷�������");
			//��������һ��д��
			writer.flush();
			
			//��������ɴ����ַ����Ļ����ַ���
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			/**
			 * ��ȡ���������͹�������Ϣ
			 */
			String info = reader.readLine();//����������Ϣ������
			System.out.println(info);
			
			writer.println("�ټ�����������");
			writer.flush();
			
			info = reader.readLine();
			System.out.println(info);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		DemoClient client = new DemoClient();
		client.send();
	}
}
