package com.lily.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * �����ļ����ݡ�(���ַ�������ֻ�ܱ�֤����ȫ���ƣ����Ǹ�ʽ��һ��)
 * ��ȡ�����ļ������ݣ���������������ļ��У���ʵ�ָ���
 * @author Administrator
 *
 */
public class CopyFile_BufferReader {

	public static void main(String[] args) {
		File f1=new File("test1.txt");
		File f2=new File("test2.txt");
		//�ֲ����������ʼ��
		String s1= null;
		try{
			
			BufferedReader bf=new BufferedReader(new FileReader(f1));
			BufferedWriter bw=new BufferedWriter(new FileWriter(f2));
			while((s1=bf.readLine())!=null){
				bw.write(s1);
			}
			bf.close();
			bw.close();
			System.out.println(f1.getName()+" �ļ������Ѿ�copy��test2.txt ");
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

	
	
}
