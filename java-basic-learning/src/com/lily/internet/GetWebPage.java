package com.lily.internet;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**ץȡ��ҳ��Ϣ
 * �ص㣺ת��ʱ�������룬
 * @author Administrator
 *
 */
public class GetWebPage {

	public static void main(String[] args) throws Exception {
		//1������url���󣬽�������
		//2���������������
		//3��������ҳ���ݣ�
		//4���ж��ļ��Ƿ����
		//  4.1����ļ����ڣ�д���ļ����ж������Ƿ�Ϊ��
		//     4.1.1��Ϊ�գ�����ҳ�ϵ�����д�뱾���ļ�
		//     4.1.3���Ϊ�չر����������
		//  4.2����ļ������ڣ������ʾ��Ϣ
		String line;
		URL url=new URL("https://www.yongche.com");
		File file =new File("webpage.html");
		URLConnection conn=url.openConnection(); 
		BufferedReader reader=new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));//��ȷ��ȡʱ�ı����ʽ
		BufferedWriter writer=new BufferedWriter(new FileWriter(file));
		//InputStream in=conn.getInputStream();
		//OutputStream out=conn.getOutputStream();
		if(file.exists()){
		    while(( line=reader.readLine())!=null){
		    	//System.out.println(line);
			   writer.write(line);
			   }
			reader.close();
			writer.close();
			System.out.println("OK");
		}else{
			System.out.println("�Ҳ����ļ�");
		}
		
	}

}
