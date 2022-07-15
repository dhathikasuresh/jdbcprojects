package com.dhathika.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet(description = "This is a login controller action java class", urlPatterns = { "/login" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
  
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    System.out.println("Entered into service method");
	   
		String receivedPassword = null;
	    PrintWriter pr = response.getWriter();
		String username =    request.getParameter("uname");
	    String password =   request.getParameter("pass");
	    try {
	    	System.out.println("Connecting with database ");
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "dhathika");
		    Statement stmt =  con.createStatement();
		   String query =  "select password from ACTIVEDIRECTORY where username = " + "'" + username + "'";
		   ResultSet rs = stmt.executeQuery(query);
		   while(rs.next()) {
			    receivedPassword = rs.getString(1);
		   }
		   
	    } catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("comparing the password");
	    if(password.equals(receivedPassword)) {
	    	pr.write("Login success full");
	    }
	    else {
	    	pr.write("Login failure, Check your password");
	    }
	}

}
