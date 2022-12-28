package com.annotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyAnnotation extends HttpServlet {

	 public void init(ServletConfig config) {
	        System.out.println("Servlet is being initialized");
	    }
	 
	    public void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws IOException,ServletException {
	 
	        PrintWriter writer = response.getWriter();
	        writer.println("<html>Hello, I am a Java servlet!</html>");
	        writer.flush();
	    }
	 
	    
	    public void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws IOException,ServletException {
	    	
	        String paramWidth = request.getParameter("width");
	        int width = Integer.parseInt(paramWidth);
	 
	        String paramHeight = request.getParameter("height");
	        int height = Integer.parseInt(paramHeight);
	 
	        long area = width * height;
	 
	        PrintWriter writer = response.getWriter();
	        writer.println("<html>Area of the rectangle is: " + area + "</html>");
	        writer.flush();
	 
	    }

	    public void destroy() {
	        System.out.println("Servlet is being destroyed");
	    }
}
