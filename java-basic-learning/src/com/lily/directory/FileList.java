package com.lily.directory;

import java.io.*;

/**
 * ��ȡָ��Ŀ¼�µ������ļ�
 * ��ȡָ��Ŀ¼�µ������ļ�list()����
 * ��ȡ�ļ���ǰĿ¼��file.getParent()
 * @author Administrator
 *
 */
public class FileList {

	public static void main(String[] args) {
		
		//File f2=new File("E:/Learn/Java/test3/test3-2.txt");
		//System.out.println(f2.getParent());//��ȡ�ļ��ϼ�Ŀ¼
		
		File f1=new File("E:/learn/Java/java-basic-learning");
		if(!f1.isDirectory()){
			System.out.println("����Ŀ¼");
		}else{
			String[] file=f1.list();
			for(String i:file){
				System.out.println(i);
			}
			
		}

	}

}
