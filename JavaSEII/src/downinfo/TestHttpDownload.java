package downinfo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

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
					"https://www.baidu.com/s?wd=%E5%85%AC%E5%BC%8F%E7%BC%96%E8%BE%91%E5%99%A8&rsv_spt=1&issp=1&f=8&rsv_bp=0&rsv_idx=2&ie=utf-8&tn=baiduhome_pg&rsv_enter=1&rsv_sug3=25&rsv_sug1=3"
					,
					"E:\\��ʽ�༭��");
			
			//2
			URL url = new URL(info.getUrl());//���������ַ
			//ͨ����ַ���������ӣ��ͷ�����ͨ�ţ�
			HttpURLConnection openConnection = (HttpURLConnection) url.openConnection();
			
		} catch(Exception e){
			
		}
	}
}
