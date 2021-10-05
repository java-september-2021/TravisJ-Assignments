<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/style.css">
<title>Dojo Survey Results</title>
</head>
<body>
	<div class="containerBasic">
			<h1>Your Survey Results</h1>
			<p>Submitted Info:</p>
			<p><c:out value="${dateCleanup.format(activityDateTime)}"/></p><br>
		
	</div>

</body>
</html>