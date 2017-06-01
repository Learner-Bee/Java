package com.lily.method;

/**
 * 斐波那契数列。以0和1开始，后面的数是前两个数的和
 * 利用数组实现
 * @author Administrator
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		int[] a=new int[10];
		a[0]=0;
		a[1]=1;
		System.out.println(a.length+"位的斐波那契数列为：");
		System.out.print(a[0]+" "+a[1]+" ");
		for(int i=2;i<a.length;i++){
			a[i]=a[i-1]+a[i-2];
			System.out.print(a[i]+" ");
			//每五个数换行。判断
			if((i+1)%5==0){
				System.out.println();
			}
		}
	}

}
