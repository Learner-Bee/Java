package com.lily.method;

/**
 * ���õݹ鷽��ʵ��쳲���������
 * @author Administrator
 *
 */
public class FibonacciDiGui {

	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<=n;i++){
			System.out.println(i+"��쳲���������Ϊ��"+diGui(i));
		}

	}
	public static int diGui(int number){
		if(number<=1){
			return number;
		}else{
			return diGui(number-1)+diGui(number-2);
		}
	}

}
