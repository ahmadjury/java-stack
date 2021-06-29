<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Add a new product below:</h1>
<form:form action="/Product/create" method="POST" modelAttribute="product">
		<div>

			<form:label  path="name"> Name</form:label>
			<form:input  path="name" />
			<form:errors path="name" />
		</div>
		<div>

			<form:label  path="description"> Description</form:label>
			<form:input  path="description" />
			<form:errors path="description" />
		</div>
		<div>

			<form:label  path="price"> Price (decimal)</form:label>
			<form:input   path="price"/>
			<form:errors path="price" />
		</div>
		
		<button type="submit">Add product!</button>

	</form:form>
	</div>
</body>
</html>