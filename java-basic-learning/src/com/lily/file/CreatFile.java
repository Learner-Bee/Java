package com.lily.file;

import java.io.*;
import java.util.Date;

/**
 * ����ָ���ļ�·�����ļ�/��ȡ�ļ�����޸�ʱ��f.lastModified()
 * new File(·�������ļ���)
 * 1.�ж��ļ��Ƿ����
 * 2.�����ڣ��ȴ����ļ�����Ŀ¼��
 * 3.Ȼ�󴴽��ļ�
 * @author Administrator
 *
 */
public class CreatFile {

	public static void main(String[] args) {
		String directory="E:/Learn/Java/test3";
		String file="test3-1.txt";
		File f=new File(directory,file);
		if(f.exists()){
			String path=f.getAbsolutePath();
			String name=f.getName();
			System.out.println("�ļ��Ѿ����ڣ�·������"+path);
			System.out.println("�ļ�����"+name);
		}else{
			
			f.getParentFile().mkdir();//���������ļ�����Ŀ¼
			try{
			if(f.createNewFile()){
				System.out.println("�ļ������ɹ�");
			}
			//��ȡ�ļ�����޸�ʱ��
			Long lastmodified=f.lastModified();
			Date date=new Date(lastmodified);
			System.out.println("�ļ�����޸�ʱ�䣺"+date);
			
			}catch(Exception e){
				System.out.println("�����ļ�ʱ���ִ���");
			}
		}

	}

}