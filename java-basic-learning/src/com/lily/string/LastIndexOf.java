	package com.lily.string;

/**
 * 通过lastIndexOf（）来查找字符串最后出现的位置
 * 且当lastIndexOf（）为-1时，输出没有找到字符串
 * @author Administrator
 *
 */
public class LastIndexOf {

	public static void main(String[] args) {
		String str="hi my name is lily.her name is lucy";
		String str1="my";
		int lastindex=str.lastIndexOf(str1);
		if(lastindex==-1){
			System.out.println("字符串str中没有找到"+str1);
		}else{
		System.out.println(str1+"在字符串中的位置为："+lastindex);
		}

	}

}
