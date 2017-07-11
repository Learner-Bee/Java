package com.lily.sequence;

public class QuickSort {

	public static void main(String[] args) {
		int[] a={4,3,6,2,1,5};
		int m=0,n=a.length-1;
		sort(a,m,n);
		for(int x:a){
			System.out.print(x+" ");
		}
		}
	public static void sort(int[] b ,int start,int end){
		int i=start,j=end;
		int key=b[0];
		
		while(i<j){	
		  while(i<j&&key<=b[j]){
			j--;
		 }
		int temp=key;
		b[i]=b[j];
		b[j]=temp;
		
		while(i<j&&key>=b[i+1]){
			i++;
		}
		temp=key;
		b[j]=b[i+1];
		b[i+1]=temp;
		//}
		
		/*if(i-0>1){
			sort(b,0,i-1);
		}
		if(end-j>1){
			sort(b,j+1,end);
		}
		*/
	}
	

}
	
	


