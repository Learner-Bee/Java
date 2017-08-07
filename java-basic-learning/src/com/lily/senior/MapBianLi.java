package com.lily.senior;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapBianLi {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("lily", "26");
		map.put("mkt", "27");
		map.put("lucy", "29");
		//普通遍历，二次取值
		System.out.println("通过map.keySet()遍历key和value：");
		for(String key:map.keySet()){
			System.out.println("key="+key+" value="+map.get(key));
		}
		//
		System.out.println("通过Map.entrySet使用iterator遍历key和value：");
		Iterator<Map.Entry<String, String>> it=map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String, String> entry=it.next();
			System.out.println("key="+entry.getKey()+" value="+entry.getValue());
		}
		//第三种。推荐，特别是容量大时
		System.out.println("通过Map.entrySet遍历key和value：");
		for(Map.Entry<String, String> entry:map.entrySet()){
			System.out.println("key="+entry.getKey()+" value="+entry.getValue());
		}
		//第四种。通过map.valuese()遍历value，但不遍历key
		System.out.println("通过map.values()遍历所有value，但不遍历key：");
		for(String v:map.values()){
			System.out.println("value: "+v);
		}
	}

}
