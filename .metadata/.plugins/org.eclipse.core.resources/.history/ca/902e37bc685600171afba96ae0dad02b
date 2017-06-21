package com.lily.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 复制文件内容。
 * 读取已有文件的内容，将内容输出到新文件中，即实现复制
 * @author Administrator
 *
 */
public class CopyFile {

	public static void main(String[] args) {
		File f1=new File("test1.txt");
		//局部变量必须初始化
		String s1,s2 = null;
		try{
			
			BufferedReader bf=new BufferedReader(new FileReader(f1));
			while((s1=bf.readLine())!=null){
				s2=s1;
			}
			bf.close();
			BufferedWriter bw=new BufferedWriter(new FileWriter("test2.txt"));
			bw.write(s2);
			bw.close();
			System.out.println(f1.getName()+" 文件内容已经copy到test2.txt ");
			
		}catch(Exception e){}

	}

}
