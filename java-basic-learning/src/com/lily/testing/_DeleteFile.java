package com.lily.testing;

import java.io.File;

/**
 * ɾ���ļ�Ŀ¼
 * @author Administrator
 *
 */
public class _DeleteFile {

	public static void main(String[] args) {
		File folder=new File("../test3");
		deleteFolder(folder);

	}
	public static void deleteFolder(File folder){
		File files[]=folder.listFiles();
		if(files!=null){
			for(File f : files){
			    if(f.isDirectory()){
				   deleteFolder(f);
			    }else{
			    	f.delete();
			    	}
			}
			System.out.println("Ok");
		}else{
			folder.delete();
		}
	}

}
