<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit</title>
</head>
<body bgcolor=yellow>
<center>
<form action="EditEmployee" method="post">
<table style="width:50%">
	<tr>
		<td>Enter EmpId:</td>
		<td><input type=text name=empId disabled></td>
	</tr>
	<tr>
		<td>Enter EmpName:</td>
		<td><input type=text name=empName></td>
	</tr>
	<tr>
		<td>Enter EmpSalary:</td>
		<td><input type=text name=empSalary></td>
	</tr>
	<tr>
		<td>Enter Login Id:</td>
		<td><input type=text name=LoginId disabled></td>
	</tr>
	<tr>
		<td>Enter Password:</td>
		<td><input type=password name=Password disabled></td>
	</tr>
</table><br/>

<table style=width:50%>

	<tr>
		<td><input type=submit value=register></td>
		<td><input type=reset value=reset></td>
	</tr>
</table>
</form>
</center>
</body>
</html>