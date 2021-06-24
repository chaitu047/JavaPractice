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


@WebServlet("/DispByName")
public class DispByName extends HttpServlet {

	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		String name=request.getParameter("empName");
		PrintWriter out = response.getWriter();
		EmployeeDAO empdao = new EmployeeDAO();
		Employee emp = empdao.getEmployee(name);
		RequestDispatcher rd = request.getRequestDispatcher("HrHomePage");
		rd.include(request, response);
		out.write("<html>");
		out.write("<style> th,td {padding: 15px; text-align: center;}</style>");
		out.write("<body>");
		out.write("<table style=width:50%>");
		out.write("<tr><th>ID</th><th>Name</th><th>Salary</th><th>Login Id</th></tr>");
		out.write("<tr><td>"+emp.getEmpId()+"</td><td>"+emp.getEmpName()+"</td><td>"+emp.getEmpSalary()+"</td><td>"+emp.getLoginId()+"</td></tr>");
		out.write("</table><br/>");
		out.write("</body>");
		out.write("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
