package com.lily.test;

import java.io.IOException;

import com.lily.util.FileOperations;

/**
 * 测试类
 * 
 * @author Lily
 *
 */
public class Test {

	public static void main(String[] args) throws IOException {
		
//		String content = Multiply.getMultiplyTable();
//		String filePath = "/Users/Lily/learn/9 multiply 9 table.txt";
//		
//		FileOperations.storeIntoFile(content, filePath);
//		
//		System.out.println("OK");
		
		String filePath="/Users/Lily/learn/9 multiply 9 table.txt";
//		FileOperations.readTxtFile(filePath);
		
		String content = FileOperations.readTxtFile(filePath);
		
		System.out.print(content);
		
	}

}