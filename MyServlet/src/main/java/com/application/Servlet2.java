package com.application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h2>welcome to servlet2</h2>");
		
		//to fetch the data
		int nn1=Integer.parseInt(request.getParameter("n1"));
		int nn2=Integer.parseInt(request.getParameter("n2"));
	
		int product=nn1*nn2;
		
		//get attribute from request
		int sum=(int) request.getAttribute("s");
		
		out.println("sum is:"+sum);
		out.println("product is:"+product);

	}
}

