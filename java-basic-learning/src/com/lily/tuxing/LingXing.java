package com.lily.tuxing;

/**
 * �������
 * @author Administrator
 *
 */
public class LingXing {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=(n/2+1);i++){
			for(int j=n/2;j>=i;j--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print("*");
			for(int j=1;j<i;j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=1;i<=(n-(n/2+1));i++){
			for(int j=1;j<=i;j++)
				System.out.print(" ");
			for(int j=(n-(n/2+1));j>=i;j--)
				System.out.print("*");
			for(int j=(n-(n/2+1));j>i;j--)
				System.out.print("*");
			System.out.println();
		}

	}

}
