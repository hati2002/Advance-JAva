package com.form;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.locks.Condition;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Loginform extends HttpServlet{



	public void doPost(HttpServletRequest resq,HttpServletResponse resp) throws ServletException,IOException {
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.println("<h2>welcome to register</h2>");
		
		
		//for store the data
		String name=resq.getParameter("username");
		String password=resq.getParameter("password");
		String language=resq.getParameter("language");
		String cond=resq.getParameter("condition");
		
		
		if (cond!=null) {
			
		if(cond.equals("checked")) {
            out.println("<h2>name:"+name+"</h2>");
            out.println("<h2>name:"+password+"</h2>");
            out.println("<h2>name:"+language+"</h2>");

            
		}
		else {
			out.println("<h2>you have not checked the check box</h2>");
		}
		}
		else {
			out.println("<h2>you have not checked the check box</h2>");
			
			//include method
			RequestDispatcher rd=resq.getRequestDispatcher("index.html");
			rd.include(resq, resp);
		}
	}
}
