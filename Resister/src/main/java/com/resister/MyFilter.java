package com.resister;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter{
	
	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("initialising......");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//fetch the data
		String name1=request.getParameter("uname");
		String mail1=request.getParameter("umail");
		String city1=request.getParameter("ucity");
		
		//print the data
		out.println("<h2> Name:"+name1+"</h2>");
		out.println("<h2> Mail:"+mail1+"</h2>");
		out.println("<h2> City:"+city1+"</h2>");

		//forward the data
		chain.doFilter(request, response);
		
	}

	@Override
	public void destroy() {
		System.out.println("destroy........");
		
	}

}
