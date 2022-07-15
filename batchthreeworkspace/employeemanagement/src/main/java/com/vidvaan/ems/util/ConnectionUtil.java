package com.vidvaan.ems.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ConnectionUtil {
	private static final Logger LOGGER = Logger.getLogger(ConnectionUtil.class);
	private static Properties properties = null;
	private static Connection connection = null;
	static {
		properties = new Properties();
		try {
			properties.load(ConnectionUtil.class.getClassLoader()
					.getResourceAsStream("com/vidvaan/ems/properties/db.properties"));
			Class.forName(properties.getProperty("DB_Driver_Class"));
		} catch (IOException | ClassNotFoundException e) {
			LOGGER.error(e.getMessage(), e);
			try {
				throw new InvalidConnectionException("Does not Load the Connection Properties");
			} catch (InvalidConnectionException e1) {
				LOGGER.error(e.getMessage(), e);
			}
		}
	}

	public static Connection getConnection() throws InvalidConnectionException {
		try {
			connection = DriverManager.getConnection(properties.getProperty("DB_URL"),
					properties.getProperty("DB_Username"), properties.getProperty("DB_Password"));
		} catch (SQLException e) {
			LOGGER.error(e.getMessage(), e);
			throw new InvalidConnectionException("Database Connection Failed");
		}

		return connection;

	}

	public static void close(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}
	}

	public static void close(Connection connection, PreparedStatement preparedStatement) {
		close(connection);
		if (preparedStatement != null) {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}
	}

	public static void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) throws InvalidConnectionException {
		close(connection, preparedStatement);
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				LOGGER.error(e.getMessage(), e);
				throw new InvalidConnectionException("Connection Failed");
			}
		}
	}
	
	public static void main(String[] args) {
		ConnectionUtil connectionUtil = new ConnectionUtil();
//		LOGGER.info(connectionUtil);
		System.out.println(connectionUtil);
	}
}
