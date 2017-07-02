package com.lily.sequence;

public class MaoPao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,2,9,4,3,1,0};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]<a[j]){
					int b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
			}
			for(int x:a){
			System.out.print(x);
			}
			System.out.println();
		}
		

	}

}
