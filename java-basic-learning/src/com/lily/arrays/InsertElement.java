package com.lily.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 数组插入新元素。用到System.arraycopy()方法
 * 还实现了array转化成arraylist，并用Collections.reverse()反转输出数组
 * @author Lily
 *
 */
public class InsertElement {

	public static void main(String[] args) {
		int[] a={1,3,2,5,4};
		int[] b=new int[a.length+1];
		//System.out.println(Arrays.binarySearch(a, 0));
		//将数组转化成arraylist
		List<Integer> aList = Arrays.asList(1,3,2,5,4);
		//Collections.reverse(aList);
		printArray(aList);
		
		//insertElement(a,b);
	    //printArray(b);
		//Arrays.sort(b,0,3);
		//printArray(b);
		

	}
	//插入元素方法。将数组复制给新数组。并定义插入的元素
	public static int[] insertElement(int[] array1,int[] array2){
		System.arraycopy(array1, 0, array2, 0, array1.length);
		array2[array1.length]=9;
		return array2;
	}
	//循环遍历输出数组
	public static void printArray(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
	}
	//遍历输出arraylist
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
