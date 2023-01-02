<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="index2.jsp" %>
<h2>Hello JSP</h2>

<%!
int a=5;
int b=10;
String name="suman";

public int add(int a,int b){
	return a+b;
}

public String reverse(String name){
	
	StringBuffer sbf=new StringBuffer(name);
	return sbf.reverse().toString();
}
%>
<%
out.println(a);
out.println("<br>");
out.println(b);
out.println("<br>");

out.println(add(a, b));
out.println("<br>");

out.println(reverse(name));

%>

<h1 style="color:red">sum is:<%= add(a, b) %></h1>

</body>
</html>