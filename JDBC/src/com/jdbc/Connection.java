package com.jdbc;

import java.sql.DriverManager;

import com.mysql.cj.xdevapi.Statement;

public class Connection {
public static void main(String[] args) {
	
	try {
		//load the driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//create the connection
		String url="jdbc:mysql://localhost:3307/db";
		String username="root";
		String password="2000";
		java.sql.Connection connection=DriverManager.getConnection(url,username,password);
				
		if (connection.isClosed()) {
			System.out.println("conection closed..");
		}
		else {
			System.out.println("connection created....");
		}
		
		//create query....
		String query="create table Employee1(emp_id int(20) primary key auto_increment,emp_name varchar(20), emp_city varchar(400))";
		
		//create a statement
		java.sql.Statement st=connection.createStatement();
		
		st.executeUpdate(query);
		
		System.out.println("table created");
		connection.close();
		
		
	}
	catch (Exception e) {
		System.out.println(e);
	}
}
}
