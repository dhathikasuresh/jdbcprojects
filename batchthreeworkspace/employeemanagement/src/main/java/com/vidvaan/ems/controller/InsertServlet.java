package com.vidvaan.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.vidvaan.ems.model.Employee;
import com.vidvaan.ems.services.EmployeeService;
import com.vidvaan.ems.services.EmployeeServiceImpl;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/saveOrUpdate")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(InsertServlet.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		BasicConfigurator.configure();

		String ENO = request.getParameter("eno");
		int eno = 0;
		if (ENO != null && !ENO.trim().isEmpty()) {
			eno = Integer.parseInt(ENO);
		}
		String ename = request.getParameter("ename");
		String ENAME = null;
		if (ENAME != null && !ENAME.trim().isEmpty()) {
			ename = ENAME;
		}

		String ESAL = request.getParameter("esal");
		double esal = 0.0;
		if (ESAL != null && !ESAL.trim().isEmpty()) {
			esal = Double.parseDouble(ESAL);
		}
		// String date=request.getParameter("date");
		// System.out.println(date);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		// LocalDate date = LocalDate.parse(edob, dateTimeFormatter);
		// DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		// LocalDate edob = LocalDate.parse(request.getParameter("edob"),dtf);

		String EDOB = request.getParameter("edob");
		LocalDate edob = null;
		if (EDOB != null && !EDOB.trim().isEmpty()) {
			edob = LocalDate.parse(EDOB, dtf);
		}
		String ecity = request.getParameter("ecity");
		String ECITY = null;
		if (ECITY != null && !ECITY.trim().isEmpty()) {
			ecity = ECITY;
		}
		LOGGER.info("This is a Insert COntroller ");
		LOGGER.info(eno);
		Employee employee = new Employee(eno, ename, esal, edob, ecity);
		LOGGER.info(employee);
		PrintWriter out = response.getWriter();
		EmployeeService employeeService = new EmployeeServiceImpl();
		employeeService.insert(employee);
		LOGGER.info("Suucessfully Inserted");

	}

}
