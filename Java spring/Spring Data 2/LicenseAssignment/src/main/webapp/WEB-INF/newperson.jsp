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
<h1>Add New person</h1>
	<form:form action="/AddPerson" method="post" modelAttribute="person">
		<p>
			<form:label path="First_Name">First Name: </form:label>
			<form:input path="First_Name" />
			<form:errors path="First_Name" />
		</p>
		<br>
		<p>
			<form:label path="Last_Name">Last Name: </form:label>
			<form:input path="Last_Name" />
			<form:errors path="Last_Name" />

		</p>

		<input type="submit" value="go">


	</form:form>

</body>
</html>