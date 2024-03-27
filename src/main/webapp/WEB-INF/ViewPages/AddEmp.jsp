<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>  
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
<h1 style="text-align: center"> New Employee</h1>
<hr />
<frm:form method="post" action="newempinfo" modelAttribute="emp">
<p style="text-align:center">
<label>Employee Name</label>
<frm:input type="text" path="empname" placeholder="Employee Name" />
<br /><br />
<label>Employee Job:</label>
<frm:select path="job">
<frm:option value="Manager" label="Manger"/>
<frm:option value="Developer" label="Developer"/>
<frm:option value="Tester" label="Tester"/>
<frm:option value="Project Manager" label="Project Manger"/>
</frm:select>
<br /><br />
<label>Email</label>
<frm:input type="text" path="email" placeholder="Employee Email" />
<br /><br />
<label>Password</label>
<frm:input type="text" path="pswd" placeholder="Email Password" />
<br /><br />
<input type="submit" value="Add Employee" />
<br />
<h3>${info }</h3>
</p>
</frm:form>
</body>
</html>