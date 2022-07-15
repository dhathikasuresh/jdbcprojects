package com.dhathika.connectionutil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
	
public static Properties properties;
public static Connection connection ;
	
static	{
	
		 properties = new Properties();
		File file = new File("C:\\properties\\dbproperties.properties");
		InputStream ins;
		try {
			ins = new FileInputStream(file);
			properties.load(ins);
			Class.forName(properties.getProperty("oracle.driver"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() {
		
		try {
			 connection = DriverManager.getConnection(properties.getProperty("oracle.url"),
					properties.getProperty("oracle.username"), properties.getProperty("oracle.password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	

}
