package com.lily.collection;

import java.util.*;

/**
 * hashmap���ֱ���
 * 1��ͨ��map.keySet()��������
 * 2��ͨ������������
 * 3��ͨ��map.entrySet()����
 * 4��ͨ��map.values�������޷�����key��
 * @author Administrator
 *
 */
public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,String> hamp=new HashMap<String,String>();
		hamp.put("1", "Saturday");
		hamp.put("2", "Sunday");
		
		System.out.println("ͨ��map.keySet()����map��");
		for(String a:hamp.keySet()){
			System.out.println("key="+a+" value="+hamp.get(a));
		}
		
		System.out.println("ͨ������������map��");
		Iterator<Map.Entry<String,String>> itea=hamp.entrySet().iterator();
		while(itea.hasNext()){
			Map.Entry<String, String> en=itea.next();
			System.out.println("key="+en.getKey()+" vale="+en.getValue());
		}
		
		System.out.println("ͨ��map.entrySet����map��");//�Ƽ�ʹ�ã�����������ʱ
		for(Map.Entry<String, String> entry:hamp.entrySet()){
			System.out.println("key="+entry.getKey()+" value="+entry.getValue());
		}
		
		System.out.println("ͨ��map.values()����map��");
		for(String a:hamp.values()){
			System.out.println(a);
		}
		

	}

}