package com.lily.sequence;

public class QuickSort {

	public static void main(String[] args) {
		int[] a={4,3,5,2,1};
		
		}
	public static void sort(int[] b ){
		int i=0,j=b.length-1;
		int key=b[0],low=b[i+1],high=b[j];
		while(key<high){
			j--;
			high=b[j];
		}
		b[i]=high;
		b[j]=key;
		
		
		
	}

}
	
	


