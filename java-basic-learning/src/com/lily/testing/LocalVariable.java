package com.lily.testing;

public class LocalVariable {
	
	public void pupAge(){ 
		int age=0;
		age=age+7;
		System.out.println("С�����䣺"+age);
	}

	public static void main(String[] args) {
        LocalVariable LV=new LocalVariable();
        LV.pupAge();

	}

}
