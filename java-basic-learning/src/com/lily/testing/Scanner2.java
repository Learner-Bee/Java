package com.lily.testing;

import java.util.Scanner;


/**
 * �ж�����Ϊdouble����hasNextDouble()
 * @author Administrator
 *
 */
public class Scanner2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double sum=0;
		int i=0;
		System.out.println("�������֣���������ֽ�����");
		while(scan.hasNextDouble()){
			double x=scan.nextDouble();
			i=i+1;
			sum=sum+x;
		}
		System.out.println(i+"�����ĺ�Ϊ"+sum);
		System.out.println(i+"������ƽ����Ϊ"+(sum/i));

	}

}