package com.lily.testing;

import java.util.Scanner;

/**
 * nextLine��ʽ�������ݣ����Զ�������Ŀո�
 * @author Administrator
 *
 */
public class NextLineTest {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		System.out.println("nextLine��ʽ���գ�");
		if(sca.hasNextLine()){
			String str=sca.nextLine();
			System.out.println("��������Ϊ��"+str);
		}

	}

}