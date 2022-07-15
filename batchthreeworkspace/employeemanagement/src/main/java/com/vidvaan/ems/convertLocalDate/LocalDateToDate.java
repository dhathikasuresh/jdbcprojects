package com.vidvaan.ems.convertLocalDate;

import java.sql.Date;
import java.sql.SQLData;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;

public class LocalDateToDate {
	private static final Logger LOGGER = Logger.getLogger(LocalDateToDate.class);
	
	public static LocalDate inputDate(String inputDate) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.parse(inputDate, dtf);
		return date;
	}
	public static java.sql.Date convertToSql(LocalDate localDate) {
		//LOGGER.info("SQL DATE");
		return Date.valueOf(localDate);
	}

	public static LocalDate convertToUtil(Date date) {
		//LOGGER.info("Util DATE");
		return date.toLocalDate();
	}

}
