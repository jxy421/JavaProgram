package io.file;

import java.io.File;

/**
 * 使用File类创建目录
 * @author sunddenly
 *
 */
public class DemoFileDir {
	public static void main(String[] args) {
		try {
			/**
			 * 在项目的根目录下创建demo目录并创建A目录
			 */
			File filedir = new File("."+File.separator+"demo"+
										File.separator+"A");
			if(!filedir.exists()){
				//mkdirs 将不存在的父目录也创建出来
				filedir.mkdirs();
				System.out.println("创建目录成功！");
			}
		} catch (Exception e) {
			System.out.println("目录创建失败！");
		}
	}
}
