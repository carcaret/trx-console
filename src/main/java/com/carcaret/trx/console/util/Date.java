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
	
	public static String[] getDateInterval(String initDate, int interval){
		return getDateInterval(YYYYMMDD_FORMATTER.parseDateTime(initDate), interval);
	}
	
	private static String[] getDateInterval(DateTime initDate, int interval){
		if(interval == 0){
			return new String[] {YYYYMMDD_FORMATTER.print(initDate)};
		}
		String[] dates = new String[interval];
		for(int i=0; i<interval; i++){
			dates[i] = (YYYYMMDD_FORMATTER.print(initDate.plusDays(i)));
		}
		return dates;
	}
	
}
