package downinfo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * �ϵ���������
 * @author sunddenly
 *
 */
public class TestHttpDownload {
	public static void main(String[] args) {
		/**
		 * 1. ������������ DownloadInfoʵ��
		 * 2. ���������е����ص�ַ���������ӣ���ȡ��Ӧ��������
		 * 3. ���������б����ڱ��ص��ļ��������
		 * 4. ���ж�д����
		 * 5. �ر���
		 */
		try{
			//1
			DownloadInfo info = new DownloadInfo(
					"http://dlsw.baidu.com/sw-search-sp/soft/74/14927/MathType_V2014.7.28.0_setup.1431660820.exe"
					,
					"E:\\��ʽ�༭��.exe");
			
			//2
			URL url = new URL(info.getUrl());//���������ַ
			//ͨ����ַ���������ӣ��ͷ�����ͨ�ţ�
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			long totalSize = Long.parseLong(conn.getHeaderField("CONTENT-LENGTH"));
			info.setFileSize(totalSize);
			conn.disconnect();
			conn = (HttpURLConnection) url.openConnection();
			/**
			 * Ҫ��ʵ�ֶϵ����������Ǳ�����߷��������ǵ��ζ�ȡ�ļ��Ŀ�ʼλ�á�
			 * �൱�����Ǳ��ص���seek()��Ϊ���ǲ�����ֱ�ӵ��÷���������ķ���
			 * ��������ֻ����ͨ��ĳ�ַ������߷���������Ҫ��ʲô�������е����Լ�
			 * �������seek()�����������λ��
			 * 
			 * bytes = 0-    ����˼�Ǹ��߷������ӵ�һ���ֽڿ�ʼ��seek(0)
			 * bytes = 128-  ����ʶ�Ǹ��߷������ӵ�129���ֽڿ�ʼ��seek(128)
			 */
			String prop = "bytes="+info.getPos()+"-";
			//ͨ���������ò�����֪ͨ��������ʲô�ط���
			conn.setRequestProperty("RANGE", prop);
			//����������ʼ��ȡ�ļ�
			InputStream in = conn.getInputStream();
/*			DownloadInfo info = 
					new DownloadInfo(
							"C:\\��Ƶ\\04_JavaSE����II\\04_JavaSE����II\\JAVA SE����2 day01 am.wmv"
							,
							"sss.avi");
			FileInputStream in =
					new FileInputStream(info.getUrl());*/
			//�������м�¼�ı����ļ���ΪҪд����Ŀ���ļ�
			RandomAccessFile raf = 
					new RandomAccessFile(info.getFileName(),"rw");
			//������seek��λ�þ�������Ҫд��λ��
			raf.seek(info.getPos());
			//����һ��������
			byte[] buffer = 
					new byte[1024*10];//10k������
			int sum = -1;
			/**
			 * �������ز���
			 * ����������ȡ����
			 * ͨ�������д����
			 */
			while((sum=in.read(buffer))>0){
				raf.write(buffer,0,sum);
				info.setPos(info.getPos()+sum);
				System.out.println(info.getPos());
			}
			raf.close();
			in.close();
			//conn.disconnect();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
