package com.carcaret.trx.console.util;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Date {

	public static final DateTimeFormatter TRX_FORMATTER = DateTimeFormat.forPattern("yyyyMMddHHmmss.SSSZ");
	
	private static final DateTimeFormatter YYYYMMDD_FORMATTER = DateTimeFormat.forPattern("yyyyMMdd");
	
	private static final DateTimeFormatter DDMMYYYY_FORMATTER = DateTimeFormat.forPattern("dd-MM-yyyy");
	
	public static String getDate(){
		return YYYYMMDD_FORMATTER.print(new DateTime());
	}
	
	public static String[] getFileDateInterval(String initDate, int interval){
		return getDateInterval(YYYYMMDD_FORMATTER.parseDateTime(initDate), interval, YYYYMMDD_FORMATTER);
	}
	
	public static String[] getChartDateInterval(String initDate, int interval){
		return getDateInterval(YYYYMMDD_FORMATTER.parseDateTime(initDate), interval, DDMMYYYY_FORMATTER);
	}
	
	private static String[] getDateInterval(DateTime initDate, int interval, DateTimeFormatter formatter){
		if(interval == 0){
			return new String[] {formatter.print(initDate)};
		}
		String[] dates = new String[interval];
		for(int i=0; i<interval; i++){
			dates[i] = (formatter.print(initDate.plusDays(i)));
		}
		return dates;
	}
	
}
