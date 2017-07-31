package com.lily.file;

import java.io.*;

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
