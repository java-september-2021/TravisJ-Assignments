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
		<p>Please enter your info:</p><br>
	
	</div>
	
		<div class="farm">
			<form method="POST" action="/date">
				<input type="hidden" name="building" value="farm">
				<button class="buttonStyle">Date Template</button>
			</form>
		</div>
		
		<div class="farm">
			<form method="POST" action="/time">
				<input type="hidden" name="building" value="cave">
				<button class="buttonStyle">Time Tempalte</button>
			</form>
		</div>
		
	
	</body>
</html>