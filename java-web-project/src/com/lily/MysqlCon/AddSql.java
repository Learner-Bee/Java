package com.lily.MysqlCon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddSql {
	   
		public void addSql(String id,String name){
			try {
				//1������Mysql����(���벶����׳��쳣)
				Class.forName("com.mysql.jdbc.Driver");
				//2���������ݿ�
				String connectionURL="jdbc:mysql://10.0.11.224:3306/test1";
				String user="user-center";
				String password="usercenter";
				Connection conn=DriverManager.getConnection(connectionURL, user, password);		
			
			//3����������
			Statement state=conn.createStatement();
			//4������sql���
			String addSql="insert into stu values("+id+", '"+name+ "')";
			//5����sql����ϴ������ݿ���ִ��
			state.execute(addSql);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		

	}
	
	


