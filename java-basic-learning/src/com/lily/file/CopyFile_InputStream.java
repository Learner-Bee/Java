package com.lily.file;

import java.io.*;

/**
 * �����ֽ���InputStreamʵ�ָ����ļ�
 * in.read(b):��ȡ��in�е����ݷ�������b��
 * �����ʱ������ֱ�����byte���飬Ӧ����ת��ΪString�������
 * @author Administrator
 *
 */
public class CopyFile_InputStream {

	public static void main(String[] args) {
		try{
		File f=new File("test1.txt");
		InputStream in=new FileInputStream(f);
		OutputStream out=new FileOutputStream("test3.txt");
		byte[] b=new byte[(int)f.length()];
		while(in.read(b)!=-1){
			out.write(b);
		}
		in.close();
		out.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
