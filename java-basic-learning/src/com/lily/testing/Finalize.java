package com.lily.testing;

import com.lily.util.Cake;

/**
 * finalize()方法使用
 * @author Administrator
 *
 */
public class Finalize {

	public static void main(String[] args) {
		Cake c1=new Cake(1);
		Cake c2=new Cake(2);
		Cake c3=new Cake(3);
		
		c2=c3=null;
		System.gc();

	}
   

	
}
