package com.lily.arrays;

import java.util.Arrays;
import java.util.List;

public class ArraytoArraylist {

	public static void main(String[] args) {
		Integer[] array1=new Integer[]{2,1,6};
		String[] array2=new String[4];
		array2[0]="lily";
		array2[1]="mk";
		array2[2]="bo";
		array2[3]="tao";
		//½«array×ª»»Îªarraylist
		
		List<Integer> arraylist1=Arrays.asList(array1);
		List<String> arraylist2=Arrays.asList(array2);
		//printlist(arraylist1);
		
		String[] array3=new String[arraylist2.size()];
		arraylist2.toArray(array3);
		printarray(array3);
		
	}
	public static void printlist(List<Integer> arraylist){
		for(int i=0;i<arraylist.size();i++){
			System.out.println(arraylist.get(i));
		}
	}
	public static void printarray(String[] array){
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	
		

}
