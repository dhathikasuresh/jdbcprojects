package com.vidvaan.ems.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.vidvaan.ems.model.Employee;
import com.vidvaan.ems.services.EmployeeService;
import com.vidvaan.ems.services.EmployeeServiceImpl;

/**
 * Servlet implementation class findAllServlet
 */
@WebServlet("/findAll")
public class findAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public findAllServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmployeeService employeeService = new EmployeeServiceImpl();
		List<Employee> listemployee = employeeService.findAll();
		Gson gson = new Gson();
		String data = gson.toJson(listemployee);
		response.setContentType("Application/json");
		response.getWriter().write(data);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
