package com.lily.file;
import java.io.*;

/**
 * 在指定文件中添加内容
 * 重点：FileWriter()的使用。FileWriter(String filename，boolean append)
 * 当FileWriter(文件名，true)时，表示设置流对文件的操作是续写,而不是覆盖
 * @author Administrator
 *
 */
public class AddStrFile {

	public static void main(String[] args) {
		try{
			BufferedWriter bw=new BufferedWriter(new FileWriter("test1.txt",true));
			String a="add new string3";
			bw.append(a);
			bw.close();
			
			BufferedReader br=new BufferedReader(new FileReader("test1.txt"));
			String b=null;
			while((b=br.readLine())!=null){
				System.out.println(b);
			}
			
		}catch(Exception e){}

	}

}
