package com.carcaret.trx.console.util;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Date {

	public static final DateTimeFormatter TRX_FORMATTER = DateTimeFormat.forPattern("yyyyMMddHHmmss.SSSZ");
	
	private static final DateTimeFormatter YYYYMMDD_FORMATTER = DateTimeFormat.forPattern("yyyyMMdd");
	
	public static String getDate(){
		return YYYYMMDD_FORMATTER.print(new DateTime());
	}
	
}
