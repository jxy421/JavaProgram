package socket.v3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �����
 * ֧���̳߳�
 * @author sunddenly
 *
 */
public class DemoServer {
	private ServerSocket socket;
	private int port = 8088;
	//�̳߳�
	private ExecutorService threadPool;
	
	public DemoServer(){
		try {
			/**
			 * ServerSocket ���췽��Ҫ�����Ǵ���򿪵Ķ˿ں�
			 * ServerSocket �����ڴ�����ʱ��������ϵͳ����򿪵Ķ˿ں�
			 */
			socket = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * ��ʼ����
	 * �ȴ����տͻ��˵�������֮ͨ��
	 */
	public void start(){
		try {
			/**
			 * ͨ������ServerSocket��accept������ʹ������
			 * ��ʼ�ȴ����ܿͻ�������
			 * �÷�����һ����������������8088�˿��Ƿ��пͻ���
			 * ���ӡ�ֱ���пͻ����������ӣ�����÷����������
			 */
			while(true){
				System.out.println("�����������еȴ��ͻ�������");
				Socket s = socket.accept();
				System.out.println("һ���ͻ��������ˣ������߳�ȥ�Ӵ���");
				/**
				 * ���߳��彫�����̳߳�
				 * �̳߳ػ��Զ�������������һ������
				 * �߳���ִ��
				 */
				//����50���̵߳��̳߳�
				threadPool = Executors.newFixedThreadPool(50);
				threadPool.execute(new Handler(s));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * �����߳��壬���̵߳������������ӵ��������Ŀͻ��˽��н���
	 * 
	 * @author sunddenly
	 *
	 */
	class Handler implements Runnable{
		//��ǰ�߳�Ҫ����ͨ�ŵĿͻ���Socket
		private Socket socket;
		//ͨ�����췽�����ͻ��˵�socket����
		public Handler(Socket socket){
			this.socket=socket;
		}
		public void run(){
			try{
				//��ȡ��ͻ���ͨ�ŵ����������
				InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream();
				//��װΪ�����ַ���
				PrintWriter writer = new PrintWriter(out);
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(in));
				//�����ͻ��˷��͵���Ϣ
				String info = reader.readLine();
				System.out.println(info);
				
				//������Ϣ���ͻ���
				writer.println("��ÿͻ��ˣ�");
				writer.flush();
				
				info = reader.readLine();
				System.out.println(info);
				
				writer.println("�ټ��ͻ���!");
				writer.flush();
				
				socket.close();//�ر���ͻ��˵�����
			} catch(IOException e){
				e.printStackTrace();
			}
			
		}
	}
	public static void main(String[] args) {
		System.out.println("�����������У�");
		DemoServer demo = new DemoServer();
		demo.start();
	}
}

