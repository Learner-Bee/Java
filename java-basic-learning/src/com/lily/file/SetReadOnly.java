package com.lily.file;

import java.io.*;

/**
 * �ж��ļ��Ƿ�ֻ�����д��setReadOnly(),canWrite()����boolean��
 * @author Administrator
 *
 */
public class SetReadOnly {

	public static void main(String[] args) {
		File f1=new File("test1.txt");
		File f2=new File("test2.txt");

		System.out.println("test1�Ƿ�ɶ���"+f1.setReadOnly());
		System.out.println("test2�Ƿ��д��"+f2.canWrite());
		

	}

}
