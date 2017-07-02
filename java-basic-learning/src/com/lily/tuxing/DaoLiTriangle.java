package com.lily.tuxing;

/**
 * 输出倒立三角形
 * @author Administrator
 *
 */
public class DaoLiTriangle {

	public static void main(String[] args) {
		int n=3;
	    for(int i=1;i<=n;i++){
	    	for(int j=1;j<i;j++)
	    		System.out.print(" ");
	    	for(int j=n;j>=i;j--)
	    		System.out.print("*");
	    	for(int j=n;j>i;j--)
	    		System.out.print("*");
	    	System.out.println();
	    }
	    	
	}

}
