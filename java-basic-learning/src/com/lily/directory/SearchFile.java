package com.lily.directory;

import java.io.*;

/**
 * ��ָ��Ŀ¼�²�����t��ͷ���ļ�
 * �ص㣺1.��ĳ���ַ���ͷ��string.startWith(string s) 
 * 2.�ļ�������string.contains(string s)
 * @author Administrator
 *
 */
public class SearchFile {

	public static void main(String[] args) {
		//1.�ж�ָ��Ŀ¼�Ƿ���Ŀ¼
		// 1.1�����Ŀ¼����ȡĿ¼�µ������ļ�������һ�����ж��ļ����Ƿ���t��ͷ
		//   1.1.1�������t��ͷ��������ļ���
		//   1.1.2������ǣ�continue
		// 1.2�������Ŀ¼��������ʾ��Ϣ
		 
		File f=new File("E:/Learn/Java/");
		if(f.isDirectory()){
			String[] filename=f.list();
			for(int i=0;i<filename.length;i++){
				if(filename[i].startsWith("j")||filename[i].contains("test")){
					System.out.println(filename[i]);
				}else{
					continue;
				}
			}			
		}else{
			System.out.println("ָ��Ŀ¼������Ŀ¼");
		}

	}
	

}
