package com.lily.testing;

import java.util.Scanner;


/**
 * 判断输入为double类型hasNextDouble()
 * @author Administrator
 *
 */
public class Scanner2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double sum=0;
		int i=0;
		System.out.println("输入数字，输入非数字结束：");
		while(scan.hasNextDouble()){
			double x=scan.nextDouble();
			i=i+1;
			sum=sum+x;
		}
		System.out.println(i+"个数的和为"+sum);
		System.out.println(i+"个数的平均数为"+(sum/i));

	}

}
