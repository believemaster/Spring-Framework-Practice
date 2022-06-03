<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page JSP</title>
</head>
<body>
	Here is home page shown via controller. Below are the names of the person.
	<br>
	<%= request.getAttribute("staff") %>
</body>
</html>