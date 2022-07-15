package com.dhathika.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dhathika.connectionutil.ConnectionUtil;
import com.dhathika.model.Employee;

public class EmployeeReposityImpl implements EmployeeRepository {

	public void registerEmployeeRepo(Employee employee) {
	 Connection connection = ConnectionUtil.getConnection();
	 try {
		PreparedStatement pstmt = connection.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?,?)");
		pstmt.setInt(1, employee.getEmpId());
		pstmt.setString(2, employee.getFname());
		pstmt.setString(3, employee.getMname());
		pstmt.setString(4, employee.getLname());
		
		pstmt.execute();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	public Employee readAnEmployeeRepo(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateEmployeeRepo(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	public void deleteEmployeeRepo(int empId) {
		// TODO Auto-generated method stub
		
	}

}
