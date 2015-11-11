package com.carcaret.trx.console.report;

public enum ReportType {
	GENERAL("General"), AVG("Medias"), SUCCESS_COUNTER("Total peticiones con éxito");
	
	private final String name;
	
	private ReportType(String name){
		this.name = name;
	}
	
	public String getType() {
		return this.name;
	}
	
	public static ReportType getType(String type) {
		for (ReportType reportType : values()) {
			if (reportType.getType().equalsIgnoreCase(type)) {
				return reportType;
			}
		}
		return ReportType.GENERAL;
	}
}
