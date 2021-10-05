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
			<h1>Time</h1>
			<p>The time is:   <c:out value="${dateCleanup.format(activityDateTime)}"/></p><br>
		<%-- 	<p>2<c:out value="${dateCleanup}"/></p><br>
			<p>3<c:out value="${building}"/></p><br>
			<p>4<c:out value="${date}"/></p><br>
			<p>5  <c:out value="${activityDateTime}"/></p><br>
			<p>6<c:out value="${DateTimeFormatter}"/></p><br>
			<p>7<c:out value="${DateTimeFormatter.format}"/></p><br>
			<p>8<c:out value="${LocalDateTime}"/></p><br> --%>
	</div>
</body>
</html>