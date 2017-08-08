package com.lily.littleproject;

/**×Ö·û´®µ¹ÐòÊä³ö
 * @author Administrator
 *
 */
public class Daoxu_Str {

	public static void main(String[] args) {
		String a="abcde";
		daoxu(a);

	}
	public static void daoxu(String str){
	    if(str==null||str.length()<=1)
			return;
	    for(int index=str.length()-1;index>=0;index--){
		    System.out.println(str.charAt(index));
	  }
	}

}
