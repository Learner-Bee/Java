package com.lily.testing;

import java.io.*;

/**
 * ��ȡĿ¼������isDirectory()�����ж��Ƿ�ΪĿ¼
 * @author Administrator
 *
 */
public class DirList {

	public static void main(String[] args) {
		//����Ŀ¼��ַ
		String dirname="../test3";
		//����Ŀ¼����
		File f1=new File(dirname); 
		//�ж�
		if(f1.isDirectory()){
			String s[]=f1.list();
			for(int x=0;x<s.length;x++){
				File f2=new File(dirname+"/"+s[x]);
				if(f2.isDirectory()){
					System.out.println(s[x]+"��Ŀ¼");
				}else{
					System.out.println(s[x]+"���ļ�");
				}
			}
		}else{
			System.out.println(dirname+"���ļ�");
		}

	}

}
