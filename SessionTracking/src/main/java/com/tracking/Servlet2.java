package com.tracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {


	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		
		out.println("<h2> Hello " +name+ " welcome back to my website....</h2>");
		out.println("<h2>Thank you</h2>");

	}
}
