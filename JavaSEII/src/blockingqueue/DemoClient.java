package blockingqueue;

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
	public void send(){
		try {
			System.out.println("��ʼsocket���ӡ�������");
			socket = new Socket("127.0.0.1",8030);
			
			OutputStream out = socket.getOutputStream();//��ת��
			PrintWriter writer = new PrintWriter(out);
			
			while(true){
				writer.println("��÷�������");
				writer.flush();
				Thread.sleep(500);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		DemoClient client = new DemoClient();
		client.send();
	}
}
