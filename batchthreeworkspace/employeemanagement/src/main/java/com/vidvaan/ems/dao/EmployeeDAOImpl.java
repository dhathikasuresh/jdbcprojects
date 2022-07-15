package com.vidvaan.ems.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.vidvaan.ems.convertLocalDate.LocalDateToDate;
import com.vidvaan.ems.model.Employee;
import com.vidvaan.ems.queries.Queries;
import com.vidvaan.ems.util.ConnectionUtil;
import com.vidvaan.ems.util.InvalidConnectionException;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final Logger LOGGER = Logger.getLogger(EmployeeDAOImpl.class);
	private static Connection connection = null;
	private static PreparedStatement preparedStatement = null;
	private static ResultSet resultSet = null;

	public void insert(Employee employee)  {
		try {
			System.out.println("Then employee object is in dao layer :" + employee);
			//java.util.Date date = Date.valueOf(employee.getEdob());
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement("INSERT INTO EMPLOYEE(ENAME,ESAL,EDOB,ECITY) VALUES(?,?,?,?)");
			preparedStatement.setString(1, employee.getEname());
			preparedStatement.setDouble(2, employee.getEsal());
			preparedStatement.setDate(3, LocalDateToDate.convertToSql(employee.getEdob()));
			//preparedStatement.setDate(3, (Date) date);
			preparedStatement.setString(4, employee.getEcity());
			preparedStatement.executeUpdate();
		} catch (SQLException | InvalidConnectionException e) {
			e.printStackTrace();
			LOGGER.error(e.getMessage(),e);
		} finally {
			ConnectionUtil.close(connection, preparedStatement);
		}
	}

	/*public static void main(String[] args) {

		EmployeeDAO emp = new EmployeeDAOImpl();
		Employee emp1 = new Employee("Lakshmi", 20000, LocalDate.now(), "TS");
		emp.insert(emp1);
		LOGGER.info("Inserted Sucess");
		System.out.println("hai");
	}*/


	public void update(Employee employee) {
		try {
			//java.util.Date date = Date.valueOf(employee.getEdob());
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(Queries.EMS_UPDATE);
			preparedStatement.setString(1, employee.getEname());
			preparedStatement.setDouble(2, employee.getEsal());
			//preparedStatement.setDate(3, (Date) date);
			preparedStatement.setDate(3, LocalDateToDate.convertToSql(employee.getEdob()));
			preparedStatement.setString(4, employee.getEcity());
			preparedStatement.setInt(5, employee.getEno());
			preparedStatement.executeUpdate();
			System.out.println("Success");
		} catch (SQLException | InvalidConnectionException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement);
		}
	}
	/*public static void main(String[] args) {
		EmployeeDAOImpl emp = new EmployeeDAOImpl();
		Employee emp1 = new Employee(1, "Gopal", 30000, LocalDate.now(), "SP");
		emp.update(emp1);
	}*/

	public void delete(int eno) {
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(Queries.EMS_DELETE);
			preparedStatement.setInt(1, eno);
			preparedStatement.executeUpdate();
		} catch (SQLException | InvalidConnectionException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement);
		}
	}
	/*public static void main(String[] args) {
		EmployeeDAO emp = new EmployeeDAOImpl();
		emp.delete(8);
	}*/


	public Employee findById(int eno) {
		Employee employee = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(Queries.EMS_FIND_BY_ID);
			preparedStatement.setInt(1, eno);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				employee = new Employee();
				employee.setEno(resultSet.getInt("eno"));
				employee.setEname(resultSet.getString("ename"));
				employee.setEsal(resultSet.getDouble("esal"));
				employee.setEdob(LocalDateToDate.convertToUtil(resultSet.getDate("edob")));
				employee.setEcity(resultSet.getString("ecity"));

			}
		} catch (SQLException | InvalidConnectionException e) {
			e.printStackTrace();
		} finally {
			try {
				ConnectionUtil.close(connection, preparedStatement, resultSet);
			} catch (InvalidConnectionException e) {
				e.printStackTrace();
			}
		}
		return employee;
	}
	/*public static void main(String[] args) {
		EmployeeDAO emp = new EmployeeDAOImpl();
		Employee emp1 = emp.findById(3);
		System.out.println(emp1);
	}*/


	public List<Employee> findAll() {
		List<Employee> list = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(Queries.EMS_FINDALL);
			resultSet = preparedStatement.executeQuery();
			list = new ArrayList();
			while (resultSet.next()) {
				Employee employee = new Employee();
				employee.setEno(resultSet.getInt("eno"));
				employee.setEname(resultSet.getString("ename"));
				employee.setEdob(LocalDateToDate.convertToUtil(resultSet.getDate("edob")));
				employee.setEsal(resultSet.getDouble("esal"));
				employee.setEcity(resultSet.getString("ecity"));
				list.add(employee);
			}
		} catch (SQLException | InvalidConnectionException e) {
			e.printStackTrace();
		} finally {
			try {
				ConnectionUtil.close(connection, preparedStatement, resultSet);
			} catch (InvalidConnectionException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	/*public static void main(String[] args) {
		EmployeeDAO emp = new EmployeeDAOImpl();
		List<Employee> list = emp.findAll();
		System.out.println(list);
	}*/

}
