package com.lily.file;

import java.io.*;

/**
 * ������ʱ�ļ�File.creatTempFile(String filename,String ��׺��)
 * @author Administrator
 *
 */
public class CreatTempFile {

	public static void main(String[] args) {
		try{
		File temp=File.createTempFile("tempfile",null);
		BufferedWriter buff=new BufferedWriter(new FileWriter(temp));
		buff.write("this is temp file");
		buff.close();
		System.out.println("��ʱ�ļ��Ѵ���");
		}catch(Exception e){}

	}

}
