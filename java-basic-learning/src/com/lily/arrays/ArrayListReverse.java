package com.lily.arrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ����Collections.reverse()��תarraylist��
 * ͨ��arraylist.contains()�ж��������Ƿ����ĳԪ��
 * @author Administrator
 *
 */
public class ArrayListReverse {

	public static void main(String[] args) {
		ArrayList arraylist=new ArrayList();
		arraylist.add("l");
		arraylist.add("i");
		arraylist.add("l");
		arraylist.add("y");
		Collections.reverse(arraylist);
		System.out.println(arraylist);
        System.out.println("����arraylist���Ƿ���aԪ�أ�"+arraylist.contains("a"));
	}

}
 class a{
	
}
