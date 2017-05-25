package com.lily.senior;

/**
 * 泛型方法使用
 * @author Administrator
 *
 */
public class GenericMethodTest {
	//泛型方法声明。类型参数声明<E>要在方法返回类型之前
	public static < E > void printArray( E[] array){
		for(E element:array){
			System.out.printf("%s",element);
		}
		System.out.println();
	}
	public static void main(String[] args){
		//泛型中的类型参数只能代表引用类型，不能是原始类型（如int、char、double）
		Integer[] intArray={1,3,4,5};
		String[] strArray={"lily","lucy","mk"};
		Character[] charArray={'a','b','c'};
		Double[] doubleArray={2.2,4.3,34.4};
		
		System.out.println("整型数组：");
		printArray(intArray);
		System.out.println("字符串数组：");
		printArray(strArray);
		System.out.println("字符型数组：");
		printArray(charArray);
		System.out.println("双精度类型数组：");
		printArray(doubleArray);
		
		
	}

}
