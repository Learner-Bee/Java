package com.lily.file;

import java.io.*;

/**
 * 重命名文件名:Oldfile.renameTo(newfile)
 * @author Administrator
 *
 */
public class ReNameTo {

	public static void main(String[] args) {
		File f1=new File("test2.txt");
		File f2=new File("newfile.txt");
		if(f1.renameTo(f2)){
		    System.out.println(f1.getName()+"文件已经更名为"+f2.getName());
		}else{
			System.err.println("文件名称更换失败");
		}

	}

}
