package com.lily.senior;

import java.util.ArrayList;
import java.util.List;


/**
 * ÀàĞÍÍ¨Åä·û
 * @author Administrator
 *
 */
public class GenericTest {
	
	public static void getData(List<?> date){
		System.out.println(date.get(0));
	}

	public static void main(String[] args) {
		
		List<Integer> integer=new ArrayList<Integer>();
		integer.add(3);
		getData(integer);

	}

}
