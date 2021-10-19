<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
		<p>We are glad you could make it.</p>
	
		<h2>Check out our exclusive content library!</h2>
		<p>The "Who's that" of the Music World, soon will be all yours.</p>
	</div>
	
	<div class="containerBasic">
		<div class="newUserContainer">	
			<h1>Create Your New Account</h1>
			<p>Sign up today!</p>
			
			<form:form action="/registerNewUser" method="post" modelAttribute="user">
				<div class="landingPageOptionSelectContainer">
					<div id="lightPadding">
					<form:label path="firstName" id="lightPadding">First Name</form:label>
					<form:errors path="firstName" class="errorAlertPopupContainer"/>
					<form:input path="firstName" class="entryContainer" placeholder="First Name"/>
					</div>
					<div id="lightPadding">
					<form:label path="lastName" id="lightPadding">Last Name</form:label> 
					<form:errors path="lastName" class="errorAlertPopupContainer"/>
					<form:input path="lastName" class="entryContainer" placeholder="Last Name"/>
					</div>
					<div id="lightPadding">
					<form:label path="email" id="lightPadding">Email</form:label>
					<form:errors path="email" class="errorAlertPopupContainer"/>
					<form:input path="email" class="entryContainer" placeholder="Email Address"/><br><br>
					<p id="requiredlIttyBitty">We never spam! And will never share your data.</p>
					</div>
				</div>
				<div class="landingPageOptionSelectContainer">
					<div id="lightPadding">
					<form:label path="password" id="lightPadding">Password</form:label> 
					<form:errors path="password" class="errorAlertPopupContainer"/>
					<form:input path="password" class="entryContainer" placeholder="Password"/>
					</div>
					<div id="lightPadding">
					<form:label path="confirmPassword" id="lightPadding">Repeat Password</form:label>
					<form:errors path="confirmPassword" class="errorAlertPopupContainer"/>
					<form:input path="confirmPassword" class="entryContainer" placeholder="Repeat Password"/><br><br>
					<p id=requiredImportantlIttyBitty>Make sure your passwords match</p>
					</div>
				</div>
				<div class="landingPageOptionSelectContainer">
					<form:label path="age" id="lightPadding">Age</form:label>
					<form:errors path="age" class="errorAlertPopupContainer"/>
					<form:input path="age" class="entryContainer" placeholder="Your Age"/><br><br>
					<p id="optionalIttyBitty">Optional</p>
				</div><br>
				<button class="buttonStyle">Create Your Account</button>
			</form:form>
		</div>
	</div>
	
	

	</body>
</html>