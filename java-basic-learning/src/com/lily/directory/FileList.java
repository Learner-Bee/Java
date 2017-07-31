package com.lily.directory;

import java.io.*;

/**
 * 获取指定目录下的所有文件
 * 获取指定目录下的所有文件list()方法
 * 获取文件当前目录：file.getParent()
 * @author Administrator
 *
 */
public class FileList {

	public static void main(String[] args) {
		
		//File f2=new File("E:/Learn/Java/test3/test3-2.txt");
		//System.out.println(f2.getParent());//获取文件上级目录
		
		File f1=new File("E:/learn/Java/java-basic-learning");
		if(!f1.isDirectory()){
			System.out.println("不是目录");
		}else{
			String[] file=f1.list();
			for(String i:file){
				System.out.println(i);
			}
			
		}

	}

}
