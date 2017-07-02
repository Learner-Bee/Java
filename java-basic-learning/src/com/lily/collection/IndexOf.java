package com.lily.collection;

import java.util.*;

/**
 * 查找集合中是否包含指点元素，且指定元素的位置
 * @author Administrator
 *
 */
public class IndexOf {

	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("l");
		l.add("i");
		l.add("l");
		l.add("y");
		//List<String> l2=new ArrayList<String>();
		//l2.add("l");
		if(l.indexOf("l")!=-1){
			System.out.println("集合中存在指定元素l");
			System.out.println("集合中指定元素最后出现的位置为："+l.lastIndexOf("l"));
		}else{
			System.out.println("集合中不存在指定元素");
		}

	}

}
