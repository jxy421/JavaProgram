package socket.v1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 * @author sunddenly
 *
 */
public class DemoServer {
	private ServerSocket socket;
	private int port = 8088;
	public DemoServer(){
		try {
			/**
			 * ServerSocket 构造方法要求我们传入打开的端口号
			 * ServerSocket 对象在创建的时候就向操作系统申请打开的端口号
			 */
			socket = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 开始服务
	 * 等待接收客户端的请求并与之通信
	 */
	public void start(){
		try {
			/**
			 * 通过调用ServerSocket的accept方法，使服务器
			 * 开始等待接受客户端连接
			 * 该方法是一个阻塞方法，监听8088端口是否有客户端
			 * 连接。直到有客户端与其连接，否则该方法不会结束
			 */
			System.out.println("服务器启动中等待客户端连接");
			Socket s = socket.accept();
			
			//获取与客户端通信的输入输出流
			InputStream in = s.getInputStream();
			OutputStream out = s.getOutputStream();
			//包装为缓冲字符流
			PrintWriter writer = new PrintWriter(out);
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(in));
			//先听客户端发送的信息
			String info = reader.readLine();
			System.out.println(info);
			
			//发送信息给客户端
			writer.println("你好客户端！");
			writer.flush();
			
			info = reader.readLine();
			System.out.println(info);
			
			writer.println("再见客户端!");
			writer.flush();
			
			socket.close();//关闭与客户端的连接
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println("服务器启动中！");
		DemoServer demo = new DemoServer();
		demo.start();
	}
}

