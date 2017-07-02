package com.lily.arrays;

import java.util.ArrayList;

/**
 * 通过数组名.remove()删除数组中元素
 * 1.数组名.remove(“a”)：直接删除数组中元素a
 * 2.数组名.remove(index):删除数组中index位置的元素
 * @author Administrator
 *
 */
public class ArrayRemove {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("a");
		a.add("b");
		System.out.println("删除前数组为："+a);
		a.remove("b");
		System.out.println("删除后数组为："+a);
		
		ArrayList b=new ArrayList();
		b.add(0, "lily");
		b.add(1,"lucy");
		System.out.println("删除前数组为："+b);
		b.remove(1);
		System.out.println("删除后数组为："+b);

	}

}
