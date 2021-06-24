<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "com.dto.Employee,com.dao.EmployeeDAO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style> th,td {padding: 15px; text-align: center;}</style>
<title>Insert title here</title>
</head>
<body bgcolor=yellow>
<table style=width:50%>
<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Salary</th>
	<th>Login Id</th>
</tr>
<%EmployeeDAO empdao = new EmployeeDAO(); %>
<% for(Employee emp : empdao.getEmployeeList()) { %>
<tr>
	<td><%= emp.getEmpId() %></td>
	<td><%= emp.getEmpName() %></td>
	<td><%=emp.getEmpSalary() %></td>
	<td><%= emp.getLoginId() %></td>
</tr>
 <% } %>
</table><br/>
</body>
</html>