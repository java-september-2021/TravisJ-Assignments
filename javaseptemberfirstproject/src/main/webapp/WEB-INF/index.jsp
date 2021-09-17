<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FIRST SPRING BOOT SEPT 2021 - index.jsp page</title>
<link rel="stylesheet" href="/css/style.css">
</head>

	<body>
	
	<h1>Spring Boot Testing</h1>
	<p>Text to test if spring boot is working.</p>

	<h2>Spring Boot Testing</h2>
	<p>More text to test some amazing things...</p>
	
	<h3>Here is some Java:</h3>
	<p><c:out value="  2 + 4 = ${2 + 4}"/></p>
	<p><c:out value="${1337 + 9001}"/></p>
	
	<!--  THIS GOES TO THE REQUEST MAPPING - THROUGH CONTROLLERS  -->
	<!-- THIS CONNECTS TO THE MAIN_CONTROLLER connecting /telljoke -->
	<form action="/telljoke" method="post">
	<input type="text" name="name" placeholder="Type your joke here!">
	<textarea name="joke" placeholder="Tell a joke!"></textarea>
	<button>Submit Joke</button>
	</form>
	
	</body>
</html>