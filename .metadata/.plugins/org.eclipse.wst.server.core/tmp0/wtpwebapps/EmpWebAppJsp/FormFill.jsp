<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Employee Details</title>
<style>
th, td {
  padding: 15px;
}
</style>
</head>
<body bgcolor=yellow>
<h1 style="text-align:center;">Employee Details</h1>
<center>
<form action="FormServlet" method="post">
<table style="width:50%">
	<tr>
		<td>Enter EmpId </td>
		<td><input type=text name="empId" value="${emp.empId}" readonly></td>
	</tr>
	<tr>
		<td>Enter EmpName </td>
		<td><input type=text name="empName" value="${emp.empName}"></td>
	</tr>
	<tr>
		<td>Enter EmpSalary </td>
		<td><input type=text name="empSalary" value="${emp.empSalary }"></td>
	</tr>
	<tr>
		<td>Enter Login Id </td>
		<td><input type=text name="LoginId" value="${emp.loginId }" readonly disabled></td>
	</tr>
	<tr>
		<td>Enter Password </td>
		<td><input type=password name="Password" value="********" readonly disabled></td>
	</tr>
</table><br/>
<table style=width:50%>

	<tr>
		<td><input type=submit value="Update Details"></td>
		<td><a href ="GetEmployees">cancel</a></td>
	</tr>
</table>
</form>

</center>

</body>
</html>