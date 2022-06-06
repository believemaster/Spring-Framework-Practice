<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Name</title>
</head>
<body>
	Hello, ${ name } , <br>
	Today's Date is: ${date } <br>
	___________________________________<br>
	List of Team Members: <br>
	<!-- For loop for list of elements here: use jstl support -->
	<!-- ${ team }  --> <!-- this will just show array  -->
	
	<c:forEach var="temp" items="${ team }">
	${ temp } <br>
	</c:forEach>
</body>
</html>