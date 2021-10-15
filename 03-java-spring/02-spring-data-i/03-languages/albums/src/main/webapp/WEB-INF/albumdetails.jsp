<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="/css/style.css">
	<title>Album Details</title>
</head>
	<body class="pagestyle">
	
		<div class="containerBasic">
			<p>Album:</p>
			<h1>Record Albums!</h1>
			
		
			<h2>Check out our exclusive content library!</h2>
			<p>The "Who's that" of the Music World.</p><br>
			
			<form action="/newalbum">	
				<button class="buttonStyleSideBySide">Create New Album Spring MVC</button>
			</form>
		
		</div>
		
		<table class="tableContainerBasic">
			<thead >
				<tr >
					<th class="leftTableHeader">ID #</th>
					<th class="centerTableHeader">Album Name</th>
					<th class="centerTableHeader">Band Name</th>
					<th class="rightTableHeader">Year</th>
				</tr>
				<c:forEach items="${allAlbums}" var="album">
					<tr class="tableContainerBasic">
						<td class="leftSingleCell">${album.id} 
						    <c:choose>
						    	<c:when test="${album.createdAt == null}"> 
						    		<p id="ittyBitty">Date Added: No Date Given</p>			   
						    	</c:when>
						    	
						    	<c:otherwise> 
						    		<p id="ittyBitty">Date Added: ${album.createdAt}</p>
						    	</c:otherwise>
						    </c:choose>
						    
						<td class="singleCell">${album.albumName}</td>
						<td class="singleCell">${album.artistName}</td>
						<td class="rightSingleCell">${album.year}</td>
					</tr>
				</c:forEach>
			</thead>
		</table>
	
	</body>
</html>