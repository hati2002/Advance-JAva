package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Htpservlet extends HttpServlet{

	public void doGet(HttpServletRequest resq,HttpServletResponse resp) throws ServletException,IOException {
		
		System.out.println("this is get method");   //this will run in console
		
		
		//this will run in browser
		
		resp.setContentType("text/html");
		
		PrintWriter out=resp.getWriter();
		out.println("<h1>this is get method of my servlet</h1>");
	}
}
