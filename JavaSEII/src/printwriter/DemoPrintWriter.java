package printwriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * 字节缓冲输出流
 * @author sunddenly
 *
 */
public class DemoPrintWriter {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter writer = 
				new PrintWriter("printwriter.txt");
		//向文件写入一个字符串
		writer.write("你好！PrintWriter");
		writer.flush();
		writer.close();
		/**
		 *当不关闭流，并且不flush时，文件内容为空
		 *因为数据都在缓冲区中
		 *所以我们在写操作的时候要确定将缓冲区的内容flush
		 */
	}
}
