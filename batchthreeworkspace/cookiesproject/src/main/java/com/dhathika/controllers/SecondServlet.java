package com.dhathika.controllers;

import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet {  
	  
public void doPost(HttpServletRequest request, HttpServletResponse response){  
    try{  
 
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
   
    HttpSession session =  request.getSession(true);
    System.out.println("a session from request with the method request.getSession(true)" + session);
    out.print("Hello "+session.getAttribute("uname"));  
      
    out.print("Hi" + session.getAttribute("password"));
  
    out.close();  
  
         }catch(Exception e){System.out.println(e);}  
    }  
      
  
}  
