package com.lily.arrays;

import java.util.ArrayList;

/**
 * ͨ��������.remove()ɾ��������Ԫ��
 * 1.������.remove(��a��)��ֱ��ɾ��������Ԫ��a
 * 2.������.remove(index):ɾ��������indexλ�õ�Ԫ��
 * @author Administrator
 *
 */
public class ArrayRemove {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("a");
		a.add("b");
		System.out.println("ɾ��ǰ����Ϊ��"+a);
		a.remove("b");
		System.out.println("ɾ��������Ϊ��"+a);
		
		ArrayList b=new ArrayList();
		b.add(0, "lily");
		b.add(1,"lucy");
		System.out.println("ɾ��ǰ����Ϊ��"+b);
		b.remove(1);
		System.out.println("ɾ��������Ϊ��"+b);

	}

}
