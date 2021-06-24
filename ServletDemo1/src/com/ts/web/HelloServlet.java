package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet extends GenericServlet {
	
	private static final long serialVersionUID = 1L;

	public void init() {
		System.out.println("Inside init() method.");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
			System.out.println("Inside service() method.");
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<html>");
			out.print("<body>");
			out.print("<h1><center>Welcome to Hello Servlet</h1>");
			out.print("</body");
			out.print("</html>");		
	}
	
	public void destroy() {
		System.out.println("Inside destroy() method");
	}
}