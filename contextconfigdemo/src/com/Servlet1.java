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
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet1() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig conf = getServletConfig();
		PrintWriter out = response.getWriter();
		out.print("<br/><h1>Accessing config parameters in servlet1</h1>");
		out.print("sql="+conf.getInitParameter("sql"));
		out.print("<br/>message ="+conf.getInitParameter("message"));
		out.print("<br/><h1>Accessing content parameters</h1>");
		ServletContext context = getServletContext();
		out.print("driver="+context.getInitParameter("Driver"));
		out.print("<br/>url ="+context.getInitParameter("url"));
		
	}

}
