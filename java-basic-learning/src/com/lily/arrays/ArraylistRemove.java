package com.lily.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 通过数组名.remove()删除数组中元素
 * 1.数组名.remove(“a”)：直接删除数组中元素a
 * 2.数组名.remove(index):删除数组中index位置的元素
 * @author Administrator
 *
 */
public class ArraylistRemove {

	public static void main(String[] args) {
		List<String> a=new ArrayList<String>();
		a.add("a");
		a.add("b");
		System.out.println("删除前数组为："+a);
		a.remove("b");
		System.out.println("删除后数组为："+a);
		
		List<String> b=new ArrayList<String>();
		b.add(0, "lily");
		b.add(1,"lucy");
		System.out.println("删除前数组为："+b);
		b.remove(1);
		System.out.println("删除后数组为："+b);

	}

}
