package file;

import java.io.File;
import java.io.IOException;

/**
 * 删除一个文件
 * @author sunddenly
 *
 */
public class DemoDeleteFile {
	public static void main(String[] args) throws IOException{
		/**
		 * 删除根目录下的文件data.dat
		 * 注意：
		 * 		删除目录时  要确保该目录下没有任何子项
		 */
		//File file = new File("data.dat");
		File file = new File("demo"+File.separator+"A");
		//File file=new File("."+File.separator+"data.dat)
		if(file.exists()){
			//删除该文件
			
			if(file.delete()){
				System.out.println("删除成功！");
			}else{
				System.out.println("删除失败！");
			}
		}
		
		
	}
}
