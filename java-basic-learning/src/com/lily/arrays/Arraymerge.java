package com.lily.arrays;

import java.util.Arrays;

/**
 * ����ϲ�����System.arraycopy()��������������     ������������
 * * @author Administrator
 *
 */
public class Arraymerge {

	public static void main(String[] args) {
		int[] a={4,3,1};
		int[] b={7,6,3};
		Integer[] c=new Integer[a.length+b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		Arrays.sort(c);
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
		
		//�ж������Ƿ����
		System.out.println("����a������b�Ƿ���ȣ�"+a.equals(b));

	}

}