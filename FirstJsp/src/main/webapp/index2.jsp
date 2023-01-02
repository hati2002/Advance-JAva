<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.Random" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Random Number:
<%
Random r=new Random();
int num=r.nextInt(10);
%>

<%= num %>
</h2>
<p>Current date is:<%=new Date().toString() %></p>
</body>
</html>