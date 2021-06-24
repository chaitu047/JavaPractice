package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig conf = getServletConfig();
		PrintWriter out = response.getWriter();
		out.print("sql="+conf.getInitParameter("sql"));
		out.print("<br/>message ="+conf.getInitParameter("message"));
		out.print("<br/><h1>Accessing content parameters</h1>");
		ServletContext context = getServletContext();
		out.print("driver="+context.getInitParameter("Driver"));
		out.print("<br/>url ="+context.getInitParameter("url"));
	}

}
