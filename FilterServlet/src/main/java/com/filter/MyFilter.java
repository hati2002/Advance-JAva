package com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.sun.net.httpserver.Filter.Chain;
import javax.servlet.*;  

public class MyFilter implements Filter {

	public void init(FilterConfig config) throws ServletException{};
	
	public  void doFilter(ServletRequest request,ServletResponse response) throws ServletException,IOException {
		
		PrintWriter pw=response.getWriter();
		pw.println("filter is invoked berfore");
		
		Chain.doFilter(response,request);
	}
}
