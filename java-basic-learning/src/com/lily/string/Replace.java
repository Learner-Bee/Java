package com.lily.string;

/**
 * 替换字符串replace()使用。注，该方法的参数是字符和字符串
 * replace(target，replacement):将后面参数替换前面目标参数
 * replaceAll(regex,replacement):将后面参数替换所有符合正则表达式的参数
 * replaceFirst同上，只是匹配符合正则表达式的第一个值
 * @author Administrator
 *
 */
public class Replace {

	public static void main(String[] args) {
		String str=new String("123qwe123asd");
		System.out.println(str+"把1换成a： "+str.replace('1', 'a'));
		System.out.println(str+"把12换成b："+str.replace("12", "b"));
		System.out.println(str+"把数字换成f： "+str.replaceAll("\\d", "f"));
		System.out.println(str+"把第一次出现的数字换为a："+str.replaceFirst("\\d", "a"));
       
	}

}
