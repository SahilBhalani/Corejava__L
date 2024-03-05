
<%@page import="Model.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>
</head>
<body>

	<div class="container">
	<div class="row">
	<div class="col-md-7 m-auto">
	<h1 align="center">Employee Data</h1>
			<table class="table">
			<tr>
			<th>Id</th>
			<th>Fname</th>
			<th>Lname</th>
			<th>Email</th>
			<th>Password</th>
			<th>Phone</th>
			<th colspan="2">Action</th>
			</tr>
			
			<%
			ArrayList<Employee> e = (ArrayList)request.getAttribute("data");
			for(Employee e1 : e)
			{%>
			<tr>
			<td><%=e1.getId()%></td>
			<td><%=e1.getFname()%></td>
			<td><%=e1.getLname()%></td>
			<td><%=e1.getEmail() %></td>
			<td><%=e1.getPass()%></td>
			<td><%=e1.getPhone()%></td>
			<td><a href="update?action=edit&uid=<%=e1.getId()%>"class="btn btn-primary">Edit</a></td>
			<td><a href="update?action=delete&uid=<%=e1.getId()%>"class="btn btn-danger">Delete</a></td>
			</tr>
			<% 	
			}
			
			%>
			
			</table>
			</div>
			</div>
			</div>
			
			

</body>
</html>