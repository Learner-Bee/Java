package com.lily.method;

/**
 * switch关键字使用、创建枚举类型的关键字enum的使用
 * 
 * @author Administrator
 *
 */
public class Swtich {

	public static void main(String[] args) {
		Car c;//定义枚举类型c
		c=Car.lucy;//将枚举中的元素赋值给c
		switch(c){
		case lily:
			System.out.println("lily");
			break;
		case lucy:
			System.out.println("lucy");
			break;
		case mk:
			System.out.println("mk");
			break;
		}

	}

}
enum Car{
	lily,lucy,mk;
}