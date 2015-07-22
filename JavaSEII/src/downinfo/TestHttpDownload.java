package downinfo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * 断点续传测试
 * @author sunddenly
 *
 */
public class TestHttpDownload {
	public static void main(String[] args) {
		/**
		 * 1. 创建下载任务 DownloadInfo实例
		 * 2. 根据任务中的下载地址打开网络连接，获取对应的输入流
		 * 3. 创建任务中保存在本地的文件的输出流
		 * 4. 进行读写操作
		 * 5. 关闭流
		 */
		try{
			//1
			DownloadInfo info = new DownloadInfo(
					"https://www.baidu.com/s?wd=%E5%85%AC%E5%BC%8F%E7%BC%96%E8%BE%91%E5%99%A8&rsv_spt=1&issp=1&f=8&rsv_bp=0&rsv_idx=2&ie=utf-8&tn=baiduhome_pg&rsv_enter=1&rsv_sug3=25&rsv_sug1=3"
					,
					"E:\\公式编辑器");
			
			//2
			URL url = new URL(info.getUrl());//给定网络地址
			//通过地址打开网络连接（和服务器通信）
			HttpURLConnection openConnection = (HttpURLConnection) url.openConnection();
			
		} catch(Exception e){
			
		}
	}
}
