package com.lily.directory;

import java.io.*;

/**
 * ���ָ��Ŀ¼�µ�����Ŀ¼
 * @author Administrator
 *
 */
public class DirOfDir {

	public static void main(String[] args) {
		//��ȡָ��Ŀ¼�µ�����Ŀ¼
		//1.�ж��Ƿ���Ŀ¼
		// 1.1����ǣ���ȡĿ¼������ļ���ѭ�������ļ������ж��Ƿ�ΪĿ¼
		//   1.1.1�������Ŀ¼��continue����ִ��ѭ��
		//   1.1.2�����Ŀ¼�����Ŀ¼��
		// 1.2������ǣ������ʾ��Ϣ������Ŀ¼
		
		File f=new File("E:/Learn/Java/test3/");
		getDir(f);
			
	}
	public static void getDir(File f){
		if(f.isDirectory()){
			String[] filename=f.list();
			for(int i=0;i<filename.length;i++){
				//File f3=new File(filename[i]); //ֻд�ļ�������ȡ��ֻ���ļ���
				File f2=new File(f,filename[i]); //���ļ�·�����ļ������õ����ļ��ľ���·��
				if(!f2.isDirectory()){
				//if( !new File(filename[i]).isDirectory()){
					continue;
				}else{
					System.out.println(filename[i]);
				}
			}
			
		}else{
			System.out.println("ָ���ĵ�ַ����Ŀ¼");
		}
		
	}

}