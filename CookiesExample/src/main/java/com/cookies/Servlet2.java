package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{

		try {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//get all cookies
		Cookie cok[]=request.getCookies();
		out.print("Hello welcome back  "+cok[0].getValue()); 
		out.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
}
}
