package com.lily.tuxing;

/**
 * 输出指定行数的三角形
 * 将三角形划分为三个图形
 * @author Administrator
 *
 */
public class Triangle {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++){
			
			for(int j=n;j>i;j--){
				System.out.print(" ");
			}//第一个三角形：j从5开始循环，当j大于i时，输出空白
			
			for(int j=1;j<=i;j++){
			System.out.print("*");
			}//第二个图形：j从1开始，当j<=i时，输出*
			
			for(int j=1;j<i;j++){
				System.out.print("*");
			}//第三个图形：跟第一个图形一样，只是相反而已
			System.out.println();
		}

	}
	

}
