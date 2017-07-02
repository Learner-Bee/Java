package com.lily.file;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * 文件写入write()使用
 * @author Administrator
 *
 */
public class Write {

	public static void main(String[] args) {
		try{
			BufferedWriter bw=new BufferedWriter(new FileWriter("test.txt"));
			bw.write("文件写入");
			bw.close();
			System.out.println("文件创建成功");
		}catch(Exception e){}

	}

}
