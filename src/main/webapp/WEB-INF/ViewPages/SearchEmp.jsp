<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 style="text-align: center">
<a href="newemp">New Employee</a>
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="empall">New Employee</a>
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="semp">Search Employee</a>
</h3>
<hr />
<form method="post" action="sempinfo">
<h1 style="text-align: center">Search Employee</h1>
<input type="text" name="txtEmpno" placeholder="EmployeeNumber"/>
<input type="submit" value="Search Emp"/>
</form>
<hr />
<c:if test="${einfo!=null }">
<table width="100%" border=1>
<tr>
<th>Employee Number</th>
<th>Employee Name</th>
<th>Employee Job</th>
<th>Employee Email</th>
<th>Employee Password</th>
</tr>
<tr>
<td>${einfo.empno }</td>
<td>${einfo.empname }</td>
<td>${einfo.job }</td>
<td>${einfo.email }</td>
<td>${einfo.pswd }</td>
</tr>
</table>
</c:if>
<c:if test="${einfo==null }">
<h3>${info }</h3>
</c:if>
</body>
</html>