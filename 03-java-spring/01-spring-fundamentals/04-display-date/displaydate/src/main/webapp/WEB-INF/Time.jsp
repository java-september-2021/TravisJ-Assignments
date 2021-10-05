<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/style.css">
<title>Time</title>
</head>
<body>
	<div class="containerBasic">
			<h1>Your Survey Results</h1>
			<p>Submitted Info:</p>
			<p>Name: <c:out value="${name}"/></p><br>
			<p>Dojo Location: <c:out value="${location}"/></p><br>
			<p>Favorite Langnage: <c:out value="${language}"/></p><br>
			<p>Comment:<c:out value="${joke}"/></p><br>
	</div>

</body>
</html>