package fios;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * 测试IOUtils工具类
 * @author sunddenly
 *
 */
public class TestUtils {
	public static void main(String[] args) {
		File file = new File("data.dat");
		try{
			//将文件数据读取出来
			byte[] data = IOUtils.loadBytes(file);
			//输出文件内容
			System.out.println(Arrays.toString(data));
						
			File src = new File("abc.dat");//该文件在磁盘上不存在
			File des = new File("abc1.dat");
			IOUtils.saveBytes(src, data);
			IOUtils.copy(src, des);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
