package com.dhathika.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FailureController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pr = resp.getWriter();
		resp.setContentType("text");
				pr.write("<html>");				
				pr.write("<head>");
				pr.write("<Title>Welcome Page </title>");
				pr.write("</head>");
				pr.write("<body>");
				pr.write("<p> failed to login, please try again </p>");
				pr.write("</body>");
				pr.write("</html>");
		
		pr.write("<p> " + req.getParameter("username") + "</p> ");
		
//	
	}

}
