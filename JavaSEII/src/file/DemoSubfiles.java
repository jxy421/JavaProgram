package file;

import java.io.File;

/**
 * 查看目录下的子目录和文件
 * @author sunddenly
 *
 */
public class DemoSubfiles {
	public static void main(String[] args){
		File dir=new File(".");
		if(dir.exists()&&dir.isDirectory()){
			File[] files=dir.listFiles();
			//循环子项
			for (File file : files) {
				if(file.isFile()){
					System.out.println("文件："+file.getName());
				}else{
					System.out.println("目录" +
							"："+file.getName());
				}
			}
		}
	}
}
