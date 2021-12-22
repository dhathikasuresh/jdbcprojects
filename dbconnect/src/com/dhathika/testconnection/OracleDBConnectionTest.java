package com.dhathika.testconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDBConnectionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
			Class.forName("oracle.jdbc.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "dhathika");
			System.out.println(connection);
		
		

	}

}
