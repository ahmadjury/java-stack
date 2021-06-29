<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Register!</h1>
    <p><c:out value="${error}" /></p>
    <p><form:errors path="user.*"/></p>
    
    <form:form method="POST" action="/registration" modelAttribute="user">
        <p>
            <form:label path="email">Email:</form:label>
            <form:input type="email" path="email"/>
        </p>
        <p>
            <form:label path="password">Password:</form:label>
            <form:password path="password"/>
        </p>
        <p>
            <form:label path="passwordConfirmation">Password Confirmation:</form:label>
            <form:password path="passwordConfirmation"/>
        </p>
           <p>
            <form:label path="firstName">First Name:</form:label>
            <form:input path="firstName"/>
        </p>
             <p>
            <form:label path="lastName">Last Name:</form:label>
            <form:input path="lastName"/>
        </p>
        	<p>
			<form:label path="city"> Location:City/State</form:label>
			<form:input path="city" />
			<form:select path="state">
				<form:option value="Pa">pa</form:option>
				<form:option value="Br">Br</form:option>
			</form:select>

		</p>
        
        <input type="submit" value="Register!"/>
    </form:form>
    
</body>
</html>