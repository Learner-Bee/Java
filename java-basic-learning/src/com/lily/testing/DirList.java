package com.lily.testing;

import java.io.*;

/**
 * 读取目录，调用isDirectory()方法判断是否为目录
 * @author Administrator
 *
 */
public class DirList {

	public static void main(String[] args) {
		//定义目录地址
		String dirname="../test3";
		//声明目录对象
		File f1=new File(dirname); 
		//判断
		if(f1.isDirectory()){
			String s[]=f1.list();
			for(int x=0;x<s.length;x++){
				File f2=new File(dirname+"/"+s[x]);
				if(f2.isDirectory()){
					System.out.println(s[x]+"是目录");
				}else{
					System.out.println(s[x]+"是文件");
				}
			}
		}else{
			System.out.println(dirname+"是文件");
		}

	}

}
