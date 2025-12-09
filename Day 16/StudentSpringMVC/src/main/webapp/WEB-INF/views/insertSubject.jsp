<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addNewSubject" method="post">
		Subject ID: <input type="text" name="sid" id="sid" /> <br>
		Subject Name: <input type="text" name="sName" id="sName" /> <br>
		Subject Duration: <input type="text" name="duration" id="duration" />
		<br> Started on: <input type="date" name="stdt" id="stdt" /> <br>
		<button type="submit" name="add" id="add">Add</button>
		<br>

	</form>
</body>
</html>