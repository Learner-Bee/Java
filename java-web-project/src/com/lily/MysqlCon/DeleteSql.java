package com.lily.MysqlCon;

import java.sql.*;

public class DeleteSql {
	public static void main(String args[]){
		
		try {
			//��������
			Class.forName("com.mysql.jdbc.Driver");
			//��������
			String connectionURL="jdbc:mysql://10.0.11.224:3306/test1";
			String user="user-center";
			String password="usercenter";
			Connection conn=DriverManager.getConnection(connectionURL, user, password);
			
			//��������
			Statement state=conn.createStatement();
			String deletesql="delete from test1.stu where id=4";
			//��sql�������������� �������ݿ���ִ��
			state.execute(deletesql);
			System.out.println("execute success");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
