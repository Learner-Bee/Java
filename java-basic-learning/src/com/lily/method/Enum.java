package com.lily.method;

/**
 * 枚举类型构造函数和方法的使用
 * @author Administrator
 *
 */
public class Enum {
	public static void main(String[] args) {
		for(Info c:Info.values()){
			System.out.println(c+"工资为："+c.getSalary());
		}

	}

}
enum Info{
	lily(15000) , mk(25000);
	private int salary;
	//构造函数没有传值，为什么能获得salary呢？
	Info(int s){
		salary=s;
	}
	int getSalary(){
		return salary;
	}
}
