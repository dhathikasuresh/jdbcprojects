package com.dhathika.testconnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class OracleDBConnectionTest {
	
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		
		
		Properties properties = new Properties();
		properties.load(new FileInputStream(new File("C:\\javapropertiesutil\\dbproperties.properties")));
		System.out.println(properties.getProperty("db.driver.class"));
		Class.forName(properties.getProperty("db.driver.class"));
		 Connection connection = (Connection) DriverManager.getConnection(
				 properties.getProperty("db.connection.url"), properties.getProperty("db.username"), properties.getProperty("db.password"));
		 System.out.println(connection);
		
		

	}

}
