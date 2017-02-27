package com.lily.test;

import java.io.IOException;

import com.lily.util.FileOperations;
import com.lily.util.Multiply;

public class OutputFileTest {
	public static void main (String[] args) throws IOException{
		String filePath="99multiply.txt";
		String content=Multiply.getMultiplyTable();
		FileOperations.outputFile(content, filePath);
		System.out.println("Ok");
	} 

}
