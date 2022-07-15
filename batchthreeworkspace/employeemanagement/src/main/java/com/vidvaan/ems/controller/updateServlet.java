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
import com.vidvaan.ems.model.ResponseBean;
import com.vidvaan.ems.model.Employee;
import com.vidvaan.ems.services.EmployeeService;
import com.vidvaan.ems.services.EmployeeServiceImpl;

/**
 * Servlet implementation class updateServlet
 */
@WebServlet("/UpdateData")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(updateServlet.class);
	private EmployeeService employeeService = new EmployeeServiceImpl();

	public updateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("application/json");
	String ENO = request.getParameter("eno");
	int eno = 0;
	if (ENO != null && !ENO.trim().isEmpty()) {
		eno = Integer.parseInt(ENO);
	}
	System.out.println(eno);
	Employee employee=employeeService.findById(eno);
	Gson gson=new Gson();
	String empObj=gson.toJson(employee);
	System.out.println(empObj);
	response.getWriter().write(empObj);
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Update Corporate Controller Called" + "<br/>");
		String ENO = request.getParameter("eno");
		int eno = 0;
		if (ENO != null && !ENO.trim().isEmpty()) {
			eno = Integer.parseInt(ENO);
		}
		String ename = request.getParameter("ename");
		double esal = Double.parseDouble(request.getParameter("esal"));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-M-d");
		String EDOB = request.getParameter("edob");
		LocalDate edob = null;
		if (EDOB != null && !EDOB.trim().isEmpty()) {
			edob = LocalDate.parse(EDOB, dtf);
		}
		String ecity = request.getParameter("ecity");
		Employee employee = new Employee(eno, ename, esal, edob, ecity);
		employeeService.update(employee);
		LOGGER.info(employee);
		ResponseBean responseBean = new ResponseBean(200, "Updated Successfully");
		LOGGER.info("Updated" +eno+ "Successfully");
	}
}
