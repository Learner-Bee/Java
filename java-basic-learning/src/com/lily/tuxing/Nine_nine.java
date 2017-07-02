package com.lily.tuxing;

/**
 * 9*9乘法表输出
 * "\t"输出对齐到下一个tab位置
 * @author Administrator
 *
 */
public class Nine_nine {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=9;i++){
			for(j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}//要想输出对齐，\t表示跳到下个Tab位置
			System.out.println();
		}

	}

}
