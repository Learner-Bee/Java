package com.lily.MysqlCon;

import java.sql.*;

public class DeleteSql {
	public static void main(String args[]){
		
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//建立连接
			String connectionURL="jdbc:mysql://10.0.11.224:3306/test1";
			String user="user-center";
			String password="usercenter";
			Connection conn=DriverManager.getConnection(connectionURL, user, password);
			
			//建立容器
			Statement state=conn.createStatement();
			String deletesql="delete from test1.stu where id=4";
			//将sql语句放在容器里面 传到数据库中执行
			state.execute(deletesql);
			System.out.println("execute success");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
