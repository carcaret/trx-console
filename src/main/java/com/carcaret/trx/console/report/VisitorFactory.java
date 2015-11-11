package com.carcaret.trx.console.report;

import com.carcaret.trx.console.util.Date;

public final class VisitorFactory {

	private VisitorFactory(){
	}
	
	public static Visitor newInstance(ReportType type, String date, int interval){
		switch (type) {
		case GENERAL:
			return new GeneralReport();
		case AVG:
			return new AvgReport(Date.getDateInterval(date, interval));
		case SUCCESS_COUNTER:
			return new SuccessCounterReport(Date.getDateInterval(date, interval));
		default:
			throw new IllegalArgumentException(String.format("ReportType '%s' not supported", type));
		}
	}
	
}
