package com.lily.file;
import java.io.*;

/**
 * ��ָ���ļ����������
 * �ص㣺FileWriter()��ʹ�á�FileWriter(String filename��boolean append)
 * ��FileWriter(�ļ�����true)ʱ����ʾ���������ļ��Ĳ�������д,�����Ǹ���
 * @author Administrator
 *
 */
public class AddStrFile {

	public static void main(String[] args) {
		try{
			BufferedWriter bw=new BufferedWriter(new FileWriter("test1.txt",true));
			String a="add new string3";
			bw.append(a);
			bw.close();
			
			BufferedReader br=new BufferedReader(new FileReader("test1.txt"));
			String b=null;
			while((b=br.readLine())!=null){
				System.out.println(b);
			}
			
		}catch(Exception e){}

	}

}
