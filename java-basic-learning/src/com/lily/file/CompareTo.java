package com.lily.file;

import java.io.File;

/**
 * �Ƚ��ļ�·���Ƿ���ͬ
 * @author Administrator
 *
 */
public class CompareTo {

	public static void main(String[] args) {
		File f1=new File("E:/Learn/Java/test3/test3-1.txt");
		File f2=new File("E:/Learn/Java/test3/test3-2.txt");
		if(f1.compareTo(f2)==0){
			System.out.println("�ļ�·������ͬ");
		}else{
			System.out.println("�ļ�·������ͬ");
		}

	}

}