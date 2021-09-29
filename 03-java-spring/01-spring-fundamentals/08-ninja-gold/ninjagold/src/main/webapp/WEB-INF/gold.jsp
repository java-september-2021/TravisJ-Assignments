<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Ninja Gold</title>
		<link rel="stylesheet" href="/css/style.css">
	</head>

<c:out value="${user}"/> <!-- his use is awesomePerson -->
<body>
	<div>	
		<h1>Ninja Gold Game</h1>
		<h2>Choose your adventure, test your luck & skill.</h2>
		
		<p>Your current gold:</p>
		<!-- Locations: FARM, CAVE, HOUSE and CASINO -->
		<div class="farm">
			<form method="POST" action="/findGold">
				<h3>Farm</h3>	
				<p>Earns 10 - 20 Gold</p>
				<!-- THIS TELLS WHAT SPECIFICALLY TO CALL WHEN
				USING THE /findGold in the MainController.java -->
				<input type="hidden" name="building" value="farm">
				<button>Search!</button>
			</form>
		</div>
		<div class="cave">
			<form method="POST" action="/findGold">
				<h3>Spooky Cave</h3>	
				<p>Earns 5 - 10 Gold</p>
				<!-- THIS TELLS WHAT SPECIFICALLY TO CALL WHEN
				USING THE /findGold in the MainController.java -->
				<input type="hidden" name="building" value="cave">
				<button>Search Under a Rock!</button>
			</form>
		</div>
		<div class="house">
			<form method="POST" action="/findGold">
				<h3>House</h3>	
				<p>Earns 2 - 5 Gold</p>
				<!-- THIS TELLS WHAT SPECIFICALLY TO CALL WHEN
				USING THE /findGold in the MainController.java -->
				<input type="hidden" name="building" value="house">
				<button>Search Couch Cushions!</button>
			</form>
		</div>
		<div class="casino">
			<form method="POST" action="/findGold">
				<h3>Casino</h3>	
				<p>Earns Up to 50 Gold - Risk Losing 50 Gold</p>
				<!-- THIS TELLS WHAT SPECIFICALLY TO CALL WHEN
				USING THE /findGold in the MainController.java -->
				<input type="hidden" name="building" value="casino">
				<button>Gamble!</button>
			</form>
		</div>
		<div class="spa">
			<form method="POST" action="/findGold">
				<h3>Spa</h3>	
				<p>Relax for 30-50 Gold</p>
				<!-- THIS TELLS WHAT SPECIFICALLY TO CALL WHEN
				USING THE /findGold in the MainController.java -->
				<input type="hidden" name="building" value="spa">
				<button>Relax...</button>
			</form>
		</div>	
		<div class="dragonsLair">
			<form method="POST" action="/findGold">
				<h3>Dragon's Lair</h3>	
				<p>The ULTIMATE Gamble</p>
				<!-- THIS TELLS WHAT SPECIFICALLY TO CALL WHEN
				USING THE /findGold in the MainController.java -->
				<input type="hidden" name="building" value="dragonsLair">
				<button>Brave the DRAGON!</button>
			</form>
		</div>	
			
			
			
			
			
	</div>
</body>
</html>