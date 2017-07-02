package com.lily.tuxing;

/**
 * 输出m行n列的矩形
 * @author Administrator
 *
 */
public class JuXing {

	public static void main(String[] args) {
		int m=5,n=6;
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
