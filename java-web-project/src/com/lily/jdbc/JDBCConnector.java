package com.lily.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCConnector {

	private Connection conn;

	public JDBCConnector(String ip, String port, String dbName, String userName, String pwd) {
		try {
			// 1、动态加载mysql驱动
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			// 2、建立连接
			String connectionURL = "jdbc:mysql://" + ip + ":" + port + "/" + dbName + "?user=" + userName + pwd;
			conn = DriverManager.getConnection(connectionURL);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// 执行删除
	public int executeUpdate(String updateURL) {
		int updateCount = 0;
		try {
			Statement stem = conn.createStatement();// 通过connection创建声明stem，通过声明调用exccute方法
			if (!stem.execute(updateURL)) {
				updateCount = stem.getUpdateCount();
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return updateCount;
	}

}
