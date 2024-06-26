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
	<input type="hidden" name="id" value="${edata.getId()}">

	<div>
	<input type="text" name="name" placeholder="Enter Name" value="${edata.getName()}">
	</div>
	
	<div> 
	<input type="file" name="img" placeholder="Choose File" value="${edata.getImg()}">
	</div>
	
	
	<input type="submit"> 
	
	<a href="display">Display</a>
</form>

</body>
</html>