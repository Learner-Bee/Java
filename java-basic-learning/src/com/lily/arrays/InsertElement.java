package com.lily.arrays;

import java.util.Arrays;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class InsertElement {

	public static void main(String[] args) {
		int[] a={1,3,2,4,5};
		int[] b=new int[a.length+1];
		//System.out.println(Arrays.binarySearch(a, 0));
		
		insertElement(a,b);
		Arrays.sort(b);
		printArray(b);
		

	}
	public static int[] insertElement(int[] array1,int[] array2){
		System.arraycopy(array1, 0, array2, 0, array1.length);
		array2[array1.length+1]=0;
		return array2;
	}
	public static void printArray(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		
	}

}
