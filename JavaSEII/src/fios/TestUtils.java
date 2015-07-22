package fios;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * ����IOUtils������
 * @author sunddenly
 *
 */
public class TestUtils {
	public static void main(String[] args) {
		File file = new File("data.dat");
		try{
			//���ļ����ݶ�ȡ����
			byte[] data = IOUtils.loadBytes(file);
			//����ļ�����
			System.out.println(Arrays.toString(data));
						
			File src = new File("abc.dat");//���ļ��ڴ����ϲ�����
			File des = new File("abc1.dat");
			IOUtils.saveBytes(src, data);
			IOUtils.copy(src, des);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
