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

@WebServlet("/EditEmployee")
public class EditEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int empid = Integer.parseInt(request.getParameter("id"));
		EmployeeDAO empdao = new EmployeeDAO();
		Employee emp = empdao.getEmployee(empid);
		if(emp!=null)
		{
			request.setAttribute("emp", emp);
			RequestDispatcher rd = request.getRequestDispatcher("FormFill.jsp");
			rd.forward(request, response);
		}
		else
		{
			PrintWriter out = response.getWriter();
			out.write("<html>");
			out.write("<body bgcolor=yellow text=blue>");
			out.write("<h3> Cannot edit "+ empid +"</h3>" );
			out.write("</body></html>");
			RequestDispatcher rd = request.getRequestDispatcher("HrHomePage.jsp");
			rd.include(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
