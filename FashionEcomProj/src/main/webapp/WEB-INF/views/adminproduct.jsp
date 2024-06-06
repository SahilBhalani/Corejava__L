<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="vendors/mdi/css/materialdesignicons.min.css">
  <link rel="stylesheet" href="vendors/css/vendor.bundle.base.css">
  <!-- endinject -->
  <!-- plugin css for this page -->
  <!-- End plugin css for this page -->
  <!-- inject:css -->
  <link rel="stylesheet" href="css/style.css">
  <!-- endinject -->
  <link rel="shortcut icon" href="images/favicon.png" />
<body>
<div class="container-scroller d-flex">
<jsp:include page="adminsidebar.jsp"></jsp:include>

<div class="container-fluid pt-4 px-4">
	 
	 <div class="row g-4">
         
          <div class="col-sm-12 col-xl-6">
                       <div class="bg-secondary rounded h-100 p-4">
                            <h6 class="mb-4">Product</h6>
                            <form:form action="addProduct" modelAttribute="product" method="post" enctype="multipart/form-data">
                              <form:hidden path="id"/>
                                <div class="mb-3">
                                   	<select class="form-control" name="catid">
                                   		<c:forEach var="dt" items="${categories}">
                                   		<option value="${dt.getId()}">${dt.getCategoryname()}</option>
                                   		</c:forEach>
                                   	</select>
                                </div>
                                
                                <div class="mb-3">
                                    <form:label path="pname" class="form-label">Product Name</form:label>
                                    <form:input path="pname" class="form-control"/>
                                </div>
                                
                                <div class="mb-3">
                                    <form:label path="price" class="form-label">Price</form:label>
                                    <form:input path="price" class="form-control"/>
                                </div>
                                
                                <div class="mb-3">
                                    <form:label path="qty" class="form-label">Qty</form:label>
                                    <form:input path="qty" class="form-control"/>
                                </div>
                                
                                 <div class="mb-3">
                                    <lable class="form-label">Image</label>
                                    <input type="file" class="form-control" name="file">
                                </div>
                                
                                
                                
                                
                                <button type="submit" class="btn btn-primary">Add Product</button>
                           </form:form>
                        </div>
                    </div>
         
         
		  <div class="col-6">
                        <div class="bg-secondary rounded h-100 p-4">
                            <h6 class="mb-4">Products</h6>
                            <div class="table-responsive">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th scope="col">Id</th>
                                            <th scope="col">Category Name</th>
                                            <th scope="col">Product Name</th>
                                            <th scope="col">Price</th>
                                            <th scope="col">Qty</th>
                                            <th scope="col">Img</th> 
                                            <th colspan="2">Action</th>
                                           
                                        </tr>
                                    </thead>
                                    <tbody>
                                       
                                     <c:forEach var="dt" items="${products}">
                                     
                                     <tr>
                                    		  <th scope="row">${dt.getId()}</th>
                                    		   <th scope="row">${dt.getCategory().getCategoryname()}</th>
                                    		  <th scope="row">${dt.getPname()}</th>
                                    		  <th scope="row">${dt.getPrice()}</th>
                                    		  <th scope="row">${dt.getQty()}</th>
                                    		  <th scope="row">${dt.getImg()}</th>
                                           
                                           	<td><a href="deleteproduct?did=${dt.getId()}">Delete</a></td>
                                    		<td><a href="updateproduct?eid=${dt.getId()}">Edit</a></td>
                                    </tr>
                                     </c:forEach>
                                           
                                            
                                    </tbody>
                                </table>
                            </div>
                            </div>
                            </div>
                            </div>
                            </div>
                            
</div>

</body>
</html>