package com.lily.string;

/**通过indexOf()查找字符串的位置
 * indexOf等于-1说明没有该字符串
 * 
 * @author Administrator
 *
 */
public class IndexOf {

	public static void main(String[] args) {
		String str ="hello my name is lily";
		String s="o";
		if(str.indexOf(s)==-1){
			System.out.println(str+" 字符串中没有 : "+s);
		}else{
			System.out.println(str+"中"+s+"的位置为："+str.indexOf(s));
		}

	}

}
