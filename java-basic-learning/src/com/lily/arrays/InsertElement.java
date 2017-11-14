package com.lily.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ���������Ԫ�ء��õ�System.arraycopy()����
 * ��ʵ����arrayת����arraylist������Collections.reverse()��ת�������
 * @author Lily
 *
 */
public class InsertElement {

	public static void main(String[] args) {
		int[] a={1,3,2,5,4};
		int[] b=new int[a.length+1];
		//System.out.println(Arrays.binarySearch(a, 0));
		//������ת����arraylist
		List<Integer> aList = Arrays.asList(1,3,2,5,4);
		//Collections.reverse(aList);
		printArray(aList);
		
		//insertElement(a,b);
	    //printArray(b);
		//Arrays.sort(b,0,3);
		//printArray(b);
		

	}
	//����Ԫ�ط����������鸴�Ƹ������顣����������Ԫ��
	public static int[] insertElement(int[] array1,int[] array2){
		System.arraycopy(array1, 0, array2, 0, array1.length);
		array2[array1.length]=9;
		return array2;
	}
	//ѭ�������������
	public static void printArray(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
	}
	//�������arraylist
	public static void printArray(List<Integer> array){
		//for(int i=0;i<array.size();i++){
		//	System.out.print(array.get(i)+" ");
		//}
		for(int m:array){
			System.out.println(m);
		}
		System.out.println();
		
	}
	
}
