<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
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
                 
               <div class="col-lg-5 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h1 class="card-title" align="center">User Details</h1>
                  <div class="table-responsive">
                    <table class="table table-bordered">
                      <thead>
                        <tr class="table-success">
                          <th scope="col">Id</th>
                          <th scope="col">Name</th>
                          <th scope="col">Email</th>
                          <th scope="col">Pass</th>
                          <th scope="col">Phone</th>
                          <th scope="col">Action</th>
                        </tr>
                      </thead>
                     <tbody>
                        <c:forEach var="dt" items="${users}">
                                        <tr class="table-success">
                                           
                                            <td>${dt.getId()}</td>
                                            <td>${dt.getName()}</td>
                                            <td>${dt.getEmail()}</td>
                                            <td>${dt.getPass()}</td>
                                            <td>${dt.getPhone()}</td>
                                            <td><a href="deleteUser?did=${dt.getId()}">Delete</a></td>
                                        </tr>
                                       </c:forEach>
                                       
                             </tbody>
                    </table>
                  </div>
                </div>
              </div>
            </div>
            </div>
</body>
</html>