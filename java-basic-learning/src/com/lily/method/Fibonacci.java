package com.lily.method;

/**
 * 쳲��������С���0��1��ʼ�����������ǰ�������ĺ�
 * ��������ʵ��
 * @author Administrator
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		int[] a=new int[10];
		a[0]=0;
		a[1]=1;
		System.out.println(a.length+"λ��쳲���������Ϊ��");
		System.out.print(a[0]+" "+a[1]+" ");
		for(int i=2;i<a.length;i++){
			a[i]=a[i-1]+a[i-2];
			System.out.print(a[i]+" ");
			//ÿ��������С��ж�
			if((i+1)%5==0){
				System.out.println();
			}
		}
	}

}