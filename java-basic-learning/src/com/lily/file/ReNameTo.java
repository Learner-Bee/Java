package com.lily.file;

import java.io.*;

/**
 * �������ļ���:Oldfile.renameTo(newfile)
 * @author Administrator
 *
 */
public class ReNameTo {

	public static void main(String[] args) {
		File f1=new File("test2.txt");
		File f2=new File("newfile.txt");
		if(f1.renameTo(f2)){
		    System.out.println(f1.getName()+"�ļ��Ѿ�����Ϊ"+f2.getName());
		}else{
			System.err.println("�ļ����Ƹ���ʧ��");
		}

	}

}