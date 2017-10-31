package com.lily.MysqlCon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddSql {
	   
		public void addSql(String id,String name){
			try {
				//1、加载Mysql驱动(必须捕获或抛出异常)
				Class.forName("com.mysql.jdbc.Driver");
				//2、链接数据库
				String connectionURL="jdbc:mysql://10.0.11.224:3306/test1";
				String user="user-center";
				String password="usercenter";
				Connection conn=DriverManager.getConnection(connectionURL, user, password);		
			
			//3、定义容器
			Statement state=conn.createStatement();
			//4、定义sql语句
			String addSql="insert into stu values("+id+", '"+name+ "')";
			//5、将sql语句上传到数据库中执行
			state.execute(addSql);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		

	}
	
	


