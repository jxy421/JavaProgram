package io.characters.isrosw;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �ַ�������
 * @author sunddenly
 *
 */
public class DemoInputStreamReader {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = null;
		try{
			//�������ڶ�ȡ�ļ����ֽ�������
			FileInputStream fis = new FileInputStream("writer.txt");
			//�����������ַ�Ϊ��λ��ȡ���ݵĸ߼���
			reader = new InputStreamReader(fis,"UTF-8");
			//��ȡ����
			int c = -1;
			while((c=reader.read())!=-1){
				System.out.print((char)c);
			}
		} catch(IOException e){
			throw e;
		} finally{
			if(reader!=null){
				reader.close();
			}
		}
	}
}
