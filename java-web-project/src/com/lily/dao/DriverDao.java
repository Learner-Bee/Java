package com.lily.dao;

import com.lily.jdbc.JDBCConnector;

public class DriverDao {
	
	public int execute(String id,String count){
		String querySql="update 'driver' set count = " +count +" where id="+id ;
		String ip = "192.168.1.11" ;
		String port = "3306";
		String dbName = "user";
		String userName = "root";
		String pwd = "";
		JDBCConnector jdbcconn=new JDBCConnector(ip,port,dbName,userName,pwd);
		int updateCount=jdbcconn.executeUpdate(querySql);
		return updateCount;

		
	}

}
