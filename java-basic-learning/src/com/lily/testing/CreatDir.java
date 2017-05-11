package com.lily.testing;

import java.io.File;

/**
 * 创建文件夹
 * @author Administrator
 *
 */
public class CreatDir {

	public static void main(String[] args) {
		//定义文件夹名称，../表示当前文件夹下
		String dirname="../test3";
		File d=new File(dirname);
		d.mkdir();
		System.out.println("OK");

	}

}
