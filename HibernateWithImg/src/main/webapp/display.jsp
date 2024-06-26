<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Employee Details</h1>
			<table>
			<tr>
			<th>Id</th>
			<th>name</th>
			<th>Image</th>
			<th>Action</th>
			</tr>
			
		
		
		<c:forEach var="dt" items="${data}">
		<tr>
				<td>${dt.getId()}</td>
				<td>${dt.getName()}</td>
				<td><img src="img//${dt.getImg()}" alt="${dt.getImg()}" width="50px" height="50px"></td>
				<td><a href="update?action=edit&id=${dt.getId()}">Edit</a></td>
				<td><a href="update?action=delete&id=${dt.getId()}">Delete</a></td>
		</tr>	
		</c:forEach>
		</table>

</body>
</html>