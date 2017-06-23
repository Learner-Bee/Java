package com.lily.file;

import java.io.File;
import java.io.IOException;

public class CreatFile1 {

	public static void main(String[] args) throws IOException {
		//1、给定文件路径
		//2、判断文件是否存在
		// 2.1如果存在，输出提示信息“文件已经存在”
		// 2.2如果不存在，先创建目录，再创建文件（若目录不存在，默认创建目录）
		
		File f=new File("E:/Learn/Java1/","test1.txt");
		if(f.exists()){
			System.out.println("文件已经存在");
		}else{
			f.getParentFile().mkdirs();//
			if(f.createNewFile()){
				System.out.println("文件创建成功");
			}
		}

	}

}
