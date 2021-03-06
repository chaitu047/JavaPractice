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

@WebServlet("/GetEmpById")
public class GetEmpById extends HttpServlet {	
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		//reading values from client
		EmployeeDAO employeeDAO = new EmployeeDAO();
		Employee emp = null;
		int empid = -1;
		if(request.getParameter("empId")=="")
		{
			emp=null;
		}
		else
		{
		empid = Integer.parseInt(request.getParameter("empId"));
		}			
		emp =  employeeDAO.getEmployeeById(empid);
		if(emp != null) {
			request.setAttribute("emp", emp);
			RequestDispatcher rd = request.getRequestDispatcher("GetEmpById.jsp");
			rd.forward(request, response);	
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("HrHomePage.jsp");
			rd.include(request, response);	
			
			out.print("<center>");
			out.print("<h3 style='color:red;'>Employee Record Not Found!!!</h3>");
			out.print("</center>");
		}
		
		
			
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
