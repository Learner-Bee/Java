package com.lily.string;

/**
 * �ж��ַ���b�Ƿ����ַ���a��ѭ���Ӵ�
 * 1��a.indexof(b)>=0�ж����ַ���b��a�е�indexλ�ã����-1˵��û��
 * 2��a.contains(b)�ж�a���Ƿ����b
 * @author Administrator
 *
 */
public class SubString2 {

	public static void main(String[] args) {
		String sou="ABCAC";
		String dest="CA";
		System.out.println(subStr(sou,dest));
	}
	public static String  subStr(String a ,String b){
		//if(a.indexOf(b)>=0)
		if(a.contains(b))
			return "yes";
		int i=0;
		while(i<a.length()-1){
			a=a.substring(1)+a.charAt(0);
			if(a.indexOf(b)>=0){
				return "yes";//return����˼���ǽ������������壬���ؽ��
			}
			i++;
		}
		return "no";
			
		
	}

}
