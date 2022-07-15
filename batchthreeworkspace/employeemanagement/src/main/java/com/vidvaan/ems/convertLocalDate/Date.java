package com.vidvaan.ems.convertLocalDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Date{

	public static void main(String[] args) throws ParseException {
		  String date1 ="01-Jan-2017";
		  String date2 = "02-Feb-2017";

		  DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		  LocalDate  d1 = LocalDate.parse(date1, df);
		  LocalDate  d2 = LocalDate.parse(date2, df);

		  Long datediff = ChronoUnit.DAYS.between(d1,d2);
		  
		System.out.println(d1);
	}

}
