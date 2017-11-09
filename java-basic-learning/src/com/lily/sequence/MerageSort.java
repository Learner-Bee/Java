package com.lily.sequence;

/**
 * 归并排序
 * 原理:将两个或多个有序序列，合并为一个序列。(时间复杂度：O(nlogn))
 * 步骤：
 * 1、新建长度等于两序列和的数组t
 * 2、定义指针，分别为两个序列的初始位置
 * 3、比较两个指针所指元素大小，将小的一个放在新建序列t中
 * 4、将3中比较的小的数的指针后移，与3中比较大的那个继续比较，将小的放在t中
 * 5、重复3、4，直到一个序列中的序列完全比较完，此时其指针大小为length
 * 6、指针大小为length的序列表示已经全部添加到t中，则将另一个序列余下元素逐个追加到t中
 * @author Administrator
 *
 */
public class MerageSort {

	public static void main(String[] args) {
		int[] a={2,3,6,7,9,10},b={0,1,2,5};
		sort(a,b);
	}
	public static void sort(int[] a,int[] b){
		int[] c=new int[a.length+b.length];
		int i=0,j=0,s=0;
		while(i<a.length && j<b.length){
			if(a[i]<b[j]){
				c[s]=a[i];
				i++;
				s++;
			}else{
				c[s]=b[j];
				j++;
				s++;
			}
		}
		if(i==a.length){
			for(;s<c.length;s++){
				c[s]=b[j];
				j++;
			}
		}else if(j==b.length){
			for(;s<c.length;s++){
				c[s]=a[i];
				i++;
			}
		}
		 for(int x:c){
			 System.out.print(x+" ");
		 } 
		
	}
	//public static void sort2(int[] t ,int x,int y){
	//	for(;x<t.length;x++){
	//		t[x]=
		//}
	}
	


