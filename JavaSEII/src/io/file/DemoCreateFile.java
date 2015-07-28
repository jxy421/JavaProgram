package io.file;

import java.io.File;
import java.io.IOException;

public class DemoCreateFile {
	public static void main(String[] args){
		//createFile1();
		createFile2();
	}

	private static void createFile2() {
		/**
		 * 步骤:
		 * 		1. 创建一个file实例，代表data.dat即将存放的目录
		 * 		2. 若该目录不存在，则创建不存在目录
		 * 		3. 创建一个file实例，代表data.dat文件
		 *         创建是基于上一个代表目录的File实例
		 *      4. 创建该文件data.dat
		 */
		try {
			//1
			File dir=new File("."+File.separator+"demo"+File.separator+"a");
			//2
			if(!dir.exists()){
				dir.mkdirs();
			}
			//3
			File file=new File(dir,"data.dat");
			//4
			if(!file.exists()){
				file.createNewFile();
			}
			System.out.println("文件创建成功！");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("文件创建失败！");
		}
	}

	private static void createFile1() throws IOException {
		File file = new File("."+File.separator+"demo"+File.separator+"A"
	                            +File.separator+"data.dat");
		if(!file.exists()){
			file.createNewFile();
			System.out.println("文件创建成功");
		}
	}
}
