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

<!-- 
THIS IS WHERE THE USER WILL ADD
ALL added DATA IS VALIDATED through the MODELS package
In this case Album.java
 -->

	<body class="pagestyle">
		<div class="containerBasic">
			<h1>Create New Album</h1>
			<p>Please enter basic info to get your new album made.</p>
		</div>
		
		<div class="containerBasic">
			<form action="/tellJoke" method="post">
			<input type="text" name="name" placeholder="Your Name" class="entryContainer"><br><br>
			<textarea name="joke" placeholder="Tell a joke!" class="entryContainer"></textarea><br><br>
			<button class="buttonStyle">Submit Joke</button>
			</form>
		</div>
		
		<div class="containerBasic">
			<form action="/tellJoke" method="post">
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
		</div>
	</body>
</html>