<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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


   <div class="col-sm-8 col-xl-4">
                        <div class="bg-secondary rounded h-100 p-4">
                            <h6 class="mb-4">Product category</h6>
                            <form:form action="addCategory" modelAttribute="category" method="post">
                              <form:hidden path="id"/>
                                <div class="mb-3">
                                    <form:label path="categoryname" class="form-label">Category Name</form:label>
                                    <form:input path="categoryname" class="form-control"/>
                                </div>
                                
                                <button type="submit" class="btn btn-primary">Add Category</button>
                           </form:form>
                        </div>
                    </div>
         
         
		  <div class="col-3">
                        <div class="bg-secondary rounded h-100 p-4">
                            <h6 class="mb-4">Categories</h6>
                            <div class="table-responsive">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th scope="col">Id</th>
                                            <th scope="col">Category Name</th>
                                            <th colspan="2">Action</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                       
                                     <c:forEach var="dt" items="${categories}">
                                     
                                     <tr>
                                    		  <th scope="row">${dt.getId()}</th>
                                            <td>${dt.getCategoryname()}</td>
                                           	<td><a href="deleteCategory?did=${dt.getId()}">Delete</a></td>
                                    		<td><a href="updateCategory?eid=${dt.getId()}">Edit</a></td>
                                    </tr>
                                     </c:forEach>
                                           
                                            
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    </div>




</body>
</html>