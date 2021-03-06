package com.lily.method;

/**
 * 阶乘的另外一种方法，递归方式实现给定数的阶乘
 * @author Administrator
 *
 */
public class JieChengDiGui {

	public static void main(String[] args) {
		int counter=5;
		//返回5以内的所有整数的阶乘
		for(int i=0;i<=counter;i++){
			System.out.println(i+"的阶乘为："+diGui(i));
		}
		//返回5的阶乘
		System.out.println(counter+"的阶乘为："+diGui(counter));

	}
	public static int diGui(int number){
		if(number==0||number==1){
			return 1;
		}else{
			return number*diGui(number-1);
		}
	} 

}
