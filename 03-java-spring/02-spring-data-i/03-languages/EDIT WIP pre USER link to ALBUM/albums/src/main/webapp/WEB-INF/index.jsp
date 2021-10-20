<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Albums Home Page</title>
<link rel="stylesheet" href="/css/style.css">
</head>

	<body class="pagestyle">
	
		<div class="containerBasic">
			<h1>Welcome to Record Albums, ${userLoggedIn.firstName} ${userLoggedIn.lastName}!</h1>
			<p>We are glad you're here.</p>
		
			<h2>Check out our exclusive content library!</h2>
			<p>The "Who's that" of the Music World.</p><br>
			<div class="frontPageDisplayHighlighter">
			<div>	
				<p id="totalsDisplay">Total Albums: ${allAlbums.size()}</p> 
				<p id="totalsDisplay">Total Songs: ${allSongs.size()}</p> 
			</div>
			<!-- THIS ALLOWS THE BUTTON TO TAKE YOU TO THE CREATE PAGE -->
			
			<%-- <form action="/newalbumHTMLadd">	
				<button class="buttonStyleSideBySide">Create New Album HTML Form</button>
			</form><br> --%>
			
		<!-- 	STILL WONT WORK -->
			<!-- <a href="/newalbumHTMLadd"> A TAG LINK TO SAME PLACE </a> -->
			
			<a class="aTagStyle" href="userProfilePage"> View Your Profile </a>
			<a class="aTagStyle" href="/newalbum"> Create New Album </a>
			<a class="aTagStyle" href="/songs/createnewsong"> Add New Song </a>
			<a class="aTagStyle" href="/userlogoff"> Secure Sign Out </a>
			</div>
				
			
				<%-- <form action="/newalbum">	
					<button class="buttonStyleSideBySide">Create New Album Spring MVC</button>
				</form>
				<!-- REMEMBER THIS HAS ITS OWN CONTROLLER WITH /song/ beginning -->
				<form action="/songs/createnewsong">	
					<button class="buttonStyleSideBySide">Create New Song</button>
				</form> --%>
		</div>
		
		<table class="tableContainerBasic">
			<thead >
				<tr >
					<th class="leftTableHeader">ID #</th>
					<th class="centerTableHeader">Album Name</th>
					<th class="centerTableHeader">Band Name</th>
					<th class="centerTableHeader">Year</th>
					<th class="rightTableHeader">Options</th>
				</tr>
				
				<!-- THIS CHECKS IF THE DATA WAS ENTERED -->
							<!-- THIS IS THE IF checker if its NULL -->
							
							<!--
							 SET COLOR PRIORITYS BASED ON WAHT IS ENTERED Check the referenced VAR is 
							-->
							
							<!-- USE THIS WHEN YOU WANT IT EMPTY -->
						    	<%-- <c:when test="${album.createdAt == null}"> 
						    	</c:when> --%>
						    	
						    <!-- DONT COMMENT WITHIN THE CHOOSE -->
				<c:forEach items="${allAlbums}" var="album">
					<tr class="tableContainerBasic"> 
						<td class="leftSingleCell">
							<a id="spaceMe">${album.id}</a>
						    <c:choose>
						    	<c:when test="${album.createdAt == null}"> 
						    		<p id="ittyBitty">Date Added: No Date Given</p>			   
						    	</c:when>
						    	
						    	<c:otherwise> 
						    		<p id="ittyBitty">Date Added: ${album.createdAt}</p>
						    	</c:otherwise>
						    </c:choose>
						</td>   
						<td class="singleCell">
							<p id="ittyBittyLikes">Total Likes: ${album.likers.size()}</p>  <!-- THIS IS ALBUM calling likers SHOWS total LIKES -->
							${album.albumName}
							<!-- MY user__id in state is called   userLoggedIn --V -->
							<c:choose> 
								<c:when test="${album.likers.contains(userLoggedIn)}">  
									<a id="aTagSmallButtonStyle" href="/unlike/${album.id}">Unlike</a>  
									<p>You liked this!</p>
								</c:when>
								<c:otherwise> 
									<a id="aTagSmallButtonStyle" href="/like/${album.id}">Like</a>  
								</c:otherwise>
							</c:choose>
						</td>
						<td class="singleCell">${album.artistName}</td>
						<td class="singleCell">${album.year}</td>
						<!-- DETAIL LINKS -->
						<td class="rightSingleCell">
							<a id="aTagSmallButtonStyle" href="edit/${album.id}">Edit</a>
							<a id="aTagSmallButtonStyle" href="album_details/${album.id}">View Details</a>
							<!-- MAKE THIS HIDDEN LATER -->
							<a id="aTagRED_URGENT" href="deleteAlbum/album/${album.id}">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</thead>
		</table>
	
	</body>
</html>