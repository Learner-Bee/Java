package com.lily.testing;

public class Swap {

	public static void main(String[] args) {
		int num1=1,num2=2;
		System.out.println("交换前num1 "+num1+" num2 "+num2);
		swap(num1,num2);
		System.out.println("交换后num1 "+num1+" num2 "+num2);
	}
    public static void swap(int n1,int n2){
    	System.out.println("swap方法中交换前num1 "+n1+" num2 "+n2);
    	int temp;
    	temp=n2;
    	n2=n1;
    	n1=temp;
    	System.out.println("swap方法中交换后num1 "+n1+" num2 "+n2);
    }
}
