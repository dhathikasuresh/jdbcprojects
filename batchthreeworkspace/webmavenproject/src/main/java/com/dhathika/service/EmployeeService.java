package com.dhathika.service;

import com.dhathika.model.Employee;

public interface EmployeeService {
	
	public void registerEmployee(Employee employee);
	public Employee readAnEmployee(int empId);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(int empId);

}
