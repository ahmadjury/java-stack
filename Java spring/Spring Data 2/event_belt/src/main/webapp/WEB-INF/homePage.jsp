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
	<h1>
		Welcome,
		<c:out value="${user.email}" />
	</h1>
	<h3>here are some of the events of your states</h3>
	<table>
		<tr>
			<th>Name</th>
			<th>date</th>
			<th>Location</th>
			<th>Host</th>
			<th>Action/status</th>
		</tr>
		<c:forEach items="${events}" var="eve">
			<tr>
				<td>${eve.name}</td>
				<td>${eve.date}</td>
				<td>${eve.city}</td>
				<td>${eve.planner.firstName}</td>
				<td><c:choose>
						<c:when test="${eve.planner}==${user}">
							<td><a>edit</a> <a>delete</a></td>
						</c:when>
						<c:when test="${eve.attendees.contains(user)}">
							<td><a>edit</a> <a>delete</a></td>
						</c:when>
						<c:otherwise>
       					Joining  <a>cancel</a>
						</c:otherwise>

					</c:choose></td>
			</tr>
		</c:forEach>
	</table>
	<h1>Create an event</h1>
	<form:form method="post" action="/events/new" modelAttribute="event">
	<form:hidden value="${ user.id }" path="planner"/>
		<p>
			<form:label path="name"> Name:</form:label>
			<form:input path="name" />
		</p>
		<p>
			<form:label path="date"> Date:</form:label>
			<form:input type="date" path="date" />

		</p>
		<p>
			<form:label path="city">Location:City/State:</form:label>
			<form:input path="city" />
			<form:select path="state">
				<form:option value="Pa"></form:option>
				<form:option value="Br"></form:option>
			</form:select>
		</p>

		<input type="submit" value="Submit" />
	</form:form>
	<a href="/logout">Logout</a>
</body>

</html>