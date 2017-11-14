package com.lily.arrays;

import java.util.Arrays;

/**
 * 数组合并利用System.arraycopy()方法，复制数组 。
 * 并利用Arrays.sort(array)对数组进行排序   
 * * @author Administrator
 *
 */
public class Arraymerge_sort {

	public static void main(String[] args) {
		
		int[] a={1,5,2,3};
		int[] b={2,4,7};
		int[] c=new int[a.length+b.length];//合并后的新数组类型必须和原数组类型相同
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
	    Arrays.sort(c,0,3);
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
		System.out.println();
		
		//判断数组是否相等
		System.out.println("数组a和数组b是否相等："+a.equals(b));
		
		
		
	}

}
