package com.lily.littleproject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ����ȥ��
 * ����set����Ԫ�ز��ظ����ص㡣������Ԫ����ӵ�set�����У��ٽ�set����ת��Ϊ����
 * @author Administrator
 *
 */
public class Quchong_Int {

	public static void main(String[] args) {
		String[] a={"a","b","c","a","b"};
		System.out.println(quchong2(a));

	}
	//Set�����ص��ǲ����ظ�
	public static String quchong1(String[] a){
		Set<String> set=new HashSet<>();
		for(String i:a){
			set.add(i);
		}
		return set.toString();
	}
	//list�ص㴴��ʱ���趨�峤�ȡ�
	public static String quchong2(String[] a){
		List<String> list=new ArrayList<>();
		for(int i=0;i<a.length;i++){
			if(list.toString().indexOf(a[i])==-1){
				list.add(a[i]);
			}
		}
		return list.toString();
	}

}
