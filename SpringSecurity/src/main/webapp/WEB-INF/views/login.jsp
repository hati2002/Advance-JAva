<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<c:if test="${param.error!=null }">
		<i style="color: red;">Invalid login and password</i>
	</c:if>
	
	<c:if test="${param.logout!=null }">
		<i style="color: green;">You have successfully logged out</i>
	</c:if>
	
	<h1>Login</h1>
	<form:form action="proccess-login" method="POST">
UserName:<input type="text" name="username" placeholder="enter name"><br>
PassWord:<input type="password" name="password"><br>
		<input type="submit" value="login">
	</form:form>

</body>
</html>