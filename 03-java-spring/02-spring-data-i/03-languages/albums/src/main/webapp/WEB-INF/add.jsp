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

	<body class="pagestyle">
	
	<div class="containerBasic">
		<h1>Spring Boot Testing</h1>
		<p>Text to test if spring boot is working.</p>
	
		<h2>Adding some H2's Here</h2>
		<p>More text to test some amazing things...</p>
	</div>
	
	<div class="containerBasic">
		<h3>Here is some Java:</h3>
		<p><c:out value="  2 + 4 = ${2 + 4}"/></p>
		<p><c:out value="${1337 + 9001}"/></p>
	</div>
	
	<!--  THIS GOES TO THE REQUEST MAPPING - THROUGH CONTROLLERS  -->
	<!-- THIS CONNECTS TO THE MAIN_CONTROLLER connecting /telljoke -->
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