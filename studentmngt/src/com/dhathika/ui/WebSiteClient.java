package com.dhathika.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.dhathika.dao.StudentDao;
import com.dhathika.pojo.Student;

public class WebSiteClient {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		System.out.println("Enter student details ");
		
		Student std = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student roll Number ");
		std.setrNo(sc.nextInt());
		System.out.println("Enter student name");
		std.setsName(sc.next());
	    System.out.println("enter student marks");
	    std.setMarks(sc.nextInt());
	    
	    System.out.println(std);
	    StudentDao dao = new StudentDao();
	   String result = dao.createStudentRecord(std);
	   System.out.println(result);
		

	}

}
