package com.lily.exception;

import javax.sound.midi.SysexMessage;

import com.sun.org.apache.xml.internal.serializer.utils.SystemIDResolver;

/**
 * 几种常用异常处理方法
 * @author Administrator
 *
 */
public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		try{
			throw new Exception("my exception");
		}catch(Exception e){
			//System.out.println(e.getMessage());
			System.err.println("caugth exception");
			System.err.println("getMessage():"+e.getMessage());
			System.err.println("getLocalizedMessage():"+e.getLocalizedMessage());
			System.err.println("toString():"+e);
			System.err.println("printStackTrace():");
			e.printStackTrace();//打印异常跟踪，现实异常具体位置
		}
	}

}
