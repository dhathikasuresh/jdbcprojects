package com.dhathika.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Class.forName("oracle.jdbc.OracleDriver"); //  loading driver class 
		System.out.println("driver is loaded");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "dhathika");
		System.out.println(connection);
		
	}
}

