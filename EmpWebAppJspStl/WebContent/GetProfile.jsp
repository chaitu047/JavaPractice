<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.dto.Employee" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GetProfile</title>
</head>
<body bgcolor=yellow text=green>
<jsp:include page="EmpHomePage.jsp" />
	<center>
		<table border=1>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Salary</th>
				<th>LoginId</th>
				<th>Password</th>
			</tr>
			<tr>
				<td>${ employee.empId  }</td>
				<td>${ employee.empName  }</td>
				<td>${ employee.empSalary }</td>
				<td>${ employee.loginId  }</td>
				<td>${ employee.password }</td>
			</tr>
		</table>
	</center>
</body>
</html>