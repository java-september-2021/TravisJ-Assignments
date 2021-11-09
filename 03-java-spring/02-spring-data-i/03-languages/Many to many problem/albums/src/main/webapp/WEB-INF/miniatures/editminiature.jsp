<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/style.css">
<meta charset="UTF-8">
<title>Edit ${miniature.miniatureName}</title>
</head>
<body>

<div class="containerSideBySide">

	<!-- MAKE SURE TO LINK TO MINIATURE / PERMA LINK TO ALBUM -->
<!-- // id
// String image_url
// miniatureName
// miniatureDescription
// createdAt
// updatedAt -->
	<!-- WIP -->
		<h2>Edit or Update Miniature Details</h2>
			<form:form action="/miniatures/edit/${miniature.id}" method="post" modelAttribute="miniature">
				<div class="optionSelectContainer">
					<form:label path="image_url">Miniature Photo:</form:label><br><br>
					<form:errors class="errorAlertPopupContainer" path="image_url"/>   
					<form:input type="text" path="image_url" placeholder="Name of Miniature" class="entryContainer"/><br><br><br>
				</div>
				<div class="optionSelectContainer">
					<form:label path="miniatureName">Miniature Name:</form:label><br><br>
					<form:errors class="errorAlertPopupContainer" path="miniatureName"/>  
					<form:input type="text" path="miniatureName" placeholder="Miniature Name" class="entryContainer"/><br><br><br>
				</div>
				<div class="optionSelectContainer">
					<form:label path="miniatureDescription">Time in Seconds:</form:label><br><br>
					<form:errors class="errorAlertPopupContainer" path="miniatureDescription"/>   
					<form:input type="text" path="miniatureDescription" placeholder="Please enter a description of your miniature..." class="entryContainer"/><br><br>
				</div><br>
				<button class="buttonStyle">Update Miniature</button>
				<a class="aTagStyle" href="/homepage"> Cancel Changes </a>
			</form:form> 
</div>
</body>
</html>