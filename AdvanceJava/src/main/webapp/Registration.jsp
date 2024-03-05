<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CrudForm</title>
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
	<form action="Reg" method="post">
		
		<div class="container">
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4">
				
			<h1 class="text-success"> Employee Registration Form</h1>
		
	
		
		<div class="form-group">
		<label>Username</label>
		<input type="text" class="form-control" name="uname">
		</div>
		
		
		<div class="form-group">
		<label>Email</label>
		<input type="email"  class="form-control" name="email">
		</div>
		
		<div class="form-group">
		<label>Phone</label>
		<input type="text"  class="form-control" name="phone">
		</div>
		
		<div class="form-group">
		<label>Pass</label>
		<input type="password"  class="form-control" name="pass">
		</div>
		
		

		
		<div class="form-group">
		<input type="submit" class="btn btn-success">
		</div>
		<span class="text-success"> ${msg} </span>
		<span class="text-danger">${err}</span>
		
<span><a href="display.jsp"  class="btn btn-primary">View</a></span>
		
	</form>
	</div>
			<div class="col-md-4"></div>
		</div>
	
	</div>
</body>
</html>