package com.lily.file;

import java.io.*;

/**
 * ��ȡ�ļ���Сlength()
 * @author Administrator
 *
 */
public class FileLength {

	public static void main(String[] args) {
		File f=new File("test3.txt");
		if(!f.exists()||!f.isFile()){
			System.out.println("�ļ������ڻ���ļ�");
		}else{
			System.out.println("�ļ���СΪ: "+f.length());
		}

	}

}
