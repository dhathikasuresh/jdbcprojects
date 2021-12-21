package com.dhathika.dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	    // load the driver 
		Class.forName("oracle.jdbc.OracleDriver");
		
		// create connection object 
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "dhathika");

        System.out.println(connection);
		System.out.println("I am just a line to test git");
//        Statement statement = connection.createStatement();
//         String str = "insert into depptt values(1050)";
//         statement.execute(str);
      
     
         connection.commit();
     
  
//                 List<Dept> deptList = new ArrayList<Dept>();
//        		ResultSet rs = statement.executeQuery("select * from dept");
//        	
//          while(rs.next()) {
//        		Dept dept = new Dept();
//        dept.setDept_no(rs.getInt(1));
//        dept.setDept_location(rs.getString(2)); 
//        dept.setDept_name(rs.getString(3));
//        deptList.add(dept);
//          }
//         for(Dept dept: deptList) {
//        	 System.out.println(dept);
//         }
      
      
	}

}
