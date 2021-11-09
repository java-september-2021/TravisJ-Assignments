<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Add Your Miniature</title>
		<link rel="stylesheet" href="/css/style.css">
	</head>
	<body class="pagestyle">
	
		<div class="containerBasic">
			<h1>Create New Miniature</h1>
			<p>Please enter this info to get your new miniature created.</p>
			<a class="aTagStyle" href="/homepage"> Return Home </a>
		</div>
		
<!-- // id
// String image_url
// miniatureName
// miniatureDescription
// createdAt
// updatedAt -->
	
		<div class="containerBasic">
			<form:form action="/miniature/newminiaturePosted" method="post" modelAttribute="miniature">  <!-- miniature matches the controller model attribute -->
				<div class="optionSelectContainer">
					<form:label path="image_url">Miniature Photo:</form:label><br><br>
					<form:errors  class="errorAlertPopupContainer" path="image_url"/>  
					<form:input type="text" path="image_url" placeholder="Upload Miniature Photo" class="entryContainer"/><br><br><br>
				</div>
				<div class="optionSelectContainer">
					<form:label path="miniatureName">Miniature Name:</form:label><br><br>
					<form:errors  class="errorAlertPopupContainer" path="miniatureName"/>  
					<form:input type="text" path="miniatureName" placeholder="Miniature Name" class="entryContainer"/><br><br><br>
				</div>
				<div class="optionSelectContainer">
					<form:label path="miniatureDescription">Description:</form:label><br><br>
					<form:errors  class="errorAlertPopupContainer" path="miniatureDescription"/>  
					<form:input type="text" path="miniatureDescription" placeholder="Description of your miniature..." class="entryContainer"/><br><br><br>
				</div>
				
				<p>Add to Album:</p>
				<!-- THIS IS HOW YOU CONNECT TO THE MINIATURE AND ALBUM LINKING -->
				<!-- ALLOW USER TO SELECT WHAT TO LINK THE MINIATURE TO -->
				<!-- ADD STYLE TO C select -->
				<form:select class="optionSelectorStyling" path="albumMiniatureIsOn">
					<c:forEach items="${albums}" var="album">
						<option  value="${album.id}"> ${album.albumName} by ${album.artistName} </option>
					</c:forEach> 
				</form:select>
				<button class="buttonStyle">Add Miniature</button>
				
			</form:form>
		</div>
		
	
	</body>
</html>