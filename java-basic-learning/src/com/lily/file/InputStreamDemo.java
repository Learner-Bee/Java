package com.lily.file;

import java.io.*;

/**
 * �����ֽ���InputStream��ȡ�ļ�����
 * in.read(b):��ȡ��in�е����ݷ�������b��
 * �����ʱ������ֱ�����byte���飬Ӧ����ת��ΪString�������
 * @author Administrator
 *
 */
public class InputStreamDemo {

	public static void main(String[] args) {
		try{
		File f=new File("test1.txt");
		InputStream in=new FileInputStream(f);
		byte[] b=new byte[(int)f.length()];
		while(in.read(b)>0){
			System.out.print(new String(b));
		}
		in.close();
		}catch(Exception e){}

	}

}
