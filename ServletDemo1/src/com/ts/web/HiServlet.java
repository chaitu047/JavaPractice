package com.ts.web;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HiServlet extends GenericServlet {
	
	private static final long serialVersionUID = 1L;

	public void init() {
		System.out.println("Inside init() method.");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
			System.out.println("Inside service() method.");	
	}
	
	public void destroy() {
		System.out.println("Inside destroy() method");
	}
}