package io.characters.brbw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * ʹ�û����ַ���������ȡ����������Ϣ
 * @author sunddenly
 *
 */
public class DemoSystemIn {
	public static void main(String[] args) throws IOException {
		/**
		 * �����̵�������ת��Ϊ�ַ�������
		 * ���ַ�������ת��Ϊ�����ַ�������
		 */
		//�����ֽ�������ת��Ϊ�ַ�������
		InputStreamReader isr = new InputStreamReader(System.in);
		//�ַ���ת���ַ�������
		BufferedReader br = new BufferedReader(isr);
		
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("systemin.txt"));
		BufferedWriter writer = new BufferedWriter(osw);
		
		String info = null;
		while(true){
			info = br.readLine();
			if("exit".equals(info.trim())){
				break;
			}
			/**
			 * �����ǲ����������̨������ͨ�����ļ����������д����
			 * �����Խ�����̨����Ϣд���ı��ļ���
			 */
			//System.out.println(info);
			writer.write(info);
			writer.newLine();
			writer.flush();
		}
		br.close();
		writer.close();
		
	}
}
	