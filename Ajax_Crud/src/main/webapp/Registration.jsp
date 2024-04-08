<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>
	
	<script type="text/javascript">
	
	$(document).ready(function(){
		 showdata()
	})
	
	function showdata()
	{
		$.get('display',{},function(rt){
			
			
			const data =  JSON.parse(rt)
			var row = "";
			for(var i=0;i<data.length;i++)
			{
				row = row+"<tr><td>"+data[i].id+"</td><td>"+data[i].fname+"</td><td>"+data[i].lname+"</td><td>"+data[i].email+"</td><td>"+data[i].pass+"</td><td>"+data[i].phone+"</td></tr>"
			}
			
			$('#tdata').html(row)
		})
	}
	
	function insertData()
	{
		var fname = $('#fname').val()
		var lname = $('#lname').val()
		var email = $('#email').val()
		var pass = $('#pass').val()
		var phone = $('#phone').val()
		
		$.post('reg',{fname,lname,email,pass,phone},function(rt){
			alert(rt)
			 showdata()
		})
		
	}
	</script>
	
	
</head>
<body>


	<div class="container">
		<h1 align='center'>Students</h1>
		<div class='row'>
			<div class='col-md-4'>
				<h2 align='center'>Registration Form</h2>

				<div class="from-group">
					
					<label>Firstname</label>
					<input type="text" name="fname" placeholder="enter Firstname"
						class="form-control" id='fname'>
				</div>
				
				<div class="from-group">
					<label>Lastname</label> <input type="text" name="lname"
						placeholder="enter Lastname" class="form-control" id='lname'>
				</div>

				<div class="from-group">
					<label>Email</label> <input type="text" name="email"
						placeholder="enter Email" class="form-control" id='email'>
				</div>

				<div class="from-group">
					<label>Password</label> <input type="password" name="pass"
						placeholder="enter Password" class="form-control" id='pass'>
				</div>

				<div class="from-group">
					<label>Phone</label> <input type="text" name="phone"
						placeholder="enter Phone" class="form-control" id='phone'>
				</div>

				<div class="from-group">
					<br> <input type="submit" class="btn btn-success" onclick="insertData()">
				</div>
			</div>
			<div class='col-md-8'>
				<h2 align='center'>Student Details</h2>

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
				<tbody id="tdata">
				
				</tbody>
				</table>



			</div>
		</div>
	</div>



</body>
</html>