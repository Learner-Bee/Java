package com.lily.senior;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		//����hashtable��������ö��names
		Hashtable ht=new Hashtable();
		Enumeration names;
		String str;
		double v;
		//object put(object key,object value)��ָ��keyӳ�䵽��ϣ���е�ָ��value
		ht.put("zara", 3433.44);
		ht.put("hm", 2000.33);
		ht.put("gap", 3000.3);
		
		//��ʾ����hashtableӳ��
		//����ϣ���keys����ö������names
		names=ht.keys();
		while(names.hasMoreElements()){
			str=(String)names.nextElement();
			v=(double)ht.get(str);//���ָ��key��ӳ��ֵ
			System.out.println(str+" : "+v);
		}


	}

}
