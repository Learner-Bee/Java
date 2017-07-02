package com.lily.method;

import java.util.ArrayList;
import java.util.Vector;

/**
 * 对象 instanceof 类 ：判断对象是否是某个类的实例
 * @author Administrator
 *
 */
public class InstanceOf {

	public static void main(String[] args) {
		Object a=new ArrayList();
		instanceTest(a);
	}
	public static void instanceTest(Object o){
		if(o instanceof Vector){
			System.out.println("对象是Object的实例");
		}else if(o instanceof ArrayList){
			System.out.println("对象是ArrayList的实例");
		}
	}

}
