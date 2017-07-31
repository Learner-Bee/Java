package com.lily.file;

import java.io.*;

/**
 * 利用字节流InputStream实现复制文件
 * in.read(b):读取流in中的内容放在数组b中
 * 在输出时，不能直接输出byte数组，应将其转化为String类型输出
 * @author Administrator
 *
 */
public class CopyFile_InputStream {

	public static void main(String[] args) {
		try{
		File f=new File("test1.txt");
		InputStream in=new FileInputStream(f);
		OutputStream out=new FileOutputStream("test3.txt");
		byte[] b=new byte[(int)f.length()];
		while(in.read(b)!=-1){
			out.write(b);
		}
		in.close();
		out.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
