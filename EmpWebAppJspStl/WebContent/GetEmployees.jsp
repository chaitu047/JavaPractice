<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.dto.Employee" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GetEmployees</title>
</head>
<body bgcolor=yellow text=blue>

<jsp:include page="HrHomePage.jsp"/>

	<center>

		<table border=1>

			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Salary</th>
				<th>LoginId</th>
				<th colspan ="2">Actions</th>
			</tr>

			<c:forEach var="emp" items="${empList}">
			<tr>
				<td> ${ employee.empId  } </td>
				<td> ${ employee.empName } </td>
				<td> ${ employee.empSalary } </td>
				<td> ${ employee.loginId } </td>
				<td> <a href = "EditorEmployee.jsp/?empId=${employee.empId}">Edit</a></td>
				<td> <a href = "DeleteEmployee/?empId=${employee.empId }">Delete</a></td>
			</tr>
			</c:forEach>
		</table>

	</center>
</body>
</html>