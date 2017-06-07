package com.lily.file;

import java.io.*;

/**
 * 利用字节流InputStream读取文件内容
 * in.read(b):读取流in中的内容放在数组b中
 * 在输出时，不能直接输出byte数组，应将其转化为String类型输出
 * @author Administrator
 *
 */
public class InputStreamDemo {

	public static void main(String[] args) {
		try{
		File f=new File("test1.txt");
		InputStream in=new FileInputStream(f);
		byte[] b=new byte[(int)f.length()];
		while(in.read(b)>0){
			System.out.print(new String(b));
		}
		in.close();
		}catch(Exception e){}

	}

}
