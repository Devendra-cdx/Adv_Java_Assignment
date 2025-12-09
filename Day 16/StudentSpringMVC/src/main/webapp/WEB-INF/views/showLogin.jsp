<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Login Form</h1>
	<br>
	<h3>${message}</h3>
	<br>
	<form action="validateUser" method="post">

		UserName : <input type="text" name="uname" id="uname" /> <br>
		Password : <input type="password" name="pwd" id="pwd" /> <br>

		<button type="submit" name="btn" id="btn">Login</button>

	</form>

	<a href="register">Register as new User</a>
	<a href="forgotPass">Forgot Password</a>

</body>
</html>