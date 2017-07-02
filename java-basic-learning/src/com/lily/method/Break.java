package com.lily.method;

/**
 * break关键字的使用
 * 查找数组中某个元素位置：1.有改元素时，返回正确的位置2.没有该元素时也要给出相应提示
 * @author Administrator
 *
 */
public class Break {

	public static void main(String[] args) {
		int [] a={1,4,3,5,7,5,4};
		int b=2,i=0;
		boolean found=false;
		for(;i<a.length;i++){
			if(a[i]==b){
				found=true;
				break;
			}
		}
		if(found){
		    System.out.println(b+"在数组中的位置为:"+i);
		}else{
			System.out.println(b+"不在数组中");
		}

	}

}
