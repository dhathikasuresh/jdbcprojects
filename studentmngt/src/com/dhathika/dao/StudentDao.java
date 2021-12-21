package com.dhathika.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.dhathika.pojo.Student;

public class StudentDao {
	
	public String createStudentRecord(Student std) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "dhathika");
		
		Statement stmt = connection.createStatement();
		
//		String str =  " insert into student1 values( " + std.getrNo() + "," + "'"+ std.getsName() + "'"+ "," + std.getMarks() + " ) ";
//		System.out.println(str);
//		boolean result = stmt.execute("create table Student1(sno int , sname varchar(20), smarks int)");
		
		boolean result1 = stmt.execute( " insert into student1 values( " + std.getrNo() + "," + "'"+ std.getsName() + "'"+ "," + std.getMarks() + " ) ");
		System.out.println(result1);
		connection.commit();
		connection.close();
		
		if(result1) {
			return "Student successfully inserted";
		}
		else{
			return "Student failed to insert into db";
		}
		
	
	}

}
