<%@page import="org.springframework.web.bind.annotation.ModelAttribute"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Form</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/files/css/style.css">
</head>
<body>
	<h3>Submit Your Information:</h3>
	<hr>
	<form:form action="displayUserInfo" modelAttribute="user">
		Name: <form:input path="name" required="true" placeholder="Enter Name"/>
		<hr/>
		Gender: <form:radiobuttons path="gender" items="${ genderMap }" required="true" />
		<hr/>
		Country: 
		<form:select path="country" items="${ countryMap }" />
		<hr/>
		Introduction:
		<form:textarea path="introduction" required="true"/>
		<hr/>
		Visited Countries: <br/>
		Sri Lanka: <form:checkbox path="visitedCountries" value="Sri Lanka"/> <br/>
		Nepal: <form:checkbox path="visitedCountries" value="Nepal"/> <br/>
		Bhutan: <form:checkbox path="visitedCountries" value="Bhutan"/> <br/>
		Bangladesh: <form:checkbox path="visitedCountries" value="Bangladesh"/>
		<hr/>
		Accept Terms & Condition: <form:checkbox path="" value="accept" required="true"/> <br/>
		<input type="submit" value="Save">
	</form:form>
</body>
</html>
