package com.lily.file;

import java.io.*;
import java.util.Date;

/**
 * 创建指定文件路径的文件/获取文件最后修改时间f.lastModified()
 * new File(路径名，文件名)
 * 1.判断文件是否存在
 * 2.不存在，先创建文件所在目录。
 * 3.然后创建文件
 * @author Administrator
 *
 */
public class CreatFile {

	public static void main(String[] args) {
		String directory="E:/Learn/Java/";
		String file="test3-2.txt";
		File f=new File(directory,file);
		if(f.exists()){
			String path=f.getAbsolutePath();
			String name=f.getName();
			System.out.println("文件已经存在：路径名："+path);
			System.out.println("文件名："+name);
		}else{
			
			f.getParentFile().mkdir();//创建文件所在目录
			try{
			if(f.createNewFile()){
				System.out.println("文件创建成功");
			}
			//获取文件最后修改时间
			Long lastmodified=f.lastModified();
			Date date=new Date(lastmodified);
			System.out.println("文件最后修改时间："+date);
			
			}catch(Exception e){
				System.out.println("创建文件时出现错误");
			}
		}

	}

}
