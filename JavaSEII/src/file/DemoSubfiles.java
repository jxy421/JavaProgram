package file;

import java.io.File;

/**
 * �鿴Ŀ¼�µ���Ŀ¼���ļ�
 * @author sunddenly
 *
 */
public class DemoSubfiles {
	public static void main(String[] args){
		File dir=new File(".");
		if(dir.exists()&&dir.isDirectory()){
			File[] files=dir.listFiles();
			//ѭ������
			for (File file : files) {
				if(file.isFile()){
					System.out.println("�ļ���"+file.getName());
				}else{
					System.out.println("Ŀ¼" +
							"��"+file.getName());
				}
			}
		}
	}
}
