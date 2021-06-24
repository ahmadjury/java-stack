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
	<p>Songs by artist : ${artist}</p>
	<form action="/search" method="post">
		<input type="text" name="artist"> <input type="submit"
			value="new Search" />
	</form>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Rating</th>
				<th>actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${songs}" var="song">
				<tr>
					<td><c:out value="${song.title}" /></td>
					<td><c:out value="${song.rating}" /></td>
					<td>
						<form method="post" action="/songs/${ song.id}">
							<input type="hidden" name="_method" value="delete"> <input
								type="submit" value="delete">
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>