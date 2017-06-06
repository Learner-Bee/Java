package com.lily.file;

import java.io.*;

/**
 * 获取文件大小length()
 * @author Administrator
 *
 */
public class FileLength {

	public static void main(String[] args) {
		File f=new File("test3.txt");
		if(!f.exists()||!f.isFile()){
			System.out.println("文件不存在或非文件");
		}else{
			System.out.println("文件大小为: "+f.length());
		}

	}

}
