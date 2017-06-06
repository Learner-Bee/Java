package com.lily.file;

import java.io.File;

/**
 * 文件删除
 * 调用file.delete()删除文件，通过file.getName()获取文件名
 * @author Administrator
 *
 */
public class DeleteFile {

	public static void main(String[] args) {
		File f=new File("test.txt");
		try{
			if(f.delete()){
				System.out.println(f.getName()+"删除成功");
			}else{
				System.out.println("文件删除失败");
			}
		}catch(Exception e){}

	}

}
