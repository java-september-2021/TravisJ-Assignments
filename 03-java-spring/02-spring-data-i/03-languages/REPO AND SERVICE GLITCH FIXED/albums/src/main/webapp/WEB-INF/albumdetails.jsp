<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="/css/style.css">
	<title>${albumDetails.albumName} Album Details</title>
</head>
	<body class="pagestyle">
	
		<div class="containerBasic">
			<p>Album:</p>
			<h1>${albumDetails.albumName}</h1>
			
			<p>Official Name: ${albumDetails.albumName}</p>
			<p>Band or Artist: ${albumDetails.artistName}</p>
			<p>Year Released: ${albumDetails.year}</p>
			<p>Date Created: ${albumDetails.createdAt}</p>
			<%-- <p>Recent Update: ${albumDetails.updatedAt} </p>   USE IF BASIC NO OPTION--%>
			<c:choose>
				<c:when test="${albumDetails.updatedAt == null}"> 
					<p>Last Update: No album edits or recent updates.</p>			   
				</c:when>
				<c:otherwise> 
					<p>Recent Update: ${albumDetails.updatedAt}</p>
				</c:otherwise>
			</c:choose>
			
			<a class="aTagStyle" href="/"> Return Home </a>
			
			<%-- <form action="/newalbum">	
				<button class="buttonStyleSideBySide">Create New Album Spring MVC</button>
			</form> --%>
		</div>
		<div class="containerBasic">
		<h2>Songs on ${albumDetails.albumName} by ${albumDetails.artistName}:</h2>
		<table class="tableContainerBasic">
			<thead >
				<tr >
					<th class="leftTableHeader">ID #</th>
					<th class="centerTableHeader">Song Name</th>
					<th class="centerTableHeader">Opening Lyrics</th>
					<th class="centerTableHeader">Duration in Seconds</th>
					<th class="centerTableHeader">Song Length</th>
					<th class="centerTableHeader">Date Created</th>
					<th class="centerTableHeader">Date Updated</th>
					<th class="rightTableHeader">Age of Song</th>
				</tr>
				<c:forEach items="${albumDetails.songs}" var="song">
					<tr class="tableContainerBasic">
						<td class="leftSingleCell">${song.id} 
						    <c:choose>
						    	<c:when test="${song.createdAt == null}"> 
						    		<p id="ittyBitty">Date Added: No Date Given</p>			   
						    	</c:when>
						    	<c:otherwise> 
						    		<p id="ittyBitty">Date Added: ${song.createdAt}</p>
						    	</c:otherwise>
						    </c:choose>
						<td class="singleCell">${song.songName}</td>
						<td class="singleCell">${song.songOpeningLyrics}</td>
						<td class="singleCell">${song.songDurationInSeconds}</td>
						<td class="singleCell">${song.songLength}</td>
						<c:choose>
						    	<c:when test="${song.createdAt == null}"> 
						    		<td class="singleCell">No Date Added</td>			   
						    	</c:when>
						    	<c:otherwise> 
						    		<td class="singleCell">${song.createdAt}</td>
						    	</c:otherwise>
						 </c:choose>
						 <c:choose>
						    	<c:when test="${song.updatedAt == null}"> 
						    		<td class="singleCell">No Updates</td>			   
						    	</c:when>
						    	<c:otherwise> 
						    		<td class="singleCell">${song.updatedAt}</td>
						    	</c:otherwise>
						 </c:choose>
						<%-- <td class="singleCell">${song.createdAt}</td>
						<td class="singleCell">${song.updatedAt}</td> --%>
						
						<!-- TRIED != null Optional.empty [] etc et c -->
						 <!-- ifPresent??? -->
						<c:choose>
						    	<c:when test="${empty song.age}"> 
						    		<td class="rightSingleCell">No Date Given</td>			   
						    	</c:when>
						    	<c:otherwise> 
						    		<td class="rightSingleCell">${song.age}</td>
						    	</c:otherwise>
						 </c:choose>
						<!-- IN CASE AGE IS BLANK -->
						<%-- <td class="rightSingleCell">${song.age}</td> --%>	
					</tr>
				</c:forEach>
			</thead>
		</table>
		</div>
	</body>
</html>