package com.lily.file;

import java.io.*;

/**
 * 判断文件是否只读或可写。setReadOnly(),canWrite()返回boolean型
 * @author Administrator
 *
 */
public class SetReadOnly {

	public static void main(String[] args) {
		File f1=new File("test1.txt");
		File f2=new File("test2.txt");

		System.out.println("test1是否可读："+f1.setReadOnly());
		System.out.println("test2是否可写："+f2.canWrite());
		

	}

}
