package com.lily.testing;

import java.io.File;

/**
 * �����ļ���
 * @author Administrator
 *
 */
public class CreatDir {

	public static void main(String[] args) {
		//�����ļ������ƣ�../��ʾ��ǰ�ļ�����
		String dirname="../test3";
		File d=new File(dirname);
		d.mkdir();
		System.out.println("OK");

	}

}
