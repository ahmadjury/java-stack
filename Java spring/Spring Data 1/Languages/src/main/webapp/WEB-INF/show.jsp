<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="/">Dashboard</a>
<p><c:out value="${languages.name}" /></p>
<p><c:out value="${languages.creator}" /></p>
<p><c:out value="${languages.version}" /></p>
<p><a href="/language/${languages.id}/edit ">edit</a></p>
<p><a href="/language/${languages.id}/delete ">delete</a></p>
</body>
</html>