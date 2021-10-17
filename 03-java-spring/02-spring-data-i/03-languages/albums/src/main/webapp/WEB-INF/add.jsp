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
			<a class="aTagStyle" href="/"> Return Home </a>
		</div>
		
		<div class="containerSideBySide">
			<form action="/newalbumHTMLadd" method="post">  <!-- form action is our END POINT -->
			<h2>HTML FORM DATABASE ADD</h2>
			<div id="HTMLoptionSelectContainer">
				<p>Album:</p>
				<input type="text" name="albumName" placeholder="Name of Album" class="entryContainer">
			</div>
			<div id="HTMLoptionSelectContainer">
				<p>Band:</p>
				<input type="text" name="artistName" placeholder="Band or Artist's Name" class="entryContainer">
			</div>
			<div id="HTMLoptionSelectContainer">
				<p>Year:</p>
				<input type="text" name="year" placeholder="Year Released" class="entryContainer">
			</div>
				<button class="buttonStyle">Add Album</button>
			</form>
		</div>
		
		
		<!-- action is the newalbum -->
		<!-- NOTE the ** MODEL attribute ** add and  ** form:form ** -->
		<!-- ALSO ADD THE PREFIX at top with form -->
		<div class="containerSideBySide">
		<h2>SPRING MVC FORMS ADD</h2>
			<form:form action="/newalbum" method="post" modelAttribute="album">
				<div class="optionSelectContainer">
					<form:label path="albumName">Album:</form:label><br><br>
					<form:errors  class="errorAlertPopupContainer" path="albumName"/>   <!-- checks for validation errors and DISPLAYS error text-->
					<form:input type="text" path="albumName" placeholder="Name of Album" class="entryContainer"/><br><br><br>
				</div>
				<div class="optionSelectContainer">
					<form:label path="artistName">Band:</form:label><br><br>
					<form:errors class="errorAlertPopupContainer" path="artistName"/>   <!-- checks for validation errors and DISPLAYS error text-->
					<form:input type="text" path="artistName" placeholder="Band or Artist's Name" class="entryContainer"/><br><br><br>
				</div>
				<div class="optionSelectContainer">
					<form:label path="year">Year:</form:label><br><br>
					<form:errors class="errorAlertPopupContainer" path="year"/><br>   <!-- checks for validation errors and DISPLAYS error text-->
					<form:input type="text" path="year" placeholder="Year Released" class="entryContainer"/><br><br>
				</div>
				<button class="buttonStyle">Add Album</button>
			</form:form>
		</div>
		
		
		<!-- ADD LATER FOR OTHER APP -->
		
		<!-- <div class="containerBasic">
			<form action="/newuser" method="post">
			<input type="text" name="name" placeholder="Your Name" class="entryContainer"><br>
			
			<p>Location:  </p>
			<select type="text" name="location">
				<option>San Jose</option>
				<option>Egypt</option>
				<option>France</option>
				<option>London</option>
				<option>Spain</option>
			</select>
			
			<p>Favorite Language:  </p>
			<select type="text" name="language">
				<option>Java</option>
				<option>Python</option>
				<option>React</option>
				<option>Perl</option>
				<option>Angular</option>
			</select>
			
			<p>Comments:</p><br>
			<textarea name="joke" placeholder="Tell a joke!" class="entryContainer"></textarea><br><br>
			<button class="buttonStyle">Submit Your Results</button>
			</form>
		</div> -->
		
		
	</body>
</html>