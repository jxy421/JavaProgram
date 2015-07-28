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
	private ExecutorService threadPool;// 线程池
	private BlockingQueue<String> msgQueue; // 双缓冲队列

	public DemoServer() {
		try {
			socket = new ServerSocket(port);
			threadPool = Executors.newFixedThreadPool(50); // 创建50个线程的固定大小的线程池
			
			msgQueue = new LinkedBlockingQueue<String>();
			
			/** 创建定时器，周期性的将队列中的数据写入文件 */
			Timer timer = new Timer();
			timer.schedule(new TimerTask() {
				public void run() {
					try { 
						// 创建用于向文件写信息的输出流
						PrintWriter writer = new PrintWriter(new FileWriter(
								"log.txt", true));
						// 从队列中获取所有元素，作写出操作
						String msg = null;
						for (int i = 0; i < msgQueue.size(); i++) {
							/** 
							 * 参数 0：时间量
							 * TimeUnit.MILLISECONDS：时间单位 
							 *
							 **/
							msg = msgQueue.poll(0, TimeUnit.MILLISECONDS);
							if (msg == null) {
								break;
							}
							writer.println(msg);// 通过输出流写出数据
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
				System.out.println("等待客户端连接……");
				Socket s = socket.accept();
				threadPool.execute(new Handler(s));
				System.out.println("一个客户端连接了，分配线程");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	class Handler implements Runnable {
		private Socket socket;// 当前线程要进行通信的客户端Socket

		public Handler(Socket socket) {// 通过构造方法将客户端的Socket传入
			this.socket = socket;
		}

		public void run() {
			try { // 获取与客户端通信的输入输出流

				InputStream in = socket.getInputStream();// 包装为缓冲字符流
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(in));
				String info = null;
				while (true) {// 循环读取客户端发送过来的信息
					info = reader.readLine();
					if (info != null) { // 插入对列成功返回true，失败返回false
						// 该方法会阻塞线程，若中断会报错！
						boolean b = msgQueue.offer(info, 5, TimeUnit.SECONDS);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("服务器启动中！");
		DemoServer demo = new DemoServer();
		demo.start();
	}

}
