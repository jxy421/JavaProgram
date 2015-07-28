package socket.v2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 客户端
 * @author sunddenly
 */
public class DemoClient {
	private Socket socket;
	/** 建立连接并向客户端发送信息
	 *  1. 通过服务器的地址及端口与服务器连接
	 *  2. 而创建Socket时需要以上两个数据
	 *  3. 连接成功后可通过Socket获取输入流和输出流，
	 *  4. 使用输入流接收服务端发送过来的信息③
	 *  5. 关闭连接
	 */
	public void send(){
		try {
			/**
			 * 1 连接服务器
			 * 	   一旦Socket被实例化，那么它就开始通过 给定的地址和端口号 
			 *   去尝试与服务器进行连接（自动的）。
			 *   这里的地址"localhost"是服务器的地址，
			 *   8088端口是服务器对外的端口。
			 *   我们自身的端口是系统分配的，我们无需知道
			 */
			System.out.println("开始socket连接。。。。");
			socket = new Socket("127.0.0.1",8088);
			/**
			 * 和服务器通信
			 * 使用 socket 获取输入输出流
			 */
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			//将输出流变成处理字符串的缓冲字符流
			//使用Printwriter不需要对字节流进行转为字符流
			PrintWriter writer = new PrintWriter(out);
			writer.println("你好服务器！");
			//将缓冲区一次写出
			writer.flush();
			
			//输入流变成处理字符串的缓冲字符流
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			/**
			 * 读取服务器发送过来的信息
			 */
			String info = reader.readLine();//读服务器信息会阻塞
			System.out.println(info);
			
			writer.println("再见！服务器！");
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
