package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet{
	
	//Life cycle method
	ServletConfig config;
  public void init(ServletConfig conf) {
	  this.config=conf;
	  System.out.println("creating object.........");
  }
  
@Override
  public void service(ServletRequest resq, ServletResponse resp) throws ServletException, IOException {
		System.out.println("servicing........");
		
		//set the content type of responce
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.println("<h1>this is output from servlet</h1>");
		
	}

@Override
public void destroy() {
	
	System.out.println("going to destroy........");
}


//non life cycle method
@Override
public ServletConfig getServletConfig() {
	
	return this.config;
}

@Override
public String getServletInfo() {
	
	return "this servlet is created by me";
}

}
