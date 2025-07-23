<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Register Page</h2>
	<form action="/submitForm" method="post">
		Email : <input class="form-control" type="text" name="email" placeholder="Enter Email"/><br>
		DEsignation: <input  class="form-control"  type="text" name="designation" placeholder="Enter Designation"/><br>
		Username: <input  class="form-control" type="text" name="username" placeholder="Enter username"/><br>
		Password: <input  class="form-control" type="password" name="password" placeholder="Enter password"/><br>
		<input  class="form-control"type="submit" value="submit"/>
	</form>
</body>
</html>