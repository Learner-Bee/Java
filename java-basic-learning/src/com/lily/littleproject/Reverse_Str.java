package com.lily.littleproject;

/**将字符串翻转后输出
 * 递归实现
 * @author Administrator
 *
 */
public class Reverse_Str {

	public static void main(String[] args) {
		String a=null;
        System.out.println(Reverse(a));
	}
	public static String  Reverse(String str){
		if(str==null||str.length()<=1)
			return str;
	   return  Reverse(str.substring(1))+str.charAt(0);
	}

}
