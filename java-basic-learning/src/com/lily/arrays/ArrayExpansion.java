package com.lily.arrays;

/**
 * ����System.arraycopy()��������������
 * @author Administrator
 *
 */
public class ArrayExpansion {

	public static void main(String[] args) {
		String[] str1={"a","b","d"};
		String[] str2=new String[5];
		str2[3]="f";
		str2[4]="g";
		System.arraycopy(str1, 0, str2, 0, str1.length);
		for(String a:str2){
			System.out.println(a);
		}
		//for(int i=0;i<str2.length;i++){
		//	System.out.print(str2[i]+" ");
		//}
	}

}