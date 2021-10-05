<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="/css/style.css">
	<title>Your favorite color.</title>
</head>
<body>

<!-- THIS IS SHOWN AFTER YOU TYPE IN THE NEW URL -->
	<div class="containerBasic">
			<h1>Jokes Page</h1>
			<p>User's Favorite Jokes 2021</p>
			<p><c:out value="${name}"/>'s joke:</p>
			<p><c:out value="${joke}"/></p><br><br>
	</div>

</body>
</html>