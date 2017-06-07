package com.lily.directory;

import java.io.*;

/**
 * 删除目录
 * 1.判断目录是否是目录，如果是，遍历目录中的文件，逐个删除
 * 2.最后删除目录
 * @author Administrator
 *
 */
public class DeleteDir {

	public static void main(String[] args) {
		String dir="E:/Learn/Java/test3/";
		File f=new File(dir);
		if(f.isDirectory()){
			String[] s=f.list();
			for(int i=0;i<s.length;i++){
				File f2=new File(s[i]);
				f2.delete();
			}
			f.delete();
		}
		if(!f.exists()){
			System.out.println("删除目录成功");
		}else{
			System.out.println("删除目录失败");
		}

	}

}
