package com.lily.file;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * �ļ�д��write()ʹ��
 * @author Administrator
 *
 */
public class Write {

	public static void main(String[] args) {
		try{
			BufferedWriter bw=new BufferedWriter(new FileWriter("test.txt"));
			bw.write("�ļ�д��");
			bw.close();
			System.out.println("�ļ������ɹ�");
		}catch(Exception e){}

	}

}
