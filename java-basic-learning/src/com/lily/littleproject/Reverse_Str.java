package com.lily.littleproject;

/**���ַ�����ת�����
 * �ݹ�ʵ��
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
