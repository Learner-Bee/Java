package com.lily.string;

/**ͨ��indexOf()�����ַ�����λ��
 * indexOf����-1˵��û�и��ַ���
 * 
 * @author Administrator
 *
 */
public class IndexOf {

	public static void main(String[] args) {
		String str ="hello my name is lily";
		String s="o";
		if(str.indexOf(s)==-1){
			System.out.println(str+" �ַ�����û�� : "+s);
		}else{
			System.out.println(str+"��"+s+"��λ��Ϊ��"+str.indexOf(s));
		}

	}

}
