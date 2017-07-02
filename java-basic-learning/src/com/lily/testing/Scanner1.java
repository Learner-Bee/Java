package com.lily.testing;

import java.util.Scanner;

/**
 * 判断输入的是整数还是小数
 * @author Administrator
 *
 */
public class Scanner1 {

	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    //接收键盘输入
	    int i;
	    float f;
	    System.out.println("输入整数：");
	    //hasNextInt()判断输入是否为整型
	    if(scan.hasNextInt()){
	    	i=scan.nextInt();
	    	System.out.println("输入的整数为："+i);
	    }else{
	    	System.out.println("输入的不是整数");
	    }
	    System.out.println("输入小数：");
	    //hasNextFloat()判断输入是否为浮点型
	    if(scan.hasNextFloat()){
	    	f=scan.nextFloat();
	    	System.out.println("输入的小数为:"+f);
	    }else{
	    	System.out.println("输入的不是小数");
	    }

	}

}
