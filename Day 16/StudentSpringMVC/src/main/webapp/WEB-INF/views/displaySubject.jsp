<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE htsl>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>${message}</h3>
	<br>
	<table border='2'>
		<tr>
			<th>Subject id</th>
			<th>Subject Name</th>
			<th>Duration</th>
			<th>Start Date</th>
			<th>action</th>
		</tr>

		<c:forEach var="s" items="${slist}">
			<tr>
				<td>${s.sid}</td>
				<td>${s.sName}</td>
				<td>${s.duration}</td>
				<td>${s.stdt}</td>
				<td><a href="deletesubject/${s.sid}">delete</a>/<a
					href="editsubject/${s.sid}">edit</a></td>
			</tr>
		</c:forEach>

	</table>
	<a href="addSubject">Add new Subject</a>
</body>
</html>