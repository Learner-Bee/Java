package com.lily.directory;

import java.io.*;

/**
 * 在指定目录下查找以t开头的文件
 * 重点：1.以某个字符开头：string.startWith(string s) 
 * 2.文件包含：string.contains(string s)
 * @author Administrator
 *
 */
public class SearchFile {

	public static void main(String[] args) {
		//1.判断指定目录是否是目录
		// 1.1如果是目录，获取目录下的所有文件名，逐一遍历判断文件名是否以t开头
		//   1.1.1如果是以t开头，输出该文件名
		//   1.1.2如果不是，continue
		// 1.2如果不是目录。给出提示信息
		 
		File f=new File("E:/Learn/Java/");
		if(f.isDirectory()){
			String[] filename=f.list();
			for(int i=0;i<filename.length;i++){
				if(filename[i].startsWith("j")||filename[i].contains("test")){
					System.out.println(filename[i]);
				}else{
					continue;
				}
			}			
		}else{
			System.out.println("指定目录并非是目录");
		}

	}
	

}
