<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>I</title>
</head>
<body>

<form>
	<form action="reg" method="post">
		
				
		<h1 class="text-success">Registration Form</h1>
		
	
		<span>${msg}</span>
		<input type="hidden" name="id" >
		<label>Uname</label>
		<input type="text"  name="uname" >
		

		<label>email</label>
		<input type="text"  name="email">
	
		
		<label>Pass</label>
		<input type="password" name="pass">
		
		
		<input type="submit"> 
		
		</form>
		
		<span><a href="display">View Data</a></span>


</form>
</body>
</html>