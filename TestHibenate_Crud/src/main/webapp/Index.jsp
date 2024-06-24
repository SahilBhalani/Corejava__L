<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">Registration Form</h1>
	
	<form action="reg" method="post">
		<span>${msg}</span>
		
		<input type="hidden" value="${edata.getId()}" name="id">
		
		<label>Username</label>
		<input type="text" name="uname" placeholder="enter username">
	
		<label>Email</label>
		<input type="text" name="email" placeholder="enter Email"  >
		
			
		<label>Password</label>
		<input type="password" name="pass" placeholder="enter Password" >
		
		<br>
		<input type="submit">
		
		
		<span><a href="display">View Data</a></span>
		<span><a href="Login.jsp">Login Here</a></span>
	</form>
	

</body>
</html>