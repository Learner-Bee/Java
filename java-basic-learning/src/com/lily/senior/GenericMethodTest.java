package com.lily.senior;

/**
 * ���ͷ���ʹ��
 * @author Administrator
 *
 */
public class GenericMethodTest {
	//���ͷ������������Ͳ�������<E>Ҫ�ڷ�����������֮ǰ
	public static < E > void printArray( E[] array){
		for(E element:array){
			System.out.printf("%s",element);
		}
		System.out.println();
	}
	public static void main(String[] args){
		//�����е����Ͳ���ֻ�ܴ����������ͣ�������ԭʼ���ͣ���int��char��double��
		Integer[] intArray={1,3,4,5};
		String[] strArray={"lily","lucy","mk"};
		Character[] charArray={'a','b','c'};
		Double[] doubleArray={2.2,4.3,34.4};
		
		System.out.println("�������飺");
		printArray(intArray);
		System.out.println("�ַ������飺");
		printArray(strArray);
		System.out.println("�ַ������飺");
		printArray(charArray);
		System.out.println("˫�����������飺");
		printArray(doubleArray);
		
		
	}

}
