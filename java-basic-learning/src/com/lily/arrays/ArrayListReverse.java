package com.lily.arrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 利用Collections.reverse()反转arraylist。
 * 通过arraylist.contains()判断数组中是否包含某元素
 * @author Administrator
 *
 */
public class ArrayListReverse {

	public static void main(String[] args) {
		ArrayList arraylist=new ArrayList();
		arraylist.add("l");
		arraylist.add("i");
		arraylist.add("l");
		arraylist.add("y");
		Collections.reverse(arraylist);
		System.out.println(arraylist);
        System.out.println("数组arraylist中是否有a元素："+arraylist.contains("a"));
	}

}
 class a{
	
}
