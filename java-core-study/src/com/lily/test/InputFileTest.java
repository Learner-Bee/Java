package com.lily.test;

import java.io.IOException;

import com.lily.util.FileOperations;

public class InputFileTest {

	public static void main(String[] args) throws IOException {
		String filePath="99multiply.txt";
		String content=FileOperations.inputFile(filePath);
        System.out.println(content);
	}

}
