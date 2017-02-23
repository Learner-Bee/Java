package com.lily.util;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件操作工具类
 * 
 * @author Lily
 *
 */
public class FileOperations {

	/**
	 * 将输出内容存放到文件中
	 * 
	 * @param content	存放到文件的内容
	 * @param filePath	文件路径
	 * @throws IOException
	 */
	public static void storeIntoFile(String content , String filePath) throws IOException {

		FileOutputStream fos = new FileOutputStream(filePath);
		fos.write(content.getBytes());
		fos.flush();
		fos.close();

	}

}