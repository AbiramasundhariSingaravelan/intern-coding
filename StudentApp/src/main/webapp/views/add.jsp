<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/submitForm" method="post">
		id : <input class="form-control" type="text" name="id" placeholder="Enter Id"/><br>
		name: <input  class="form-control"  type="text" name="name" placeholder="Enter Name"/><br>
		Department: <input  class="form-control" type="text" name="dept" placeholder="Enter Dept"/><br>
		address: <input  class="form-control" type="password" name="addr" placeholder="Enter Address"/><br>
		<input  class="form-control"type="submit" value="submit"/>
	</form>
</body>
</html>