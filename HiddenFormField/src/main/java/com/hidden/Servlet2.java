package com.hidden;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		
		try {
			
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			String name=request.getParameter("username");
			out.println("welcome back "+name);
			out.close();
		} catch (Exception e) {

			System.out.println(e);
		}
}
}
