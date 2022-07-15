package com.dhathika.actions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


public class AdditionServlet implements Servlet {

	@Override
	public void destroy() {
	System.out.println("I am servlet destroy method");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("I am servletConfig method");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("I am servlet getServletInfo method");
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println(this);
		System.out.println("I am from initiation method");
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		String pass = request.getParameter("psw");
		
		
	
		
	
		PrintWriter pr = response.getWriter();
		pr.write("<html>" +
		          "<title>" + "Addition result" + "</title>"
				+ "<body>" 
		        + "<h1>" + "Welcome " + uname +"</h1>" 
				+ "</body>"
		        + "</html>");
		
	}

}
