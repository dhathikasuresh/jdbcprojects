package com.vidvaan.junitTest;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.vidvaan.ems.convertLocalDate.LocalDateToDate;
import com.vidvaan.ems.dao.EmployeeDAO;
import com.vidvaan.ems.dao.EmployeeDAOImpl;
import com.vidvaan.ems.model.Employee;

public class EmsTest {
	private static final Logger LOGGER = Logger.getLogger(EmsTest.class);
	
	private EmployeeDAO employeeDAO = null;
	private Employee employee = null;
	@Before
	public void SetUp() {
		employeeDAO = new EmployeeDAOImpl();
	}
	@Test
	public void Save() {
		
		employeeDAO = new EmployeeDAOImpl();
		employee = new Employee("Sam", 20000.00, LocalDateToDate.inputDate("2010-10-28"), "FD");
		employeeDAO.insert(employee);
	}
	
	@Test
	public void Update() {
		employeeDAO = new EmployeeDAOImpl();
		employee = new Employee(49, "Navi", 20000, LocalDateToDate.inputDate("2010-10-28"), "SD");
		try {
			employeeDAO.update(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void Delete() {
		employeeDAO = new EmployeeDAOImpl();
		employeeDAO.delete(49);
	}
	@Test
	public void findByIdTest1() {
		employeeDAO = new EmployeeDAOImpl();
		employee = employeeDAO.findById(48);
		LOGGER.info(employee);
	}
	
	@Test
	public void findAllTest() {
		employeeDAO = new EmployeeDAOImpl();
		List<Employee> employee = employeeDAO.findAll();
		LOGGER.info(employee);
	}
	
	
	
	@Test
	public void findBYID() {
		employeeDAO = new EmployeeDAOImpl();
		employee = employeeDAO.findById(50);
		Assert.assertEquals(50, employee.getEno());
		Assert.assertEquals("Sam", employee.getEname());
		Assert.assertEquals(20000.0, employee.getEsal());
		Assert.assertEquals(LocalDateToDate.inputDate("2010-10-28"), employee.getEdob());
		Assert.assertEquals("FD", employee.getEcity());
		LOGGER.info(employee + "Get the Id Detatiles ");
	}
	
	@Test
	public void FindAll() {
		 Employee employee =new Employee();
		    employee.setEname("DINNU");
		    employee.setEsal(25000.0);
		    employee.setEdob(LocalDateToDate.inputDate("2014-02-23"));
		    employee.setEcity("HYD");
		    	EmployeeDAO dao=new EmployeeDAOImpl();
		        dao.insert(employee);
		        LOGGER.info("Inserted Sucess ");
		        
		        int eno = employee.getEno();
		        Assert.assertNotNull(eno);
		        Assert.assertEquals(2, dao.findAll().size());
		        Employee employee1 =dao.findById(30);

		        Assert.assertEquals("arun",employee1.getEname()); 
		        Assert.assertEquals(20000.0, employee1.getEsal());
		        Assert.assertEquals("SA", employee1.getEcity());
		        return;
	}
}
