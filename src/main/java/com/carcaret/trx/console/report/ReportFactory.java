package com.carcaret.trx.console.report;

public final class ReportFactory {

	private ReportFactory(){
	}
	
	public static Report newInstance(ReportType type){
		switch (type) {
		case SERVICE:
			return new ServiceReport();
		default:
			throw new IllegalArgumentException(String.format("ReportType '%s' not supported", type));
		}
	}
	
}
