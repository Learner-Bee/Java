package com.lily.testing;

import java.util.Scanner;

/**
 * nextLine方式接收数据，可以读入输入的空格
 * @author Administrator
 *
 */
public class NextLineTest {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		System.out.println("nextLine方式接收：");
		if(sca.hasNextLine()){
			String str=sca.nextLine();
			System.out.println("输入数据为："+str);
		}

	}

}
