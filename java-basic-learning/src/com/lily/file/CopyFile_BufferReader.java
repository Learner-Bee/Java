package com.lily.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 复制文件内容。(用字符流复制只能保证内容全复制，但是格式不一致)
 * 读取已有文件的内容，将内容输出到新文件中，即实现复制
 * @author Administrator
 *
 */
public class CopyFile_BufferReader {

	public static void main(String[] args) {
		File f1=new File("test1.txt");
		File f2=new File("test2.txt");
		//局部变量必须初始化
		String s1= null;
		try{
			
			BufferedReader bf=new BufferedReader(new FileReader(f1));
			BufferedWriter bw=new BufferedWriter(new FileWriter(f2));
			while((s1=bf.readLine())!=null){
				bw.write(s1);
			}
			bf.close();
			bw.close();
			System.out.println(f1.getName()+" 文件内容已经copy到test2.txt ");
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

	
	
}
