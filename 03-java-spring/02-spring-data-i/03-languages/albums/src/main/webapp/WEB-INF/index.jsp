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
		<p>The "Who's that" of the Music World.</p>
	</div>
	
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Album Name</th>
				<th>Band Name</th>
				<th>Year</th>
			</tr>
			<c:forEach items="${allAlbums}" var="album">
				<tr>
					<td>${album.id}</td>
					<td>${album.albumName}</td>
					<td>${album.artistName}</td>
					<td>${album.year}</td>
					
				</tr>
			</c:forEach>
		</thead>
	</table>
	
	<%-- <div class="containerBasic">
		<c:forEach items="${allAlbums}" var="album">
		</c:forEach>
	</div> --%>
	
<!-- 	<div class="containerBasic">
		<form action="/tellJoke" method="post">
		<input type="text" name="name" placeholder="Your Name" class="entryContainer"><br><br>
		<textarea name="joke" placeholder="Tell a joke!" class="entryContainer"></textarea><br><br>
		<button class="buttonStyle">Submit Joke</button>
		</form>
	</div> -->
	
	</body>
</html>