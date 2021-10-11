<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
		</div>
		
		<div class="containerBasic">
			<form action="/newalbum" method="post">  <!-- form action is our END POINT -->
			<p>Album:</p>
				<input type="text" name="albumName" placeholder="Name of Album" class="entryContainer"><br><br>
			<p>Band:</p>
				<input type="text" name="artistName" placeholder="Band or Artist's Name" class="entryContainer"><br><br>
			<p>Year:</p>
				<input type="text" name="year" placeholder="Year Released" class="entryContainer"><br><br>
				<button class="buttonStyle">Add New Album</button>
			</form>
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