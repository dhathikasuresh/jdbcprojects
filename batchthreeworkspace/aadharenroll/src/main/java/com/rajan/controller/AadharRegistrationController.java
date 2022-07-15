package com.rajan.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rajan.model.Aadhar;
import com.rajan.servlce.AadharService;

/**
 * Servlet implementation class AadharRegistrationController
 */
@WebServlet("/register")
public class AadharRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	AadharService service =  new AadharService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AadharRegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Aadhar aadhar = new Aadhar();
		
		service.registerAadhar(aadhar);
	}

}
