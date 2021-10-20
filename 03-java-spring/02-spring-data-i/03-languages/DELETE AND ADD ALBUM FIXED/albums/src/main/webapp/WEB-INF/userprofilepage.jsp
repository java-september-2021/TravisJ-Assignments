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
				<%-- <p>Password:</p>
				<h2>${userLoggedIn.password}</h2> --%>
			</div>
			<div class="likedContainer">	
				<!-- SETUP A GET ALL TO GET ALL LIKES FOR THEIR ALBUMS
				usersAlbums likers?? -->
				<p id="ittyBittyLikes">Total Likes: ${albumDetails.likers.size()} </p> <!--  TOTAL LIKES IN ARRAY LIST -->
				<%-- <h2>Your Albums:</h2>
				<ul>
					<c:forEach items="${albumDetails.likers}" var="user">
						<li>${user.firstName} ${user.lastName}</li>
					</c:forEach>
				</ul> --%>
			</div><br>
			
			
			<a class="aTagStyle" href="/homepage"> Return Home </a>
			
		</div>
	</body>
</html>