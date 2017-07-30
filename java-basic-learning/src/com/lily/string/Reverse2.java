package com.lily.string;

public class Reverse2 {

	public static void main(String[] args) {
		String a="abcde";
		StringBuffer b=new StringBuffer();
		if(a==null){
			System.out.println("a ЮЊПе");
			}
		else{
			for(int i=a.length()-1;i>=0;i--){
				b.append(a.charAt(i));
		}
			System.out.println(b);
		}
		
		

	}

}
