package com.dhathika.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dhathika.model.Employee;
import com.dhathika.service.EmployeeService;
import com.dhathika.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeRegisterController
 */
public class EmployeeRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeRegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   Employee emp = new Employee();
		   emp.setFname(request.getParameter("firstname"));
		   emp.setMname(request.getParameter("middlename"));
		   emp.setLname(request.getParameter("lastname"));
		   
		   
		   
		   EmployeeService service = new EmployeeServiceImpl();
		   service.registerEmployee(emp);
		   
		   
		   
	
	}

}
