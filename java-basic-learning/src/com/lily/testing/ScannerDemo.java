package com.lily.testing;

import java.util.Scanner;

/**
 * ʹ��next������ȡ�û���������
 * @author Administrator
 *
 */
public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("next��ʽ���գ�");
		//�ڶ�ȡ����ǰ��Ҫͨ��hasNext�ж��Ƿ�����������
		if(scn.hasNext()){
			String str=scn.next();
			System.out.println("��������ݣ�"+str);
			//����next���ڿո���������ݲ���ȫ�������
		}
	}

}
