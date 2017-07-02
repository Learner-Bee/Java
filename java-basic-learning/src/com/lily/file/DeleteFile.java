package com.lily.file;

import java.io.File;

/**
 * 文件删除
 * 调用file.delete()删除文件，通过file.getName()获取文件名
 * 1.给定文件路径
 * 2.判断文件是否存在
 *  2.1不存在，输出提示“文件不存在”
 *  2.2存在，删除文件
 *   2.2.1delete（）true,输出文件删除成功
 *   2.2.2false，文件删除失败
 * @author Administrator
 *
 */
public class DeleteFile {

	public static void main(String[] args) {
		File f=new File("E:/Learn/Java1/test4.txt");
		if(!f.exists()){
			System.out.println("文件不存在");
		}else{
		   try{
			  if(f.delete()){
				System.out.println(f.getName()+"删除成功");
			  }else{
				System.out.println("文件删除失败");
			 }
		   }catch(Exception e){}
		}

	}

}
