package com.lily.string;

/**
 * ÅĞ¶Ï×Ö·û´®bÊÇ·ñÊÇ×Ö·û´®aµÄÑ­»·×Ó´®
 * @author Administrator
 *
 */
public class SubString2 {

	public static void main(String[] args) {
		String sou="ABCC";
		String dest="CAA";
		System.out.println(subStr(sou,dest));
	}
	public static String  subStr(String a ,String b){
		if(a.indexOf(b)>=0)
			return "yes";
		int i=0;
		while(i<a.length()-1){
			a=a.substring(1)+a.charAt(0);
			if(a.indexOf(b)>=0){
				return "yes";
			}
			i++;
		}
		return "no";
			
		
	}

}
