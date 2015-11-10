package com.carcaret.trx.console.service;

import com.carcaret.trx.console.dto.Result;
import com.carcaret.trx.console.report.ReportType;

public interface ReportService {
	
	Result generate(ReportType type);
	
}
