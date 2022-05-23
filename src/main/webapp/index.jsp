<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Mvc Demo</title>
</head>
<body>
	Welcome to Spring MVC Rest Demo
	<hr>
	<a href="test/hello">Hello World</a>
	<hr>
	<a href="${pageContext.request.contextPath}/api/students">Get all students</a>
	
</body>
</html>