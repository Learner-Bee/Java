package com.lily.littleproject;

/**
 * ���õݹ�ʵ��5�Ľ׳�
 * @author Administrator
 *
 */
public class JieCheng {

	public static void main(String[] args) {
		int a=5;
		
		System.out.println(multy(a));

	}
	public static int multy(int a){ 
		if(a>1){
			return a*multy(a-1);
		}else {
			return 1;
		}
		//System.out.println(a*b);
	}

}
