package com.lily.testing;

public class StaticVariable {
	//salary是静态的私有变量
    private static double salary;
    //department是一个常量.当被public和final声明时，变量名应大写
    public static final String DEPARTMENT="开发人员";
	public static void main(String[] args) {
		salary=10000;
		System.out.println(DEPARTMENT +"平均工资："+salary);

	}

}
