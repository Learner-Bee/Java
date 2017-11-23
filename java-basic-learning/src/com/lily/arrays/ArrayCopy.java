package com.lily.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 利用System.arraycopy(src,srcpos,dest,destpos,length)方法来扩充数组
 * src（source）:原数组，       srcpos（position）：原数组要复制的起始位置
 * dest（destnation）：目标数组，destpos：要拷贝到目标数组的起始位置
 * length：原数组要拷贝的长度
 * @author Administrator
 *
 */
public class ArrayCopy {
	//static final String c="s";
	//static final List<String> array=new ArrayList<>();
	//StringBuilder s=new StringBuilder();
	public static void main(String[] args) {
		
		String[] str1={"a","b","d"};
		String[] str2=new String[5];
		str2[0]="f";
		str2[1]="g";
		System.arraycopy(str1, 0, str2, 2, str1.length);
		for(String a:str2){
			System.out.print(a+" ");
		}
	}

}
