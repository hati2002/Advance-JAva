package com.insert;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Result;
import com.mysql.cj.xdevapi.Statement;

public class UpdateData {

	public static void main(String[] args) {
		
		try {
			
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//create a connection
			String url="jdbc:mysql://localhost:3307/db";
			String username="root";
			String password="2000";
			Connection con=DriverManager.getConnection(url, username, password);
			
			//write a query for update
			String query="update employee1 set emp_city=? where emp_id=?";
			
			BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter emp_city: ");
			String city=bfr.readLine();
			
			System.out.println("enter emp_id");
			int id=Integer.parseInt(bfr.readLine());
			
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, city);
			ps.setInt(2, id);
			
			ps.executeUpdate();
			System.out.println("update successfuly.....");
			
			//process the data
			java.sql.Statement st=con.createStatement();
			ResultSet rSet=st.executeQuery("select * from employee1");
			while (rSet.next()) {
				
				int id1=rSet.getInt(1);
				String name=rSet.getString(2);
				String city1=rSet.getString(3);
				
				System.out.println(id1+" "+name+" "+city1);
				
			}
			con.close();
			
		} 
		
		catch (Exception e) {

			System.out.println(e);
		}
	}
}
