package com.carcaret.trx.console.service;

import com.carcaret.trx.console.dto.Result;
import com.carcaret.trx.console.report.ReportType;
import com.carcaret.trx.console.statistics.ServiceType;

public interface ReportService {
	
	Result generate(ReportType reportType, ServiceType serviceType);
	
}
