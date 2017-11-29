package com.lily.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
		

/**
 * 将Array转换为ArrayList
 * @author Administrator
 *
 */
public class ArraytoArraylist {

	public static void main(String[] args) {
		Integer[] array1 = new Integer[] { 8,2, 6 ,3,1,4,2,5};
		String[] array2 = new String[4];
		array2[0] = "lily";
		array2[1] = "mk";
		array2[2] = "bo";
		array2[3] = "tao";
		// 将array转换为arraylist

		List<Integer> arraylist1 = Arrays.asList(array1);

		Comparator<Integer> integercomparator = new IntegerComparator();
		arraylist1.sort(integercomparator);
		printlist(arraylist1);

		// List<String> arraylist2=Arrays.asList(array2);
		// printlist(arraylist1);

		// String[] array3=new String[arraylist2.size()];
		// arraylist2.toArray(array3);
		// printarray(array3);

	}

	public static void printlist(List<Integer> arraylist) {
		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}
	}

	public static void printarray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
//自定义比较器
class IntegerComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;//return值<0,生序排列;return值>0,降序
	}

}
