package com.lily.test;

import java.io.IOException;

import com.lily.util.FileOperations;
import com.lily.util.Multiply;

/**
 * 测试类
 * 
 * @author Lily
 *
 */
public class Test {

	public static void main(String[] args) throws IOException {
		
		String content = Multiply.getMultiplyTable();
		String filePath = "/Users/Lily/learn/9 multiply 9 table.txt";
		
		FileOperations.storeIntoFile(content, filePath);
		
		System.out.println("OK");
	}

}