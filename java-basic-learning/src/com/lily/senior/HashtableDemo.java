package com.lily.senior;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		//创建hashtable对象，声明枚举names
		Hashtable ht=new Hashtable();
		Enumeration names;
		String str;
		double v;
		//object put(object key,object value)将指定key映射到哈希表中的指定value
		ht.put("zara", 3433.44);
		ht.put("hm", 2000.33);
		ht.put("gap", 3000.3);
		
		//显示所有hashtable映射
		//将哈希表的keys赋给枚举类型names
		names=ht.keys();
		while(names.hasMoreElements()){
			str=(String)names.nextElement();
			v=(double)ht.get(str);//获得指定key的映射值
			System.out.println(str+" : "+v);
		}


	}

}
