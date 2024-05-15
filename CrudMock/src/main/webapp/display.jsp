<%@page import="Model.Model"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1 Align="center"> User Details</h1>
<table class="table">
			<tr>
			<th>Id</th>
			<th>uname</th>
			<th>Email</th>
			<th>Password</th>
			<th colspan="2">Action</th>
			</tr>
			
			<%
			ArrayList<Model> m = (ArrayList)request.getAttribute("data");
			for(Model m1 : m)
			{ %>
			<tr>
			<td><%=m1.getId()%></td>
			<td><%=m1.getUname()%></td>
			<td><%=m1.getEmail()%></td>
			<td><%=m1.getPass()%></td>
			
			<td><a href="update?action=edit&uid=<%=m1.getId()%>">Edit</a></td>
			<td><a href="update?action=delete&uid=<%=m1.getId()%>">Delete</a></td>
			</tr>
			<% 	
			}
			%>
</body>
</html>