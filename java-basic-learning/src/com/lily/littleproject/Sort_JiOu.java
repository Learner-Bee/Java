package com.lily.littleproject;

import java.util.ArrayList;
import java.util.List;

/**
 * 将数组中奇数放在左面，偶数放在右面输出
 * @author Administrator
 *
 */
public class Sort_JiOu {

	public static void main(String[] args) {
		int[] a={2,3,1,0,6,5};
		jiou(a);

	}
	public static void jiou(int[] a){
		
		if(a==null||a.length<=1)
			return ;
		//List<Integer> list=new ArrayList<>();
		int[] b=new int[a.length];
		int i=0,j=b.length-1,m=0;
		for(;i<a.length;i++){
			if(a[i]%2==0){
				b[j]=a[i];
				j--;
			}else{
				b[m]=a[i];
				m++;
			}
		}
		for(int x:b)
		   System.out.print(x+" ");
	}

}
