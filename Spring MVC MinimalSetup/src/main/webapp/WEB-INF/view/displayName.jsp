<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Name</title>
</head>
<body>
	Hello, <%= request.getAttribute("firstName") %>
</body>
</html>