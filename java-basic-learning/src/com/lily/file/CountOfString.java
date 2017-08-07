package com.lily.file;

import java.io.*;

/**
 * 指定字符串在文件中出现的次数
 * 思路：
 * 1、定义待查询的字符串和文件名
 * 2、定义BufferedReader  br来读取文件内容
 * 3、获取每行数据，进行查找。当br.readline()！=null时，表示文件不为空
 * 4、对每行的数据进行循环判断，获取从指定位置开始子字符串出现的位置。
 *   4.1如果获得的index>=0,说明存在该字符串。count+1.且继续循环执行4.并且第二次的起始位置应该为index+1
 *   4.2当index=-1时，说明这一行都没有该字符串，break，跳出4的循环。继续执行3，获取下一行的数据
 * @author Administrator
 *
 */
public class CountOfString {

	public static void main(String[] args) {
		String s1="test1";
		File f1=new File("test1.txt");
		System.out.println(f1+" 中匹配到 "+s1 +"个数为： "+count(f1,s1));
		
	}
	public static int count(File f,String s){
		int counts=0;
		int index=-1;
		String s2="";
		try{
		BufferedReader br=new BufferedReader(new FileReader(f));
		while((s2=br.readLine())!=null){
			while(true){
			   index =s2.indexOf(s, index+1);
			if(index>=0){
				counts++;
			}else{
				break;
			}
			}
		}
		return counts;
		}catch(Exception e){
			System.err.println(e);
			return 0;
		}
	}
		

}
