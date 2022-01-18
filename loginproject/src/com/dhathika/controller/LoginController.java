package com.dhathika.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet{
	
	Connection connection;
	
	@Override
	public void init() throws ServletException {
		try {
			File file = new File("C://logs//dbcredentials.properties");
			FileInputStream fis = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fis);
			Class.forName(properties.getProperty("db.driver.class"));
			 connection = DriverManager.getConnection(properties.getProperty("db.connection.url"), 
					 properties.getProperty("db.username"), properties.getProperty("db.password"));
			System.out.println(connection);
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	  System.out.println("request in LoginController " + req);
	    System.out.println(req.getParameter("username"));
	  String username = req.getParameter("username");
	  String password = req.getParameter("password");
	  try {
		Statement stmt = connection.createStatement();
		String query = "select USERNAME,PASSWORD from LOGINDETAILS where username=" 
				+"'"+ username +"'"+ "and " + "password=" +"'" + password+"'";	
		ResultSet rs = stmt.executeQuery(query);
	   PrintWriter pr = resp.getWriter();
	   if(rs.next()) {
//		 resp.sendRedirect("welcome");
		   RequestDispatcher rd = req.getRequestDispatcher("welcome");
		   rd.forward(req, resp);
	   }
	   else {
//		   resp.sendRedirect("failure");
		   RequestDispatcher rd = req.getRequestDispatcher("failure");
		   rd.forward(req, resp);
	}
	
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
	  
	}

}
