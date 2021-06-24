<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add New license</h1>
	<form:form action="/license/new" method="post" modelAttribute="license">
		
			<form:label path="person">person: </form:label>
			<form:select path="person">
				<c:forEach items="${allpersons}" var="per">
					<form:option value="${per}">${per.firstName } ${per.lastName }</form:option>
				</c:forEach>
			</form:select>
		
			
		
		<p>
			<form:label path="state">State: </form:label>
			<form:input path="state" />
			<form:errors path="state" />
		</p>
		<p>
			<form:label path="expiration">expiration date: </form:label>
			<form:input type="date" path="expiration" />
			<form:errors path="expiration" />
		</p>
		<input type="submit" value="go">
		</form:form>
</body>
</html>