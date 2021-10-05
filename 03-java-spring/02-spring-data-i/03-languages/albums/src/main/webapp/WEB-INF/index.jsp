<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Albums</title>
<link rel="stylesheet" href="/css/style.css">
</head>

	<body class="pagestyle">
	
	<div class="containerBasic">
		<h1>Record Albums!</h1>
		<p>The place to be.</p>
	
		<h2>Check out our exclusive content library!</h2>
		<p>It has the best of the best.</p>
	</div>
	
	<table>
		<tr>
			<th>ID Number: </th>
			<th>Album Name: </th>
			<th>Band Name: </th>
			<th>Year: </th>
		</tr>
		<c:forEach items="${allAlbums}" var="album">
			<tr>
				<th>${album.id}</th>
				<th>${album.albumName} </th>
				<th>${album.bandName}</th>
				<th>${album.year}</th>
			</tr>
		</c:forEach>
	</table>
	
	<div class="containerBasic">
		<h3>Here is some Java:</h3>
		<p><c:out value="  2 + 4 = ${2 + 4}"/></p>
		<p><c:out value="${1337 + 9001}"/></p>
	</div>
	
	<div class="containerBasic">
		<form action="/tellJoke" method="post">
		<input type="text" name="name" placeholder="Your Name" class="entryContainer"><br><br>
		<textarea name="joke" placeholder="Tell a joke!" class="entryContainer"></textarea><br><br>
		<button class="buttonStyle">Submit Joke</button>
		</form>
	</div>
	
	</body>
</html>