<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/style.css">
<meta charset="UTF-8">
<title>Edit ${song.songName}</title>
</head>
<body>

<div class="containerSideBySide">

	<!-- MAKE SURE TO LINK TO USER / PERMA LINK TO ALBUM -->
	<!-- WIP -->
		<h2>Edit or Update Song Details</h2>
			<form:form action="/songs/edit/${song.id}" method="post" modelAttribute="song">
				<div class="optionSelectContainer">
					<form:label path="songName">Song Name:</form:label><br><br>
					<form:errors class="errorAlertPopupContainer" path="songName"/>   
					<form:input type="text" path="songName" placeholder="Name of Song" class="entryContainer"/><br><br><br>
				</div>
				<div class="optionSelectContainer">
					<form:label path="songOpeningLyrics">Opening Lyrics:</form:label><br><br>
					<form:errors class="errorAlertPopupContainer" path="songOpeningLyrics"/>  
					<form:input type="text" path="songOpeningLyrics" placeholder="Opening Lyrics" class="entryContainer"/><br><br><br>
				</div>
				<div class="optionSelectContainer">
					<form:label path="songDurationInSeconds">Time in Seconds:</form:label><br><br>
					<form:errors class="errorAlertPopupContainer" path="songDurationInSeconds"/>   
					<form:input type="text" path="songDurationInSeconds" placeholder="Seconds" class="entryContainer"/><br><br>
				</div>
				<div class="optionSelectContainer">
					<form:label path="songLength">Song Length:</form:label><br><br>
					<form:errors class="errorAlertPopupContainer" path="songLength"/>   
					<form:input type="text" path="songLength" placeholder="H : MM : SS" class="entryContainer"/><br><br><br>
				</div>
				<div class="optionSelectContainer">
					<form:label path="age">Age of Song:</form:label><br><br>
					<form:errors class="errorAlertPopupContainer" path="age"/>  
					<form:input type="text" path="age" placeholder="Age" class="entryContainer"/><br><br><br>
				</div><br>
				<button class="buttonStyle">Update Song</button>
				<a class="aTagStyle" href="/homepage"> Cancel Changes </a>
			</form:form> 
</div>
</body>
</html>