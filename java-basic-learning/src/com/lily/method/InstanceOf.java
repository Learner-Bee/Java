package com.lily.method;

import java.util.ArrayList;
import java.util.Vector;

/**
 * ���� instanceof �� ���ж϶����Ƿ���ĳ�����ʵ��
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
			System.out.println("������Object��ʵ��");
		}else if(o instanceof ArrayList){
			System.out.println("������ArrayList��ʵ��");
		}
	}

}
