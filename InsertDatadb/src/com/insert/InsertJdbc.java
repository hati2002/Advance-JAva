package com.insert;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertJdbc {

	public static void main(String[] args) {
		
		try {
			
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//create the connection
			String url="jdbc:mysql://localhost:3307/db";
			String username="root";
			String password="2000";
			java.sql.Connection connection=DriverManager.getConnection(url,username,password);
					
			//create a query....
			String query="insert into Employee1(emp_name,emp_city) values (?,?)";
			
			//get the PreparedStatement object(insert data using prepared statement)
			PreparedStatement ps=connection.prepareStatement(query);
			
			BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter emp name:");
			String name=bfr.readLine();
			
			System.out.println("enter city:");
			String city=bfr.readLine();
			
			//set the value
			ps.setString(1, name);
			ps.setString(2, city);
			
			ps.executeUpdate();
			System.out.println("data inserted.....");
			connection.close();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
