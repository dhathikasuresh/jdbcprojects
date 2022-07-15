package com.dhathika.service;

import java.util.Random;

import com.dhathika.model.Employee;
import com.dhathika.repository.EmployeeRepository;
import com.dhathika.repository.EmployeeReposityImpl;

public class EmployeeServiceImpl implements EmployeeService{

	EmployeeRepository repo = new EmployeeReposityImpl();
	public void registerEmployee(Employee employee) {
		Random random = new Random();
		int empNo = random.nextInt();
		employee.setEmpId(empNo);
		repo.registerEmployeeRepo(employee);
		
		
		
	}

	public Employee readAnEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		
	}

}
