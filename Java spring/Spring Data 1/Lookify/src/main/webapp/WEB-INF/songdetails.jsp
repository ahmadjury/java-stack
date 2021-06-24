<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Title: ${song.title}</p>
	<p>Title: ${song.artist}</p>
	<p>Title: ${song.rating}</p>
	<form method="post" action="/songs/${ song.id}">
		<input type="hidden" name="_method" value="delete">
		<input type="submit" value="delete">
	</form>
</body>
</html>