package com.lily.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ����Collections.reverse()��תarraylist��
 * ͨ��arraylist.contains()�ж��������Ƿ����ĳԪ��
 * @author Administrator
 *
 */
public class ArrayListReverse {

	public static void main(String[] args) {
		List<Object> arraylist=new ArrayList<Object>();
		arraylist.add("l");
		arraylist.add(1);
		arraylist.add("i");
		arraylist.add("l");
		arraylist.add("y");
		arraylist.remove(1);
		Collections.reverse(arraylist);
		System.out.println(arraylist);
        System.out.println("����arraylist���Ƿ���aԪ�أ�"+arraylist.contains("a"));
	}

}
 
	

