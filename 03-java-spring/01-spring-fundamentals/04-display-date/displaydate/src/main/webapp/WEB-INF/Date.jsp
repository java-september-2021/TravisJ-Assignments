<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/style.css">
<title>Date</title>
</head>
<body onload=alert("The Date Page")>

	<div class="containerBasic">
			<h1>Current Date</h1>
			<p><c:out value="${dateCleanup.format(activityDateTime)}"/></p><br>
			<%-- <p><c:out value="${dateCleanup}"/></p><br>
			<p><c:out value="${building}"/></p><br>
			<p><c:out value="${date}"/></p><br>
			<p><c:out value="${activityDateTime}"/></p><br>
			<p><c:out value="${DateTimeFormatter}"/></p><br>
			<p><c:out value="${DateTimeFormatter.format}"/></p><br>
			<p><c:out value="${LocalDateTime}"/></p><br> --%>
	</div>

</body>
</html>