<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="/getdata" method="POST">
        Your Name: <input type='text' name='name'><br>
         <label for="Dojo Location">Dojo Location:</label>
        <select name="Dojo_Location" id="Dojo_Location">
          <option value="San Jose">San Jose</option>
          <option value="Plaestine">Plaestine</option>
          <option value="japan">japan</option>
          <option value="London">London</option>
        </select><br>
        <label for="Favorite Language">Favorite Language:</label>
        <select name="Favorite_Language" id="Favorite_Language">
          <option value="Python">Python</option>
          <option value="Java">Java</option>
          <option value="Mern">Mern</option>
          <option value="Html">Html</option>
        </select><br>
        Comment: <input type='textarea' name='comment'><br>

                <input type='submit' value='create user'>
    </form>
</body>
</html>