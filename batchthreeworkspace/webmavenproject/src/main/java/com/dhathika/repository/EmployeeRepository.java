package com.dhathika.repository;

import com.dhathika.model.Employee;

public interface EmployeeRepository {
	
	public void registerEmployeeRepo(Employee employee);
	public Employee readAnEmployeeRepo(int empId);
	public void updateEmployeeRepo(Employee employee);
	public void deleteEmployeeRepo(int empId);

}
