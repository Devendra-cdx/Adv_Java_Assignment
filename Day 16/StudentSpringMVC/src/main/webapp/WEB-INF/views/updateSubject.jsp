<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Update Subject</h1>
	<h3>${message}</h3>

	<form action="modifySubject" method="post">
		Subject ID: <input type="text" name="sid" id="sid" value="${sub.sid}" readonly /> <br>
		Subject Name: <input type="text" name="sName" id="sName" value="${sub.sName}" /> <br>
		Subject Duration: <input type="text" name="duration" id="duration" value="${sub.duration}"/> <br>
		Started on: <input type="date" name="stdt" id="stdt" value="${sub.stdt}"/>
		<br>
		<button type="submit" name="update" id="update">Update</button>
		<br>

	</form>

</body>
</html>