package com.dhathika.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FailureController
 */
@WebServlet("/failure")
public class FailureController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FailureController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  System.out.println(" HttpServletRequest : " + request);  
		  System.out.println(" HttpServletResponse : " + response);
		  PrintWriter pr = response.getWriter();
		  String username =  request.getParameter("username");
		  pr.write("<html>");
		  pr.write("<head>");
		  pr.write("</head>");
		  pr.write("<title>");
		  pr.write("</title>");
		  pr.write("<body>");
		  pr.write("<h1>" + "Hi "  +  username + " User name must be more than 4 characters" + "</h1>");
		  pr.write("</body>");
		  pr.write("</html>");
	}

}
