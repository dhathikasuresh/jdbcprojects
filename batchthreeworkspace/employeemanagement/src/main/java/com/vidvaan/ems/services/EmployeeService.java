package com.vidvaan.ems.services;

import com.vidvaan.ems.model.*;

import java.util.List;

public interface EmployeeService {

	public void insert(Employee employee);

	public void update(Employee employee);

	public void delete(int eno);

	public Employee findById(int eno);

	public List<Employee> findAll();
}
