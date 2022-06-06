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
</head>
<body>
	<form:form action="displayUserInfo" modelAttribute="user">
		Name: <form:input path="name"/>
		<hr/>
		Gender: <form:radiobuttons path="gender" items="${ genderMap }"/>
		<hr/>
		Country: 
		<form:select path="country" items="${ countryMap }"/>
		<hr/>
		Introduction:
		<form:textarea path="introduction"/>
		<hr/>
		<input type="submit" value="Save">
	</form:form>
</body>
</html>
