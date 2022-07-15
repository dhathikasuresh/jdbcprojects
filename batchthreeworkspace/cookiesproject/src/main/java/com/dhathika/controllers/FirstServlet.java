package com.dhathika.controllers;

import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
		
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String name = request.getParameter("userName");
			out.print("<html>");
			out.print("<head>");
			out.print("<title> firstpage</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("Welcome " + name);

			HttpSession session =  request.getSession();
			System.out.println("First session from request with getSession() method " +  session);
			System.out.println(session.getCreationTime());
					
			session.setAttribute("uname", name);
			session.setAttribute("password", "password123");
		
		
		// creating submit button

			out.print("<form action='servlet2' method = 'post'>");
			out.print("<input type='submit' value='go'>");
			out.print("</form>");
			out.print("</body>");
			out.print("</html>");
			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
