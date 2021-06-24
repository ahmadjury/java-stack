<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${person.firstName} ${person.lastName}</h1>
	<table>
		<tr>
			<th>License number</th>
			<th>${person.license.number}</th>

		</tr>
		<tr>
			<th>State</th>
			<th>${person.license.state}</th>

		</tr>
		<tr>
			<td>Expiration date</td>
			<td>${person.license.expiration}</td>

		</tr>
	</table>
</body>

</html>