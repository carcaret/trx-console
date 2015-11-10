package com.carcaret.trx.console.report;

public final class VisitorFactory {

	private VisitorFactory(){
	}
	
	public static Visitor newInstance(ReportType type){
		switch (type) {
		case GENERAL:
			return new GeneralReport();
		default:
			throw new IllegalArgumentException(String.format("ReportType '%s' not supported", type));
		}
	}
	
}
