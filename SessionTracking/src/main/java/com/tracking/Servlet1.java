package com.tracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{

	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//fetch the data
		String name=request.getParameter("name");
		out.println("<h2> Hello "+ name+ " welcome to my website....</h2>");
		out.println("<a href=Servlet2> Go to Servlet2 </a> ");
		
//		RequestDispatcher rd=request.getRequestDispatcher("Servlet2");
//		rd.forward(request, response);
	}
}
