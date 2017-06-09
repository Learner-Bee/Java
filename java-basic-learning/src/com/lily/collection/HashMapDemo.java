package com.lily.collection;

import java.util.*;

/**
 * hashmap遍历
 * @author Administrator
 *
 */
public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,String> hamp=new HashMap<String,String>();
		hamp.put("1", "Saturday");
		hamp.put("2", "Sunday");
		
		System.out.println("通过map.keySet()遍历map：");
		for(String a:hamp.keySet()){
			System.out.println("key="+a+" value="+hamp.get(a));
		}
		
		System.out.println("通过迭代器遍历map：");
		Iterator<Map.Entry<String,String>> itea=hamp.entrySet().iterator();
		while(itea.hasNext()){
			Map.Entry<String, String> en=itea.next();
			System.out.println("key="+en.getKey()+" vale="+en.getValue());
		}
		
		System.out.println("通过map.entrySet遍历map：");
		for(Map.Entry<String, String> entry:hamp.entrySet()){
			System.out.println("key="+entry.getKey()+"value="+entry.getValue());
		}
		
		System.out.println("通过map.values()遍历map：");
		for(String a:hamp.values()){
			System.out.println(a);
		}
		

	}

}
