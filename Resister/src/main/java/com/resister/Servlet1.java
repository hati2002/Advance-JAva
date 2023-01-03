package com.resister;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//fetch the data
		String name=request.getParameter("uname");
		String mail=request.getParameter("umail");
		String city=request.getParameter("ucity");
		
		//print the data
		out.println("<h2> Name:"+name+"</h2>");
		out.println("<h2> Mail:"+mail+"</h2>");
		out.println("<h2> City:"+city+"</h2>");

		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//create the connection
			String url="jdbc:mysql://localhost:3307/resister";
			String username="root";
			String password="2000";
			Connection con=DriverManager.getConnection(url, username, password);
			
			//create a query
			String query="insert into persons(name,city,mail) values (?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);

			ps.setString(1, name);
			ps.setString(2, mail);
			ps.setString(3, city);
		
		    ps.executeUpdate();
			
			con.close();
			
		}
		catch (Exception e) {
			
			System.out.println(e);
		}
	}
}
