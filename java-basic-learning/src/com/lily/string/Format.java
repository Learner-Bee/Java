package com.lily.string;

/**
 * 字符串格式化format()的使用
 * @author Administrator
 *
 */
public class Format {

	public static void main(String[] args) {
		//对整数进行操作：%[index$][标识][最小宽度]转换方式
		//获取第二个参数以整数10进制转换，保留5位，用0填充
		System.out.println(String.format("%2$05d",32,43));
		//第一个参数，宽度5
		System.out.println(String.format("%1$5d",32,43));
		//负数用括号括起来，最小宽度内左对齐
		System.out.println(String.format("%1$-(5d",-32,43));
		System.out.println(String.format("%2$,d",32,3443));
		
		//f浮点型转换
		System.out.println(String.format("%2$f",32,3443.67));
		//字符转换%c，且参数必须是字符类型
		System.out.println(String.format("%c",'a'));

	}

}
