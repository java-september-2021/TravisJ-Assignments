<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Add Your Custom Album!</title>
		<link rel="stylesheet" href="/css/style.css">
	</head>

<!--  THIS IS WHERE THE USER WILL ADD ALL added DATA IS VALIDATED through the MODELS package
In this case Album.java -->
	<body class="pagestyle">
	
		<div class="containerBasic">
			<h1>Create New Album</h1>
			<p>Please enter this basic info to get your new album created.</p>
			<a class="aTagStyle" href="/homepage"> Return Home </a>
		</div>
		
		<!-- action is the newalbum -->
		<!-- NOTE the ** MODEL attribute ** add and  ** form:form ** -->
		<!-- ALSO ADD THE PREFIX at top with form -->
		<div class="containerBasic">
			<h2>Add New Album</h2>
			<form:form action="/newalbum" method="post" modelAttribute="album">
				<div class="optionSelectContainer">
					<form:label path="albumName">Album:</form:label><br><br>
					<form:errors  class="errorAlertPopupContainer" path="albumName"/>  
					<form:input type="text" path="albumName" placeholder="Name of Album" class="entryContainer"/><br><br><br>
				</div>
				<div class="optionSelectContainer">
					<form:label path="artistName">Band:</form:label><br><br>
					<form:errors class="errorAlertPopupContainer" path="artistName"/>   
					<form:input type="text" path="artistName" placeholder="Band or Artist's Name" class="entryContainer"/><br><br><br>
				</div>
				<div class="optionSelectContainer">
					<form:label path="year">Year:</form:label><br><br>
					<form:errors class="errorAlertPopupContainer" path="year"/> 
					<form:input type="text" path="year" placeholder="Year Released" class="entryContainer"/><br><br>
				</div><br>
				<button class="buttonStyle">Add Album</button>
			</form:form>
		</div>
		
	</body>
</html>