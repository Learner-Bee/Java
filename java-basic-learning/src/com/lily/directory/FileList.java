package com.lily.directory;

import java.io.*;

/**
 * ��ȡָ��Ŀ¼�µ������ļ�list()����
 * ��ȡ�ļ���ǰĿ¼��file.getParent()
 * @author Administrator
 *
 */
public class FileList {

	public static void main(String[] args) {
		
		File f2=new File("E:/Learn/Java/test3/test3-2.txt");
		System.out.println(f2.getParent());//��ȡ�ļ��ϼ�Ŀ¼
		
		File f1=new File("E:/Learn/Java/test3/");
		String[] file=f1.list();
		if(file.length==0){
			System.out.println("��Ŀ¼Ϊ��");
		}else{
			for(int i=0;i<file.length;i++){
				System.out.println(new File(file[i]));
			}
			
		}

	}

}