package com.lily.testing;

import java.util.Scanner;

/**
 * �ж����������������С��
 * @author Administrator
 *
 */
public class Scanner1 {

	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    //���ռ�������
	    int i;
	    float f;
	    System.out.println("����������");
	    //hasNextInt()�ж������Ƿ�Ϊ����
	    if(scan.hasNextInt()){
	    	i=scan.nextInt();
	    	System.out.println("���������Ϊ��"+i);
	    }else{
	    	System.out.println("����Ĳ�������");
	    }
	    System.out.println("����С����");
	    //hasNextFloat()�ж������Ƿ�Ϊ������
	    if(scan.hasNextFloat()){
	    	f=scan.nextFloat();
	    	System.out.println("�����С��Ϊ:"+f);
	    }else{
	    	System.out.println("����Ĳ���С��");
	    }

	}

}
