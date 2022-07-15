package com.vidvaan.ems.dao;

import java.util.List;

import com.vidvaan.ems.model.Employee;

public interface EmployeeDAO {

	void insert(Employee employee);

	void update(Employee employee);

	void delete(int eno);

	Employee findById(int eno);

	List<Employee> findAll();
}
