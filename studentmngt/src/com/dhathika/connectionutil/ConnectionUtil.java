package com.dhathika.connectionutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
      Connection connection;
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
          Class.forName("oracle.jdbc.OracleDriver");		
		 connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "dhathika");
		 
		return connection;
	}
	
public void	closeConnection(Connection connection) throws SQLException{
		connection.close();
	}

public  void commitConnection(Connection connection) throws SQLException {
	connection.commit();
	
}
}
