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
	<div>
		<div>
			<br> <br>
			<h1>${product.name}</h1>
		</div>
		<br> <br> <br>
		<div>
			<div>
				<h1>Categories</h1>
				<c:forEach items="${product.categories}" var="p">
					<ul>
						<li>${ p.name }</li>
					</ul>
				</c:forEach>

			</div>
			<div>
				<form:form action="/product/addCategory" method="POST"
					modelAttribute="relation">
					<form:input type="hidden" path="product" value="${product.id}" />

					<h3>add category</h3>
					<form:select class="form-select" path="category">
						<c:forEach items="${categories}" var="p">
							<form:option value="${ p.id }">${ p.name }</form:option>

						</c:forEach>
					</form:select>
					<button type="submit">add!</button>
				</form:form>

			</div>
		</div>
	</div>


</body>
</html>