package com.dhathika.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dhathika.dao.StudentDao;
import com.dhathika.pojo.Student;

public class WebSiteClient {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	
		
		Student std = new Student();
		Scanner sc = new Scanner(System.in);  	
	    StudentDao dao = new StudentDao();
	   
	  
	    
	    do {
	    	  System.out.println("select the operation you want to perform");
	 	      System.out.println("1 .insert student");
	 	      System.out.println("2 .update student");
	 	      System.out.println("3 .select student");
	 	      System.out.println("4 .delete student");
	 	      System.out.println("5. select all students");
	 	     int ch = sc.nextInt();
	    switch(ch){
	    	case 1:System.out.println("Enter student roll Number ");		
			        std.setrNo(sc.nextInt());
			        System.out.println("Enter student name");
			        std.setsName(sc.next());
		            System.out.println("enter student marks");
		            std.setMarks(sc.nextInt());
		            dao.createStudentRecord(std);
		            break;
	    	case 2: System.out.println("Enter student number you wnat to update");
		             std.setrNo(sc.nextInt());
				     System.out.println("Enter student name");
				     std.setsName(sc.next());
				     dao.updateStudentRecord(std);
				     break;
	    	case 3 : System.out.println("Enter a sno to select a student");
		             int sno = sc.nextInt();
		            Student std1 = dao.selectStudentRecord(sno);
		            System.out.println("the selcted student record is below");
		            System.out.println(std1);
		            break;
	    	case 4: System.out.println("enter a sno to delete a student record");
	    	        int sno1 = sc.nextInt();
	    	        dao.deleteStudentRecord(sno1);
	    	        System.out.println(sno1 + "is deleted from the db");
	    	        break;
	    	case 5: System.out.println(" your choice is to select al studensts from table");	      
	                 List<Student> stdlist =  dao.selectAllStudentRecord();
	                 for(Student std11 : stdlist) {
	                	 System.out.println(std11);
	                 }
	       
	        break;
	    	        
	    default:System.out.println("your choice is not present");
	            System.exit(0);
		             
	    }
	    }
	    while(1!=0);
	  
	  	

	}
	
}

