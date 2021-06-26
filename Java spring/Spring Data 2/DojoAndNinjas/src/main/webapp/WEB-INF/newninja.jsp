<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add New Ninja</h1>
	<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
		<p>
			<form:label path="dojo">Dojo Name : </form:label>
			<form:errors path="dojo"/>
			<select name="dojo" path="dojo">
				<c:forEach items="${dojo}" var="doj">
					<option value="${doj.id}">${doj.name}</option>
				</c:forEach>
			</select>
		</p>
		<br>
		<p>
			<form:label path="firstName">First Name : </form:label>
			<form:input path="firstName" />
			<form:errors path="firstName" />
		</p>
		<br>
		<p>
			<form:label path="lastName">Last Name : </form:label>
			<form:input path="lastName" />
			<form:errors path="lastName" />
		</p>
		<br>
		<p>
			<form:label path="age">Age : </form:label>
			<form:input path="age" />
			<form:errors path="age" />
		</p>
		<br>

		<input type="submit" value="create">


	</form:form>
</body>
</html>