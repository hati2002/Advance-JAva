package com.hidden;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		
		try {
			
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			//fetch the data
			String name=request.getParameter("username");
			out.println("welcome "+name);
			
			//hidden form field code...
			out.println("<form action='Servlet2'>"
			+"<input type='hidden' name='username' value='"+name+"'>"
			+"<input type='submit' value='go'>"
			+"</form>");
			
			out.close();
		} 
		
	catch (Exception e) {

			System.out.println(e);
		}
}
}
