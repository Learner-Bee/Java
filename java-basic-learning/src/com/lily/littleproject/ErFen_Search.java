package com.lily.littleproject;


/**
 * 二分查找：前提是在有序的数组中，查找指定的元素的位置
 * 思路：
 * 1、找到数组中中间位置元素
 * 2、将其与待查元素比较
 *   2.1如果大于待查元素。那么将前部分数据继续循环执行以上操作
 *   2.2如果小于待查元素。那么将后面的数据继续执行以上操作
 *   2.3如果等于查找元素，输出元素的位置
 * @author Administrator
 *
 */
public class ErFen_Search {

	public static void main(String[] args) {
		int[] a={1,3,4,5,8,9};
		int b=8;
		int index=search(a,b,0,a.length);
		System.out.println(b+"在数组中的位置为："+index);

	}
	public static int search(int[] a,int b,int start,int end){
		if(a==null||a.length<1)
			return -1;
		if(start<=end){
			 int mi=(start+end)/2;
			if(b<a[mi]){
				 return search(a,b,start,mi-1);
			}else if (b>a[mi]){
				 return search(a,b,mi+1,end);
			}else if(a[mi]==b){
				return mi;
				
			}
		}
		return -1;
	
		
		
		
	}

}
