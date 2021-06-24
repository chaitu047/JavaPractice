<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HrHomePage</title>
</head>

<body bgcolor=yellow >

<% String loginId = (String)session.getAttribute("loginid"); %>

<h3>Hi! <%=loginId%></h3>

<h1 style="text-align:center;">Welcome to HR page<br><a href='ProfileServlet.jsp'>Profile</a></h1><br/>

<center>
<form action= "DispAll.jsp">
Display all members :<input type=submit value=Display><br/>
</form><br/>

<form action="DispByName.jsp">
Display by username:<input type = text name=empName><input type=submit value=Display>
</form><br/>
</center>
</body>
</html>