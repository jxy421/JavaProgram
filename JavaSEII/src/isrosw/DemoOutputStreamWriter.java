package isrosw;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 字符输出流
 * @author sunddenly
 * OutputStreamWriter: 高级流，可以以字符为单位读写 数据
 *
 */
public class DemoOutputStreamWriter {
	public static void main(String[] args) throws IOException {
		/**
		 * 向文件中写入字符
		 * 1. 创建文件输出流（字节流）
		 * 2. 创建字符输出流（高级流）
		 * 	  2.1 处理文件输出流的目的我们可以以字节为单位写数据
		 * 3. 写入字符
		 * 4. 写完后关闭
		 */
		OutputStreamWriter writer=null;
		try {
			FileOutputStream fos = new FileOutputStream("writer.txt");
			writer = new OutputStreamWriter(fos);
			writer.write("你好！");
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
