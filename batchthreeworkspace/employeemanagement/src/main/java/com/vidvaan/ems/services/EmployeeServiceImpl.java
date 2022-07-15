package com.vidvaan.ems.services;

import java.util.List;

import com.vidvaan.ems.dao.EmployeeDAO;
import com.vidvaan.ems.dao.EmployeeDAOImpl;
import com.vidvaan.ems.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	public EmployeeServiceImpl() {
	}

	private EmployeeDAO employeeDAO = new EmployeeDAOImpl();


	public void insert(Employee employee) {
		employeeDAO.insert(employee);
	}


	public void update(Employee employee) {
		try {
			employeeDAO.update(employee);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void delete(int eno) {
		employeeDAO.delete(eno);
	}


	public Employee findById(int eno) {
		return employeeDAO.findById(eno);
	}

	
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

}
