package com.vidvaan.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.vidvaan.ems.dao.EmployeeDAOImpl;
import com.vidvaan.ems.model.Employee;
import com.vidvaan.ems.model.ResponseBean;
import com.vidvaan.ems.services.EmployeeService;
import com.vidvaan.ems.services.EmployeeServiceImpl;

/**
 * Servlet implementation class deleteServlet
 */

@WebServlet("/deleteById")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(deleteServlet.class);
	public deleteServlet() {
		super();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BasicConfigurator.configure();
		PrintWriter out = response.getWriter();
		String ENO = request.getParameter("eno");
		int eno = 0;
		if (ENO != null && !ENO.trim().isEmpty()) {
			eno = Integer.parseInt(ENO);
		}
		//int eno = Integer.parseInt(request.getParameter("eno"));
		EmployeeService employeeService = new EmployeeServiceImpl();
		Gson gson = new Gson();
		response.setContentType("Application/json");
		employeeService.delete(eno);
		LOGGER.info(eno);
		ResponseBean responseBean = new ResponseBean(200, "Deleted Successfully");
		String result = gson.toJson(responseBean);
		out.print(result);

	}
	
}
