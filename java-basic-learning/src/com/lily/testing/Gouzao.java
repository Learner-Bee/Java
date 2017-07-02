package com.lily.testing;

import com.lily.util.GouzaoMethod;

/**
 * 构造方法使用
 * @author Administrator
 *
 */
public class Gouzao {

	public static void main(String[] args) {
		GouzaoMethod g1=new GouzaoMethod( 1 );
		GouzaoMethod g2=new GouzaoMethod(2);
		System.out.println(g1.x + " "+g2.x);

	}

}
