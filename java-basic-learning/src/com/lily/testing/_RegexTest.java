package com.lily.testing;

import java.util.regex.Pattern;

public class _RegexTest {

	public static void main(String[] args) {
		String content="hi,i am lily "+"hi,i am mk";
		String pattern=".*mk.*";
		//后面包含前面字符串；
		boolean isMatch=Pattern.matches(pattern, content);
		System.out.println("字符串中是否包含'mk'?  "+isMatch);

	}

}
