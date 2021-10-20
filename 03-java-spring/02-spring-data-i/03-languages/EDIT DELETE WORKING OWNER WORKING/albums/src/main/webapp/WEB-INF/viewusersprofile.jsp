<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="/css/style.css">
	<title>${user.firstName} ${user.lastName}'s Profile</title>
</head>
	<body class="pagestyle">
	
	<div class="containerBasic">
			<h1>Profile Details:</h1>
			<div class="profileDetailsContainer">
				<p>First Name:</p>
				<h2>${user.firstName}</h2>
				<p>Last Name:</p>
				<h2>${user.lastName}</h2> 
				<p>Email Address:</p>
				<h2>${user.email}</h2> 
			</div>
			
			
			<!-- TAG LIB!?!? -->
			<div class="likedContainer">	
				<p id="ittyBittyLikes">${user.firstName}'s Created Albums:</p>
				<ul>
					<c:forEach items="${user.userAlbums}" var="album">
						<li><a id="aHrefOptions" href="/album_details/${album.id}"> ${album.albumName} by: ${album.artistName}</a>
					</c:forEach>
				</ul>
			</div><br>
			
			<a class="aTagStyle" href="/homepage"> Return Home </a>
			
		</div>
		
	</body>
</html>