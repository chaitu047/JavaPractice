package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDAO;
import com.dto.Employee;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int empid=Integer.parseInt(request.getParameter("empId"));
		String empname=request.getParameter("empName");
		double empsalary=Double.parseDouble(request.getParameter("empSalary"));
		String loginid=request.getParameter("LoginId");
		String password=request.getParameter("Password");
		
		Employee emp = new Employee(empid,empname,empsalary,loginid,password);
		
		EmployeeDAO empdao = new EmployeeDAO();
		int res = empdao.register(emp);
		if(res>0)
		{
			out.write("<html>");
			out.write("<body>");
			out.write("<h1><center>Registration Done Successfully....</center><h1><br/>");
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
			out.write("</body>");
			out.write("</html");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
