package com.dhathika.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dhathika.dto.Student;

public class StudentRepository {
	

	public String createStudentRecord(Student student) {
		boolean res = false;
		PreparedStatement pstmt = null;
//				String query = "insert into student values (" + student.getSno() + "," + "'" + student.getSname() + "'" + "," + student.getSmarks() + ")";
//				System.out.println(query);
				Connection connection = getConnection();				
				try {
					pstmt = connection.prepareStatement("insert into student values(?,?,?)");
					pstmt.setInt(1, student.getSno());										
					pstmt.setString(2, student.getSname());
					pstmt.setInt(3, student.getSmarks());
					
					
					//insert into student values(1010,'naresh',96);
					res = pstmt.execute();
					System.out.println(res);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(res==true) {
					return "created student record successfully";
				}
				else {
					return "failed to create student record in db";
				}
	}

	private Connection getConnection()  {
		
		Connection connection = null;
			try {
			
				Class.forName("oracle.jdbc.OracleDriver");

				 connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
						"dhathika");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
			return connection;
		
	}

	public List<Student> readStudentRecords()  {
		   ResultSet rs=null;
		   ArrayList<Student> studentList = null;
         Connection connection = getConnection();     
		try {
			studentList = new ArrayList<>();
			 PreparedStatement pstmt =  connection.prepareStatement("select * from student");
			rs = pstmt.executeQuery();
			 while(rs.next()) {
		        	Student std = new Student();
		        	std.setSno(rs.getInt(1));
		        	std.setSname(rs.getString(2));
		        	std.setSmarks(rs.getInt(3));
		        	studentList.add(std);
		        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
       
		return studentList;
	}

	
	public String updateStudentRecord(Student student) {
		boolean result =false;
		Connection connection = getConnection();
		try {
//			Statement stmt = connection.createStatement();
//			String updatequery = "update student set sname = " + "'" +  student.getSname() + "'"
//		            + "," + "smarks = " + student.getSmarks() + "where sno=" + student.getSno();
			PreparedStatement pstmt = connection.prepareStatement("update student set sname=?,smarks=? where sno=?");
			pstmt.setString(1, student.getSname());
			pstmt.setInt(2, student.getSmarks());
			pstmt.setInt(3, student.getSno());
			pstmt.execute();
//			 System.out.println(updatequery);
//			result = stmt.execute(updatequery);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result == true) {
			return "update is successfull";
		}
		else
		return "update is failure";
	}

	public String deleteStudentRecord(int sno) {
		boolean result = false;
        Connection connection = getConnection();
       try {
		PreparedStatement stmt =  connection.prepareStatement("delete from student where sno=?");
		stmt.setInt(1, sno);
		result = stmt.execute();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       if(result = true) {
    	   return "delete is successfull";
       }
       else
    	   return "delete is not successfull";
	}

	public Student selectOneStudentByNumber(int stdNo) {
		Student stdRecievedRecord = new Student();
		Connection connection =  getConnection();
		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from Student where sno = ?");
			String sql = "select * from AadharOne where  aadharNo=?";
			pstmt.setInt(1, stdNo);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
			stdRecievedRecord.setSno(rs.getInt(1));
			stdRecievedRecord.setSname(rs.getString(2));
			stdRecievedRecord.setSmarks(rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stdRecievedRecord;
	}

}
