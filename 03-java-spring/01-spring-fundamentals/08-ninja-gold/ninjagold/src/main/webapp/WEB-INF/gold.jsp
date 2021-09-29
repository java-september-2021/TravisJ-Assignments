<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Ninja Gold</title>
	<link rel="stylesheet" href="/css/style.css">
</head>

<!-- his use is awesomePerson -->
<c:out value="${user}"/>
<body>
	<div>	
	<h1>Ninja Gold Game</h1>
	<p>Choose your adventure, test your luck & skill.</p>
	
		<div>
			<form method="POST" action="/findGold">
					
		
			
			</form>
		</div>
	</div>
</body>
</html>