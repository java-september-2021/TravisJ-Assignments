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
		
		<table class="tableContainerBasic">
			<thead >
				<tr >
					<th class="leftTableHeader">ID</th>
					<th class="centerTableHeader">Album Name</th>
					<th class="centerTableHeader">Band Name</th>
					<th class="rightTableHeader">Year</th>
				</tr>
				<c:forEach items="${allAlbums}" var="album">
					<tr class="tableContainerBasic">
						<td class="leftSingleCell">${album.id}</td>
						<td class="singleCell">${album.albumName}</td>
						<td class="singleCell">${album.artistName}</td>
						<td class="rightSingleCell">${album.year}</td>
					</tr>
				</c:forEach>
			</thead>
		</table>
	
	</body>
</html>