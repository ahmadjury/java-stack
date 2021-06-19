<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript" src="js/app.js"></script>
</head>
<body>
	<div class= "head">
		<h1>your Gold:  </h1>
		<h2><c:out value="${gold}"/></h2>
		 
	</div>
	
	<div class="container" >
	<form method="POST" action="/processing" >
	<INPUT TYPE="hidden" NAME="form" VALUE="farm">
	<h1>Farm</h1>
	<h3>earn 10-20 gold</h3>
	<button>Find Gold!</button>
	</form> 
	
	<form method="POST" action="/processing" >
	<INPUT TYPE="hidden" NAME="form" VALUE="cave">
	<h1>Cave</h1>
	<h3>earn 5-10 gold</h3>
	<button>Find Gold!</button>
	</form> 
	
	<form method="POST" action="/processing">
	<INPUT TYPE="hidden" NAME="form" VALUE="house">
	<h1>House</h1>
	<h3>earn 2-5 gold</h3>
	<button>Find Gold!</button>
	</form> 
	
	<form method="POST" action="/processing">
	<INPUT TYPE="hidden" NAME="form" VALUE="casino">
	<h1>Casino!</h1>
	<h3>earn/takes 0-50 gold</h3>
	<button>Find Gold!</button>
	</form> 
	</div>
	
	<h1>Activities:</h1>
	ArrayList<String> arr = new ArrayList<String>();
	arr.add(
	<h3>You entered a <c:out value="${var}"/> and earn/lost <c:out value="${random}"/> gold 
	 <c:out value="${date}"/></h3>)
		for (int i =0 , i<arr.size,i++){
	

	


</body>
</html>