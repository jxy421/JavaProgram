package file;

import java.io.File;
import java.io.IOException;

/**
 * ɾ��һ���ļ�
 * @author sunddenly
 *
 */
public class DemoDeleteFile {
	public static void main(String[] args) throws IOException{
		/**
		 * ɾ����Ŀ¼�µ��ļ�data.dat
		 * ע�⣺
		 * 		ɾ��Ŀ¼ʱ  Ҫȷ����Ŀ¼��û���κ�����
		 */
		//File file = new File("data.dat");
		File file = new File("demo"+File.separator+"A");
		//File file=new File("."+File.separator+"data.dat)
		if(file.exists()){
			//ɾ�����ļ�
			
			if(file.delete()){
				System.out.println("ɾ���ɹ���");
			}else{
				System.out.println("ɾ��ʧ�ܣ�");
			}
		}
		
		
	}
}
