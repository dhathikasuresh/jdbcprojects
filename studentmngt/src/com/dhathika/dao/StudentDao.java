package com.dhathika.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dhathika.pojo.Student;
import com.dhathika.connectionutil.ConnectionUtil;


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
	public List<Student> selectAllStudentRecords() throws ClassNotFoundException, SQLException {
		
		connection = connectionutil.getConnection();
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("select * from student1");
		List<Student> stdList = new ArrayList<Student>();
		while(rs.next()) {
			Student std = new Student();
			std.setrNo(rs.getInt(1));
			std.setsName(rs.getString(2));
			std.setMarks(rs.getInt(3));
			stdList.add(std);
		}
		
		
		return stdList;
		
	}

	public int[] executeBatchOfQueries() throws ClassNotFoundException, SQLException {
		
		connection = connectionutil.getConnection();
		Statement stmt = connection.createStatement();
		  String query1 =  "insert into student1 values(1133,'gowthami',79)";
		  String query2 = "update student1 set sname='pawan' where sno=1111";	    	
	     String query3 = "delete from student1 where sno=1022";
	     stmt.addBatch(query1);
	     stmt.addBatch(query2);
	     stmt.addBatch(query3);
	     
	     
	     int[] results =stmt.executeBatch();
	  
		return results;
		
	}
	
	public void createAStudentRecordUsingPStmt(Student std) throws ClassNotFoundException, SQLException {
		
		connection = connectionutil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("insert into student1 values(?,?,?)");
		pstmt.setInt(1, std.getrNo());
		pstmt.setString(2, std.getsName());
		pstmt.setInt(3, std.getMarks());
		
		pstmt.execute();
		
		
	}

	public void updateAStudentRecordUsingPStmt(Student std) throws ClassNotFoundException, SQLException {
		connection = connectionutil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("update student1 set sname=? where sno=? and smarks=?");
		pstmt.setString(1, std.getsName());
		pstmt.setInt(2, std.getrNo());
		pstmt.setInt(3, std.getMarks());
		pstmt.execute();
		
	}
	

}
