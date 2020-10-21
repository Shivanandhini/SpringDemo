<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RelationShipCalculator</title>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>
<script type="text/javascript">
	function validateUserName() {
		var userName = document.getElementById("yn").value;
		if (userName.length < 3) {
			alert("Your name should have atleast one character");
			return false;
		} else {
			return true;
		}
	}
</script>
</head>
<body>
	<h1 align="center">RelationShip Calculator</h1>
	<hr>
	<form:form action="process-homepage" method="get"
		modelAttribute="userdto" onsubmit="return validateUserName()">
		<div align="center">
			<p>
				<label for="yn">Your Name:</label>
				<form:input id="yn" path="yourName" />
				<form:errors path="yourName" cssClass="error" />

			</p>
			<p>
				<label for="on">Other Name:</label>
				<form:input id="on" path="otherName" />
			</p>
			<p>
				<form:checkbox path="termsAndConditions" id="check" />
				<label>I am agreeing this for fun</label>
				<form:errors path="termsAndConditions" cssClass="error"></form:errors>
			</p>

			<input type="submit" value="calculate" />
		</div>
	</form:form>
</body>
</html>