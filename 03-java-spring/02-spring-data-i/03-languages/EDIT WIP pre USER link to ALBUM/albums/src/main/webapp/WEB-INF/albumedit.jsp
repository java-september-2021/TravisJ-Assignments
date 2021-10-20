<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Edit ${album.albumName}</title>
		<link rel="stylesheet" href="/css/style.css">
	</head>
	
	<body>
	
	<!-- action is the newalbum -->
		<!-- NOTE the ** MODEL attribute ** add and  ** form:form ** -->
		<!-- ALSO ADD THE PREFIX at top with form -->
		<!-- REMEMBER THIS IS EDITING SO THE METHOD IS PUT NOT POST -->
		<!-- // CHECK THIS LATER -->
		<div class="containerSideBySide">
		<h2>Edit or Update Album Details</h2>
			<form:form action="/edit/${album.id}" method="post" modelAttribute="album">
				<div class="optionSelectContainer">
					<form:label path="albumName">Album:</form:label><br><br>
					<form:errors class="errorAlertPopupContainer" path="albumName"/>   <!-- checks for validation errors and DISPLAYS error text-->
					<form:input type="text" path="albumName" placeholder="Name of Album" class="entryContainer"/><br><br><br>
				</div>
				<div class="optionSelectContainer">
					<form:label path="artistName">Band:</form:label><br><br>
					<form:errors class="errorAlertPopupContainer" path="artistName"/>   <!-- checks for validation errors and DISPLAYS error text-->
					<form:input type="text" path="artistName" placeholder="Band or Artist's Name" class="entryContainer"/><br><br><br>
				</div>
				<div class="optionSelectContainer">
					<form:label path="year">Year:</form:label><br><br>
					<form:errors class="errorAlertPopupContainer" path="year"/>   <!-- checks for validation errors and DISPLAYS error text-->
					<form:input type="text" path="year" placeholder="Year Released" class="entryContainer"/><br><br>
				</div><br>
				<button class="buttonStyle">Update Album</button>
				<a class="aTagStyle" href="/homepage"> Cancel Changes </a>
			</form:form> 
			
		</div>
	
	</body>
</html>