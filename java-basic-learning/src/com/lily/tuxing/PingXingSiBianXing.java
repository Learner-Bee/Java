package com.lily.tuxing;

/**
 * ���ƽ���ı���
 * ��������n����ÿ�еĳ���m
 * @author Administrator
 *
 */
public class PingXingSiBianXing {

	public static void main(String[] args) {
		int n=3,m=4;
		for(int i=1;i<=3;i++){
			for(int j=n;j>i;j--)
				System.out.print(" ");
			for(int j=1;j<=m;j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
