package com.lily.util;

/**
 * 乘法工具类
 * 
 * @author Lily 2017-2-23 22:38
 *
 */
public class Multiply {

	/**
	 * 
	 * TODO String StringBuffer
	 * @return 打印输出99乘法表
	 */
	public static String getMultiplyTable() {
		String content = "";
		int i, j;
		for (i = 1; i <= 9; i++) {
			String temp = "";
			for (j = 1; j < i; j++) {
				temp += j + "*" + i + "=" + i * j + "\t";
			}
			if (j == i) {
				temp += j + "*" + i + "=" + i * j + "\n";
			}

			content += temp;
		}

		return content;
	}
}