package com.lily.arrays;

import java.util.Arrays;

/**
 * 数组合并利用System.arraycopy()方法，复制数组    
 * * @author Administrator
 *
 */
public class Arraymerge {

	public static void main(String[] args) {
		
		int[] a={4,3,1};
		int[] b={7,6,3};
		int[] c=new int[a.length+b.length];//合并后的新数组类型必须和原数组类型相同
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
//		Arrays.sort(c);
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
		System.out.println();
		
		//判断数组是否相等
		System.out.println("数组a和数组b是否相等："+a.equals(b));
		
		
		
	}

}
