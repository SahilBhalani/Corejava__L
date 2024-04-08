<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body><%
	      String uname = (String)session.getAttribute("uname");
			if(uname==null)
			{
				request.setAttribute("err", "Please login first !!!");
				request.getRequestDispatcher("login1.jsp").forward(request, response);
			}
		%>
		

		<h1>Welcome Home)</h1>
		<a href="logout">Logout</a>

</body>
</html>