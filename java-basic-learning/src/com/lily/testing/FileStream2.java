package com.lily.testing;


import java.io.*;


public class FileStream2 {

	public static void main(String[] args) throws IOException {
		File f=new File("test2.txt");
		FileOutputStream ops=new FileOutputStream(f);
		//����FileOutputStream����
		OutputStreamWriter writer=new OutputStreamWriter(ops,"gbk");
		//����OutputStreamWriter���󣬲�������ָ�����룬��ֹ��������
		writer.append("��������");
		//д�뵽������
		writer.append("\n");
		writer.append("english");
		writer.close();
		//�ر�д����
		ops.close();
		//�ر������
		
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