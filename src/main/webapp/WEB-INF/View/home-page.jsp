<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RelationShipCalculator</title>
</head>
<body>
	<h1 align="center">RelationShip Calculator</h1>
	<hr>
	<form:form action="process-homepage" method="get"
		modelAttribute="userdto">
		<div align="center">
			<p>
				<label for="yn">Your Name:</label>
				<form:input type="text" id="yn" path="yourName" />
			</p>
			<p>
				<label for="on">Other Name:</label>
				<form:input type="text" id="on" path="otherName" />
			</p>

			<input type="submit" value="calculate" />
		</div>
	</form:form>
</body>
</html>