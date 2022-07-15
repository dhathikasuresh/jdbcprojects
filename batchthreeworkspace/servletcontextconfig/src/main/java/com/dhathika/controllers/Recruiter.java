package com.dhathika.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Recruiter extends HttpServlet {
	  
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
        throws ServletException, IOException
    {
    	ServletConfig config = getServletConfig();
        String email
            = config.getInitParameter("Email");
        String value = config.getInitParameter("name");
        String value2 =  config.getInitParameter("pi");
        System.out.println(config.getServletName());
        System.out.println(config.getServletContext().getContextPath());
        
        ServletContext context = getServletContext();
        
        
        String website
            = context
                  .getInitParameter("Website-name");
        PrintWriter out = response.getWriter();
        out.println("<center><h1>" + website
                    + "</h1></center><br><p>Contact us:"
                    + email);
    }
}
