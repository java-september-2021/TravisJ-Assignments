<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Time Dashboard</title>
<link rel="stylesheet" href="/css/style.css">
</head>

	<body class="pagestyle">
	
	<div class="containerBasic">
		<h1>Time Dashboard</h1>
	
	</div>
	
		<div class="farm">
			<form method="POST" action="/date">
				<input type="hidden" name="building" value="date">
				<button class="buttonStyle">Date Template</button>
			</form>
		</div>
		
		<div class="farm">
			<form method="POST" action="/time">
				<input type="hidden" name="building" value="time">
				<button class="buttonStyle">Time Template</button>
			</form>
		</div>
		
	
	</body>
</html>