package com.lily.file;

import java.io.*;

/**
 * 创建临时文件File.creatTempFile(String filename,String 后缀名)
 * @author Administrator
 *
 */
public class CreatTempFile {

	public static void main(String[] args) {
		try{
		File temp=File.createTempFile("tempfile",null);
		BufferedWriter buff=new BufferedWriter(new FileWriter(temp));
		buff.write("this is temp file");
		buff.close();
		System.out.println("临时文件已创建");
		}catch(Exception e){}

	}

}
