<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EmpHomePage</title>
</head>
<body bgcolor=yellow >
<% String loginId = (String)session.getAttribute("loginid"); %>
<h3>Hi! <%= loginId %></h3><br/>
<h1 style="text-align:center;">Welcome to Employee page</h1><br/>
<h3 style="text-align:center;"><a href='ProfileServlet'>Profile</a></h3><br/>
</body>
</html>