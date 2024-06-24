<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">User Details</h1>
			<table class="table">
			<tr>
			<th>Id</th>
			<th>Uname</th>
			<th>Email</th>
			<th>Password</th>
			<th>Action</th>
			</tr>
			
		
		
		<c:forEach var="dt" items="${data}">
		<tr>
				<td>${dt.getId()}</td>
				<td>${dt.getUname()}</td>
				<td>${dt.getEmail()}</td>
				<td>${dt.getPass()}</td>
				<td><a href="update?action=edit&uid=${dt.getId()}">Edit</a></td>
				<td><a href="update?action=delete&uid=${dt.getId()}">Delete</a></td>
		</tr>	
		</c:forEach>
		</table>

</body>
</html>