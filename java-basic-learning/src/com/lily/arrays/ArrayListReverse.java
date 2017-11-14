package com.lily.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 利用Collections.reverse()反转arraylist。
 * 通过arraylist.contains()判断数组中是否包含某元素
 * @author Administrator
 *
 */
public class ArrayListReverse {

	public static void main(String[] args) {
		List<Object> arraylist=new ArrayList<Object>();
		arraylist.add("l");
		arraylist.add(1);
		arraylist.add("i");
		arraylist.add("l");
		arraylist.add("y");
		arraylist.remove(1);
		Collections.reverse(arraylist);
		System.out.println(arraylist);
        System.out.println("数组arraylist中是否有a元素："+arraylist.contains("a"));
	}

}
 
	

