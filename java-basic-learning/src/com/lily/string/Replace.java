package com.lily.string;

/**
 * �滻�ַ���replace()ʹ�á�ע���÷����Ĳ������ַ����ַ���
 * replace(target��replacement):����������滻ǰ��Ŀ�����
 * replaceAll(regex,replacement):����������滻���з����������ʽ�Ĳ���
 * replaceFirstͬ�ϣ�ֻ��ƥ������������ʽ�ĵ�һ��ֵ
 * @author Administrator
 *
 */
public class Replace {

	public static void main(String[] args) {
		String str=new String("123qwe123asd");
		System.out.println(str+"��1����a�� "+str.replace('1', 'a'));
		System.out.println(str+"��12����b��"+str.replace("12", "b"));
		System.out.println(str+"�����ֻ���f�� "+str.replaceAll("\\d", "f"));
		System.out.println(str+"�ѵ�һ�γ��ֵ����ֻ�Ϊa��"+str.replaceFirst("\\d", "a"));
       
	}

}