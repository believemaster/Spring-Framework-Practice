<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Info</title>
</head>
<body>
	Name: ${ user.name } <br/>
	Gender: ${ user.gender } <br/>
	Country: ${ user.country } <br/>
	Introduction: ${ user.introduction } <br/>
	Countries Visited: 
	<ul>
		<c:forEach items="${ user.visitedCountries }" var="countryVisit">
			<li>${ countryVisit }</li>
		</c:forEach>
	</ul>
</body>
</html>