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
		//��ͨ����������ȡֵ
		System.out.println("ͨ��map.keySet()����key��value��");
		for(String key:map.keySet()){
			System.out.println("key="+key+" value="+map.get(key));
		}
		//
		System.out.println("ͨ��Map.entrySetʹ��iterator����key��value��");
		Iterator<Map.Entry<String, String>> it=map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String, String> entry=it.next();
			System.out.println("key="+entry.getKey()+" value="+entry.getValue());
		}
		//�����֡��Ƽ����ر���������ʱ
		System.out.println("ͨ��Map.entrySet����key��value��");
		for(Map.Entry<String, String> entry:map.entrySet()){
			System.out.println("key="+entry.getKey()+" value="+entry.getValue());
		}
		//�����֡�ͨ��map.valuese()����value����������key
		System.out.println("ͨ��map.values()��������value����������key��");
		for(String v:map.values()){
			System.out.println("value: "+v);
		}
	}

}
