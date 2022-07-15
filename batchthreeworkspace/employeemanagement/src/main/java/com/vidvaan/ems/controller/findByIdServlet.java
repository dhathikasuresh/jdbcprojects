package com.vidvaan.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
 * Servlet implementation class updateServlet
 */
@WebServlet("/findById")
public class findByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(findByIdServlet.class);
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public findByIdServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String ENO = request.getParameter("eno");
		int eno = 0;
		if (ENO != null && !ENO.trim().isEmpty()) {
			eno = Integer.parseInt(ENO);
		}
		EmployeeService employeeService = new EmployeeServiceImpl();
		Employee employee = employeeService.findById(eno);
		Gson gson = new Gson();
		String data = gson.toJson(employee);
		response.setContentType("application/json");
		response.getWriter().write(data);
		LOGGER.info(employee);
		LOGGER.info("Done");
	}


}
