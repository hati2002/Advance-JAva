package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		try {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//fetch the data
		String name=request.getParameter("username");
		out.println("welcome "+name);
		
		//create a cookies
		Cookie cok=new Cookie("username", name);
		response.addCookie(cok);
		
	    out.print("<form action='Servlet2' method='post'>");  
	    out.print("<input type='submit' value='go'>");  
		out.print("</form>");  
	    out.close();  
	}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
