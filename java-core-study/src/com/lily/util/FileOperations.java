package com.lily.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

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
	 * @param content
	 *            存放到文件的内容
	 * @param filePath
	 *            文件路径
	 * @throws IOException
	 */
	public static void storeIntoFile(String content, String filePath) throws IOException {

		FileOutputStream fos = new FileOutputStream(filePath);
		fos.write(content.getBytes());
		fos.flush();
		fos.close();
	}

	public static String readTxtFile(String filePath) throws IOException {

		File file = new File(filePath);
		if (file.isFile() && file.exists()) {
			String lineTxt = "";
			InputStreamReader read = new InputStreamReader(new FileInputStream(file));
			BufferedReader bfd = new BufferedReader(read);

			String temp = "";
			while ((temp = bfd.readLine()) != null) {
				if(lineTxt.equals("")){//说明是第一行
					lineTxt = temp;
				}else{
					lineTxt = lineTxt + "\n" + temp;
				}
			}
			read.close();

			return lineTxt;
		} else {
			return "找不到指定文件";
		}

	}

}