package com.lily.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * ͨ��������.remove()ɾ��������Ԫ��
 * 1.������.remove(��a��)��ֱ��ɾ��������Ԫ��a
 * 2.������.remove(index):ɾ��������indexλ�õ�Ԫ��
 * @author Administrator
 *
 */
public class ArraylistRemove {

	public static void main(String[] args) {
		List<String> a=new ArrayList<String>();
		a.add("a");
		a.add("b");
		System.out.println("ɾ��ǰ����Ϊ��"+a);
		a.remove("b");
		System.out.println("ɾ��������Ϊ��"+a);
		
		List<String> b=new ArrayList<String>();
		b.add(0, "lily");
		b.add(1,"lucy");
		System.out.println("ɾ��ǰ����Ϊ��"+b);
		b.remove(1);
		System.out.println("ɾ��������Ϊ��"+b);

	}

}
