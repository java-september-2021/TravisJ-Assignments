<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="/css/style.css">
	<title>${userLoggedIn.firstName} ${userLoggedIn.lastName}'s Profile</title>
</head>
	<body class="pagestyle">
		<div class="containerBasic">
			<h1>Your Profile Details:</h1>
			<div class="profileDetailsContainer">
				<p>First Name:</p>
				<h2>${userLoggedIn.firstName}</h2>
				<p>Last Name:</p>
				<h2>${userLoggedIn.lastName}</h2> 
				<p>Email Address:</p>
				<h2>${userLoggedIn.email}</h2> 
			</div>
			
			<%-- <div class="likedContainer">	
				<p id="ittyBittyLikes">Created Albums:</p>
				<ul>
					<c:forEach items="$user.albumOwner" var="album">
						<li><a href="/album.id">${album.albumName} by: ${album.bandName}</a>
					</c:forEach>
				</ul>
			</div><br> --%>
			
			
			<a class="aTagStyle" href="/homepage"> Return Home </a>
			
		</div>
		
		
		
	</body>
</html>