package com.lily.servelt;


import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lily.MysqlCon.AddSql;

@WebServlet("/NewTest")//表示请求的路径
public class NewTest extends HttpServlet {
	protected void doPost(HttpServletRequest request,HttpServletResponse response){
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		
		AddSql addsql=new AddSql();
		addsql.addSql(id, name);
	}
	

}
