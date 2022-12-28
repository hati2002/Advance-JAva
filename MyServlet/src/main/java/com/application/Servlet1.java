package com.application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h2>welcome to servlet1</h2>");
		
		//to fetch the data
		
		String n1=request.getParameter("n1");
		String n2=request.getParameter("n2");
		
		//convert string to int
		int nn1=Integer.parseInt(n1);
		int nn2=Integer.parseInt(n2);
		
		//add two value
		int s=nn1+nn2;
		
		//attribute
		request.setAttribute("sum", s);
		
		//now forward this
		RequestDispatcher rd=request.getRequestDispatcher("Servlet2");
		rd.forward(request, response);
	}
}
