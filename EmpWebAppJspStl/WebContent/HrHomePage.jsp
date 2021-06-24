<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HrHomePage</title>
</head>

<body bgcolor=yellow >
<form align="right">
	<a href="Login.html" script="right:10px; top:0px">Logout</a> &nbsp; &nbsp;
	<a href="HrHomePage.jsp">Home</a> &nbsp;
</form>
<h3>Hi! ${loginid}</h3>

<h1 style="text-align:center;">Welcome to HR page<br><a href="GetProfile.jsp">Profile</a></h1><br/>

<center>
<form action= "GetEmployees">
Display all members :<input type=submit value=Display><br/>
</form><br/>

<form action="GetEmpById">
Display by Id:<input type = text name=empId><input type=submit value=Display>
</form><br/>
</center>
</body>
</html>