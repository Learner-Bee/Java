package com.lily.testing;


import java.io.*;


public class FileStream2 {

	public static void main(String[] args) throws IOException {
		File f=new File("test2.txt");
		FileOutputStream ops=new FileOutputStream(f);
		//构建FileOutputStream对象
		OutputStreamWriter writer=new OutputStreamWriter(ops,"gbk");
		//构建OutputStreamWriter对象，参数可以指定编码，防止乱码现象。
		writer.append("中文输入");
		//写入到缓冲区
		writer.append("\n");
		writer.append("english");
		writer.close();
		//关闭写入流
		ops.close();
		//关闭输出流
		
		FileInputStream is=new FileInputStream("test2.txt");
		InputStreamReader reader=new InputStreamReader(is,"gbk");
		StringBuffer sb=new StringBuffer();
		while (reader.ready()){
			sb.append((char)reader.read());
		}
		System.out.println(sb.toString());
		reader.close();
		is.close();
		

	}

}
