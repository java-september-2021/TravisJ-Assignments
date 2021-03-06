<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Albums</title>
<link rel="stylesheet" href="/css/style.css">
</head>

	<body class="pagestyle">
	
	<div class="containerBasic">
		<h1>Welcome to Albums!</h1>
		<p>The place to be.</p>
	
		<h2>Check out our exclusive content library!</h2>
		<p>The "Who's that" of the Music World.</p>
	</div>
	
	<div class="containerBasic">
		<h1>New User</h1>
		<p>Sign up today!</p>
			<form:form action="/registeruser" method="post" modelAttribute="user">
				<div>
					<form:label path="firstName">First Name</form:label> <!-- COSMETIC TEXT -->
					<form:errors path="firstName"/>
					<form:input path="firstName"/>
				</div>
			</form:form>
	</div>
	
	
	<table>
		<thead>
			<tr >
				<th class="leftTableHeader">ID</th>
				<th class="tableHeader">Album Name</th>
				<th class="tableHeader">Band Name</th>
				<th class="rightTableHeader">Year</th>
			</tr>
			
			<!-- var album is our iterator -->
			<c:forEach items="${allAlbums}" var="album">
				<tr class="tableContainerBasic">
					<td class="singleCell">${album.id}</td>
					<td>${album.albumName}</td>
					<td>${album.artistName}</td>
					<td class="singleCell">${album.year}</td>
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