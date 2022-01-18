package com.dhathika.connectionutil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
	private static Connection connection;
	
public static Connection getConnection(){
	try {
		File file = new File("C://logs//dbcredentials.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(fis);
		Class.forName(properties.getProperty("db.driver.class"));
		 connection = DriverManager.getConnection(properties.getProperty("db.connection.url"), 
				 properties.getProperty("db.username"), properties.getProperty("db.password"));
		System.out.println(connection);
	} catch (ClassNotFoundException | SQLException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return connection;
	}

}
