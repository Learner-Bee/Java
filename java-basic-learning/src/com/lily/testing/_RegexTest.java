package com.lily.testing;

import java.util.regex.Pattern;

public class _RegexTest {

	public static void main(String[] args) {
		String content="hi,i am lily "+"hi,i am mk";
		String pattern=".*mk.*";
		//�������ǰ���ַ�����
		boolean isMatch=Pattern.matches(pattern, content);
		System.out.println("�ַ������Ƿ����'mk'?  "+isMatch);

	}

}