package blockingqueue;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class DemoServer {
	private ServerSocket socket;
	private int port = 8030;
	private ExecutorService threadPool;// �̳߳�
	private BlockingQueue<String> msgQueue; // ˫�������

	public DemoServer() {
		try {
			socket = new ServerSocket(port);
			threadPool = Executors.newFixedThreadPool(50); // ����50���̵߳Ĺ̶���С���̳߳�
			
			msgQueue = new LinkedBlockingQueue<String>();
			
			/** ������ʱ���������ԵĽ������е�����д���ļ� */
			Timer timer = new Timer();
			timer.schedule(new TimerTask() {
				public void run() {
					try { 
						// �����������ļ�д��Ϣ�������
						PrintWriter writer = new PrintWriter(new FileWriter(
								"log.txt", true));
						// �Ӷ����л�ȡ����Ԫ�أ���д������
						String msg = null;
						for (int i = 0; i < msgQueue.size(); i++) {
							/** 
							 * ���� 0��ʱ����
							 * TimeUnit.MILLISECONDS��ʱ�䵥λ 
							 *
							 **/
							msg = msgQueue.poll(0, TimeUnit.MILLISECONDS);
							if (msg == null) {
								break;
							}
							writer.println(msg);// ͨ�������д������
						}
						writer.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}, 0, 500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void start() {
		try {
			while (true) {
				System.out.println("�ȴ��ͻ������ӡ���");
				Socket s = socket.accept();
				threadPool.execute(new Handler(s));
				System.out.println("һ���ͻ��������ˣ������߳�");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	class Handler implements Runnable {
		private Socket socket;// ��ǰ�߳�Ҫ����ͨ�ŵĿͻ���Socket

		public Handler(Socket socket) {// ͨ�����췽�����ͻ��˵�Socket����
			this.socket = socket;
		}

		public void run() {
			try { // ��ȡ��ͻ���ͨ�ŵ����������

				InputStream in = socket.getInputStream();// ��װΪ�����ַ���
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(in));
				String info = null;
				while (true) {// ѭ����ȡ�ͻ��˷��͹�������Ϣ
					info = reader.readLine();
					if (info != null) { // ������гɹ�����true��ʧ�ܷ���false
						// �÷����������̣߳����жϻᱨ��
						boolean b = msgQueue.offer(info, 5, TimeUnit.SECONDS);
					}
				}
			} catch (Exception e) {
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
