package com.lily.file;

import java.io.*;

/**
 * ָ���ַ������ļ��г��ֵĴ���
 * ˼·��
 * 1���������ѯ���ַ������ļ���
 * 2������BufferedReader  br����ȡ�ļ�����
 * 3����ȡÿ�����ݣ����в��ҡ���br.readline()��=nullʱ����ʾ�ļ���Ϊ��
 * 4����ÿ�е����ݽ���ѭ���жϣ���ȡ��ָ��λ�ÿ�ʼ���ַ������ֵ�λ�á�
 *   4.1�����õ�index>=0,˵�����ڸ��ַ�����count+1.�Ҽ���ѭ��ִ��4.���ҵڶ��ε���ʼλ��Ӧ��Ϊindex+1
 *   4.2��index=-1ʱ��˵����һ�ж�û�и��ַ�����break������4��ѭ��������ִ��3����ȡ��һ�е�����
 * @author Administrator
 *
 */
public class CountOfString {

	public static void main(String[] args) {
		String s1="test1";
		File f1=new File("test1.txt");
		System.out.println(f1+" ��ƥ�䵽 "+s1 +"����Ϊ�� "+count(f1,s1));
		
	}
	public static int count(File f,String s){
		int counts=0;
		int index=-1;
		String s2="";
		try{
		BufferedReader br=new BufferedReader(new FileReader(f));
		while((s2=br.readLine())!=null){
			while(true){
			   index =s2.indexOf(s, index+1);
			if(index>=0){
				counts++;
			}else{
				break;
			}
			}
		}
		return counts;
		}catch(Exception e){
			System.err.println(e);
			return 0;
		}
	}
		

}
