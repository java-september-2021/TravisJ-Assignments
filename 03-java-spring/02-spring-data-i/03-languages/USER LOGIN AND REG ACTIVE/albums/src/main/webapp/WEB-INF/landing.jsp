<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Albums</title>
<link rel="stylesheet" href="/css/style.css">
</head>

	<body class="pagestyle">
	
	<div class="containerBasic">
		<h1>Welcome to Albums!</h1>
		<p>We are glad you could make it.</p>
	
		<h2>Check out our exclusive content library!</h2>
		<p>The "Who's that" of the Music World, soon will be all yours.</p>
	</div>
	
	<div class="containerBasic">
		<h1>New User</h1>
		<p>Sign up today!</p>
			
		<!-- THIS IS WHERE A ALREADY CREATED USER CAN LOG IN -->
		<!-- THIS IS A TEMP LOGIN SOLUTION -->
		<!-- USE ONLY FOR BUILD TESTING WITH ACCESS LEVELS PRESET. -->
		<form method="POST" action="/homepage">
			<select class="optionSelectorStyling" name="registeredUsers">
			<c:forEach items="${allUsers}" var="user"> 
			<option value="${user.id}">${user.firstName} ${user.lastName}</option>
			</c:forEach>
			</select>
			<button class="buttonStyle">Quick Tester Login</button>
		</form>	
			
			
			
			
			
			
			
			
			<%-- <form:form action="/registeruser" method="post" modelAttribute="user">
				<div>
					<form:label path="firstName">First Name</form:label> <!-- COSMETIC TEXT -->
					<form:errors path="firstName"/>
					<form:input path="firstName"/>
				</div>
			</form:form> --%>
	</div>
	
	</body>
</html>