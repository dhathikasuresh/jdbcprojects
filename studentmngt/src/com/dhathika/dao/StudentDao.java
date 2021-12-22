package com.dhathika.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dhathika.connectionutil.ConnectionUtil;
import com.dhathika.pojo.Student;


public class StudentDao {
	ConnectionUtil connectionutil = new ConnectionUtil(); ;
	Connection connection;
	
	public void createStudentRecord(Student std) throws ClassNotFoundException, SQLException {
		 
		
		connection =  connectionutil.getConnection();
		Statement stmt =connection.createStatement();
		
		
     String studentInsertQuery  = " insert into student1 values(" + std.getrNo() + "," + "'"+ std.getsName() + "'"+ "," + std.getMarks() + ")";
        stmt.execute(studentInsertQuery);  		
		connectionutil.commitConnection(connection);
		connectionutil.closeConnection(connection);
		
	
	}
	
	public Student selectStudentRecord(int sno) throws ClassNotFoundException, SQLException {
		 
		Connection connection = connectionutil.getConnection();
		
		Statement stmt = connection.createStatement();
		
		String selectQuery = "select * from student1 where sno=" + sno ;
		System.out.println(selectQuery);
		
//	    String studentInsertQuery  = " insert into student1 values(" + std.getrNo() + "," + "'"+ std.getsName() + "'"+ "," + std.getMarks() + ")";
        ResultSet rs = stmt.executeQuery(selectQuery);  
        Student std = new Student();
        while(rs.next())
        {
        	
        	std.setrNo(rs.getInt(1));
        	std.setsName(rs.getString(2));
        	std.setMarks(rs.getInt(3));
        }
        
        connectionutil.commitConnection(connection);
		connectionutil.closeConnection(connection);	
		
		return std;
		
	
	}
	
	public void updateStudentRecord(Student std) throws ClassNotFoundException, SQLException {
		
		Connection connection = connectionutil.getConnection();
		Statement stmt = connection.createStatement();
		
		String updateQuery = "update student1 set sname=" + "'" + std.getsName() + "'" +  " where sno=" + std.getrNo() ;
		System.out.println(updateQuery);
		
//	    String studentInsertQuery  = " insert into student1 values(" + std.getrNo() + "," + "'"+ std.getsName() + "'"+ "," + std.getMarks() + ")";
        stmt.execute(updateQuery);  		
        connectionutil.commitConnection(connection);
		connectionutil.closeConnection(connection);	
		
	
	}
	
	public void deleteStudentRecord(int sno) throws ClassNotFoundException, SQLException {
		 
		 connection = connectionutil.getConnection();
		Statement stmt = connection.createStatement();
		
		String deleteQuery = "delete from student1 where sno=" + sno; 
		
		System.out.println(deleteQuery);
		
//	    String studentInsertQuery  = " insert into student1 values(" + std.getrNo() + "," + "'"+ std.getsName() + "'"+ "," + std.getMarks() + ")";
        stmt.execute(deleteQuery);  		
        connectionutil.commitConnection(connection);
		connectionutil.closeConnection(connection);	
		
	
	}
	public List<Student> selectAllStudentRecord() throws ClassNotFoundException, SQLException {
		
		 
		 connection = connectionutil.getConnection();
		Statement stmt = connection.createStatement();
		
		List<Student> stdlist = new ArrayList<Student>();
		String selectQuery = "select * from student1"; 		
        ResultSet rs = stmt.executeQuery(selectQuery);  
        while(rs.next())
        {
        	Student std = new Student();
        	std.setrNo(rs.getInt(1));
        	std.setsName(rs.getString(2));
        	std.setMarks(rs.getInt(3));
        	stdlist.add(std);
        }
       connectionutil.commitConnection(connection);
		connectionutil.closeConnection(connection);	
		
		return stdlist;
	
	}
	
	

}
