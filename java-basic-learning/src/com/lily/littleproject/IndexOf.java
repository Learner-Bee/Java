package com.lily.littleproject;

public class IndexOf {

	public static void main(String[] args) {
		String a="hello, my name is lily";
		String b="lily";
		subStrIndex(a,b);

	}
	public static void subStrIndex(String a,String b){
		int index=a.indexOf(b);
		System.out.println(a+" �����ַ���"+b+"��һ�γ��ֵ�λ��Ϊ��"+ index);
	}

}
