package com.dhathika.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Request in Welcome Controller" + req);
	    System.out.println(req.getParameter("username"));
		PrintWriter pr = resp.getWriter();
				pr.write("<html>");				
				pr.write("<head>");
				pr.write("<Title>Welcome Page </title>");
				pr.write("</head>");
				pr.write("<body>");
				pr.write("<p> Welcome to the application enjoy browsing the content</p>");
				pr.write("</body>");
				pr.write("</html>");
	
	}

}
