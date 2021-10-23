<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Add Your Song</title>
		<link rel="stylesheet" href="/css/style.css">
	</head>
	<body class="pagestyle">
	
		<div class="containerBasic">
			<h1>Create New Song</h1>
			<p>Please enter this basic info to get your new song created.</p>
			<a class="aTagStyle" href="/homepage"> Return Home </a>
		</div>
		
	
		<div class="containerBasic">
			<form:form action="/songs/newsongPosted" method="post" modelAttribute="song">  <!-- song matches the controller model attribute -->
				<div class="optionSelectContainer">
					<form:label path="songName">Song Name:</form:label><br><br>
					<form:errors  class="errorAlertPopupContainer" path="songName"/>  
					<form:input type="text" path="songName" placeholder="Name of Song" class="entryContainer"/><br><br><br>
				</div>
				<div class="optionSelectContainer">
					<form:label path="songOpeningLyrics">Opening Lyrics:</form:label><br><br>
					<form:errors  class="errorAlertPopupContainer" path="songOpeningLyrics"/>  
					<form:input type="text" path="songOpeningLyrics" placeholder="Lyrics from the song" class="entryContainer"/><br><br><br>
				</div>
				<div class="optionSelectContainer">
					<form:label path="songDurationInSeconds">Duration in Seconds:</form:label><br><br>
					<form:errors  class="errorAlertPopupContainer" path="songDurationInSeconds"/>  
					<form:input type="text" path="songDurationInSeconds" placeholder="Name of Song" class="entryContainer"/><br><br><br>
				</div>
				<div class="optionSelectContainer">
					<form:label path="songLength">Song Length:</form:label><br><br>
					<form:errors  class="errorAlertPopupContainer" path="songLength"/>  
					<form:input type="text" path="songLength" placeholder="H:MM:SS" class="entryContainer"/><br><br><br>
				</div>
				<div class="optionSelectContainer">
					<form:label path="age">Age of Song:</form:label><br><br>
					<form:errors class="errorAlertPopupContainer" path="age"/> 
					<form:input type="text" path="age" placeholder="Optional" class="entryContainer"/><br><br><br>
				</div>
				<div class="optionSelectContainer">
				<p>Album:</p>
				<!-- THIS IS HOW YOU CONNECT TO THE SONG AND ALBUM LINKING -->
				<!-- ALLOW USER TO SELECT WHAT TO LINK THE SONG TO -->
				<!-- ADD STYLE TO C select -->
				<form:select class="optionSelectorStyling" path="albumSongIsOn">
					<c:forEach items="${albums}" var="album">
						<option  value="${album.id}"> ${album.albumName} by ${album.artistName} </option>
					</c:forEach> 
				</form:select>
				<button class="buttonStyle">Add Song</button>
				</div>
			</form:form>
		</div>
		
	
	</body>
</html>