package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/HrHomePage")
public class HrHomePage extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String loginId = (String)session.getAttribute("loginid");
		out.write("<body bgcolor=yellow text=green>");
		out.write("<h3>Hi! "+loginId+"</h3>"+"<h1><center>Welcome to HR page<br><a href='ProfileServlet.jsp'>Profile</a></center></h1><br/>");
		out.write("<form action="+"\"DispAll\""+"method="+"\"post\""+">");
		out.write("Display all members :<input type=submit value=Display><br/>");
		out.write("</form><br/>");
		out.write("<form action="+"\"DispByName\""+"method="+"\"post\""+">");
		out.write("Display by username:<input type = text name=empName><br/><input type=submit value=Display><br/>");
		out.write("</form><br/>");
		out.write("</body>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
