package com.vidvaan.MockitoTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Spy;

import com.vidvaan.ems.dao.EmployeeDAO;
import com.vidvaan.ems.model.Employee;

public class MochitoTest{
	@InjectMocks
	private EmployeeDAO employeeDAO;
	@Spy
	private  List<Employee> listEmployee = new ArrayList<>();
	@Test
	public void save() {
		
	}
}
