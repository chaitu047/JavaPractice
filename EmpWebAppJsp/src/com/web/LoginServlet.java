package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.EmployeeDAO;
import com.dto.Employee;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String loginid=request.getParameter("LoginId");
		String password=request.getParameter("Password");
		HttpSession session = request.getSession();
		session.setAttribute("loginid",loginid);
		out.write("<html>");
		
		if(loginid.equalsIgnoreCase("HR") && password.equalsIgnoreCase("HR"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("HrHomePage.jsp");
			rd.forward(request, response);
		}
		else
		{
			EmployeeDAO empdao = new EmployeeDAO();
			Employee emp = empdao.getEmployee(loginid,password);
			session.setAttribute("employee",emp);
			if(emp!=null)
			{
			RequestDispatcher rd = request.getRequestDispatcher("EmpHomePage.jsp");
			rd.forward(request, response);
			}
			else
			{
				out.write("<body bgcolor=yellow text=green>");
				out.write("<h1><center>Invalid Credentials</center></h1>");
				out.write("</body>");
			}
		}
		out.write("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
