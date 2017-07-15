package com.lily.sequence;

/**
 * 归并排序
 * 原理:将两个或多个有序序列，合并为一个序列。
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
		int[] a={2,3,6,7},b={0,1,2,5};
		sort(a,b);
	}
	public static void sort(int[] m,int[] n){
		int[] t=new int[m.length+n.length];
		int i=0,j=0,s=0;
		while(i<m.length&&j<n.length){
			if(m[i]<n[j]){
				t[s]=m[i];
				i++;
				s++;
			}else{
				t[s]=n[j];
				j++;
				s++;
			}
		}
		if(i==m.length){
			for(;s<t.length;s++){
				t[s]=n[j];
				j++;
			}
		}else if(j==n.length){
			for(;s<t.length;s++){
				t[s]=m[i];
				i++;
			}
		}
		 for(int x:t){
			 System.out.print(x+" ");
		 } 
		
	}
	//public static void print(int y,int[] s){}

}
