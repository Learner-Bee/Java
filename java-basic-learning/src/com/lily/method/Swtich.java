package com.lily.method;

/**
 * switch�ؼ���ʹ�á�����ö�����͵Ĺؼ���enum��ʹ��
 * 
 * @author Administrator
 *
 */
public class Swtich {

	public static void main(String[] args) {
		Car c;//����ö������c
		c=Car.lucy;//��ö���е�Ԫ�ظ�ֵ��c
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