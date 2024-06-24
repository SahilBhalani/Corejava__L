<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="reg" method="post" enctype="multipart/form-data">
	<span>${msg}</span>

	<div>
	<input type="text" name="name" placeholder="Enter Name">
	</div>
	
	<div>
	<input type="text" name="email" placeholder="Enter email">
	</div>
	
	<div> 
	<input type="password" name="pass" placeholder="Enter password">
	</div>
	<div> 
	<input type="file" name="img" placeholder="Choose File">
	</div>
	
	
	<input type="submit"> 
</form>

</body>
</html>