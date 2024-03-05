<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display</title>
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
			<div class="col-md-5 m-auto">
			<h1 class="text-danger"> Display Employee Details</h1>
			<table class="table">
			<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Pass</th>
			<th colspan="2">Action</th>
			</tr>
			
			<%	
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","");
			
			PreparedStatement ps = cn.prepareStatement("select * from Registration");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{ %>
				<tr>
				<td><%=rs.getInt(1) %></td>
				<td><%=rs.getString(2)%></td>
				<td><%=rs.getString(3)%></td>
				<td><%=rs.getString(4)%></td>
				<td><%=rs.getString(5)%></td>
				<td><a href="update?action=edit&uid=<%=rs.getInt(1) %>" class="btn btn-primary">Edit</a></td>
				<td><a href="update?action=delete&uid=<%=rs.getInt(1) %>" class="btn btn-danger">Delete</a></td>
				</tr>
			<%}
			%>
			</table>
			</div>
			</div>
			</div>
</body>
</html>