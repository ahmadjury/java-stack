<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Creator</th>
				<th>Version</th>
				<th>action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${langs}" var="lan">
				<tr>
					<td><a href=language/${lan.id}><c:out value="${lan.name}" /></a></td>
					
					<td><c:out value="${lan.creator}" /></td>
					<td><c:out value="${lan.version}" /></td>
					<td><a href="language/${lan.id}/delete ">delete</a>
					<a href="language/${lan.id}/edit ">edit</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<form:form action="/lang/create" method="post" modelAttribute="language">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:textarea path="creator"/>
    </p>
    <p>
        <form:label path="version">Version</form:label>
        <form:errors path="version"/>
        <form:input path="version"/>
    </p>
     
    <input type="submit" value="Submit"/>
</form:form>
	
</body>
</body>
</html>