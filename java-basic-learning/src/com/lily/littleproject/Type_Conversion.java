package com.lily.littleproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Type_Conversion {

	public static void main(String[] args) {
		// String-->char
		String str1="hello";
		char c1=str1.charAt(0);//��ȡ�ַ�����ָ��index���ַ�
		char[] ch=str1.toCharArray();//���ַ���ת��Ϊ�ַ�����
		System.out.println(c1);
		System.out.println(ch);
		
		//char-->String
		String str2=Arrays.toString(ch); //���ַ�����תΪString.��������ķ��������Խ��������͵�����תΪString����
		System.out.println(str2);
	    System.out.println(c1+" ");//���ַ�תΪString
	    String str3=String.valueOf(c1);//���Խ���������ת��ΪString����
	    String str0=Character.toString(c1);

	    
		//int-->String
	    int m=2;
	    String str4=String.valueOf(m);//��int����ת��Ϊ�ַ�������
	    String str5=Integer.toString(m);
	    String str6=m+"";
	    
		//String-->int
	    int n=Integer.parseInt(str5);//ֻ�ܽ�String����ת��Ϊint����
	    int n1=Integer.valueOf(str5).intValue();//ǰ��Integer.valueOf(str5)�ǽ��ַ���ת��ΪInteger���󡣺���intValueָ����Integer�����intֵ

	    List<Integer> a=new ArrayList<>();
	    
	    StringBuffer s=new StringBuffer("abcdef");
	    //StringBuilder s1=new StringBuilder("234rty8");
	    //s.deleteCharAt(1);//ɾ��ĳ��λ�õ��ַ�
	    //s.delete(3, 5);//startλ�ð�����ɾ����Χ�ڣ�endλ�ò���ɾ����Χ��
	    s.reverse();//���ַ���ת���
	    System.out.println(s);
	}

}
