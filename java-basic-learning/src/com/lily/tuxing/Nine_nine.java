package com.lily.tuxing;

/**
 * 9*9�˷������
 * "\t"������뵽��һ��tabλ��
 * @author Administrator
 *
 */
public class Nine_nine {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=9;i++){
			for(j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}//Ҫ��������룬\t��ʾ�����¸�Tabλ��
			System.out.println();
		}

	}

}