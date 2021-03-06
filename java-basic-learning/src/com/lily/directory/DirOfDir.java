package com.lily.directory;

import java.io.*;

/**
 * 获得指定目录下的所有目录
 * @author Administrator
 *
 */
public class DirOfDir {

	public static void main(String[] args) {
		//获取指定目录下的所有目录
		//1.判断是否是目录
		// 1.1如果是，获取目录下面的文件，循环遍历文件名，判断是否为目录
		//   1.1.1如果不是目录，continue继续执行循环
		//   1.1.2如果是目录，输出目录名
		// 1.2如果不是，输出提示信息。不是目录
		
		File f=new File("E:/Learn/Java/test3/");
		getDir(f);
			
	}
	public static void getDir(File f){
		if(f.isDirectory()){
			String[] filename=f.list();
			for(int i=0;i<filename.length;i++){
				//File f3=new File(filename[i]); //只写文件名，获取的只是文件名
				File f2=new File(f,filename[i]); //（文件路径，文件名）得到的文件的绝对路径
				if(!f2.isDirectory()){
				//if( !new File(filename[i]).isDirectory()){
					continue;
				}else{
					System.out.println(filename[i]);
				}
			}
			
		}else{
			System.out.println("指定的地址不是目录");
		}
		
	}

}
