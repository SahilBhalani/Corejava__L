<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User</title>
</head>
<body>
<span>${msg}</span>
	<form:form action="reg" modelAttribute="user" method="post">
		<form:hidden path="id" />
		<table border="1">
			<tr>
				<td><form:label path="uname">Username</form:label></td>
				<td><form:input path="uname" /></td>
			</tr>

			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input path="email" /></td>
			</tr>

			<tr>
				<td><form:label path="pass">Password</form:label></td>
				<td><form:password path="pass" /></td>
			</tr>

			<tr>
				<td><form:label path="gender">Gender</form:label></td>
				<td><form:radiobutton path="gender" value="male" />Male <form:radiobutton
						path="gender" value="female" />Female</td>
			</tr>

			<tr>
				<td><form:label path="country">Country</form:label></td>
				<td><form:select path="country">
						<form:option value="india">India</form:option>
						<form:option value="usa">Africa</form:option>
						<form:option value="canada">UK</form:option>
					</form:select></td>

			</tr>

			<tr>
				<td><form:label path="lang">Language</form:label></td>
				<td><form:checkbox path="lang" value="gujarati" />Gujarati <form:checkbox
						path="lang" value="hindi" />Hindi <form:checkbox path="lang"
						value="english" />English</td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit"></td>
			</tr>
	
		</table>
		</form:form>
		
		
		<table border="2">
		<h1>User Details</h1>
		<tr>
		<th>Id</th>
		<th>Uname</th>
		<th>Email</th>
		<th>Pass</th>
		<th>Gender</th>
		<th>Country</th>
		<th>Lang</th>
		</tr>
		
		<c:forEach var="dt" items="${data}">
		<tr>
		<td>${dt.getId()}</td>
		<td>${dt.getUname()}</td>
		<td>${dt.getEmail()}</td>
		<td>${dt.getPass()}</td>
		<td>${dt.getGender()}</td>
		<td>${dt.getCountry()}</td>
		<td>${dt.getLang()}</td>
		<td><a href="delete?did=${dt.getId()}">Delete</a></td>
		<td><a href="edit?eid=${dt.getId()}">Edit</a></td>
		</tr>
		
		
		</c:forEach>
		</table>
</body>
</html>