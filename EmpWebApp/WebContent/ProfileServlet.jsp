<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "com.dao.EmployeeDAO,com.dto.Employee"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style> th,td {padding: 15px; text-align: center;}</style>
</head>
<body bgcolor=yellow>
<%String loginid = (String)session.getAttribute("loginid"); %>
<%Employee emp=null; %>
<% if(loginid.equalsIgnoreCase("hr")) { %>
	<%EmployeeDAO empdao = new EmployeeDAO();%>
	<%emp=empdao.getEmployeeLogin("hr");%>
<% } else { %>
	<%emp=(Employee)session.getAttribute("Employee");%>
<% } %>
<table style=width:50%>
<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Salary</th>
	<th>Login Id</th>
	<th>Password</th>
</tr>
<tr>
	<td><%= emp.getEmpId() %></td>
	<td><%= emp.getEmpName() %></td>
	<td><%=emp.getEmpSalary() %></td>
	<td> <%= emp.getLoginId() %></td>
	<td><%=emp.getPassword()%></td>
</tr>
</table><br/>
</body>
</html>