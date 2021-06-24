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

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String loginid = (String)session.getAttribute("loginid");
		Employee emp=null;
		if(loginid.equalsIgnoreCase("hr"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("HrHomePage");
			rd.include(request, response);
			EmployeeDAO empdao = new EmployeeDAO();
			emp=empdao.getEmployeeLogin("hr");
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("EmpHomePage");
			rd.include(request, response);
			emp=(Employee)session.getAttribute("Employee");
		}
		out.write("<html>");
		out.write("<head><style> th,td {padding: 15px; text-align: center;}</style></head>");
		out.write("<body>");
		out.write("<table style=width:50%>");
		out.write("<tr><th>ID</th><th>Name</th><th>Salary</th><th>Login Id</th><th>Password</th></tr>");
		out.write("<tr><td>"+emp.getEmpId()+"</td><td>"+emp.getEmpName()+"</td><td>"+emp.getEmpSalary()+"</td><td>"+emp.getLoginId()+"</td><td>"+emp.getPassword()+"</td></tr>");
		out.write("</table><br/>");
		out.write("</body>");
		out.write("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
