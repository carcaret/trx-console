package com.carcaret.trx.console.service;

import com.carcaret.trx.console.dto.Result;
import com.carcaret.trx.console.jaxb.TxStatistics;
import com.carcaret.trx.console.report.ReportType;
import com.carcaret.trx.console.report.Visitor;
import com.carcaret.trx.console.report.VisitorFactory;
import com.carcaret.trx.console.statistics.Service;
import com.carcaret.trx.console.statistics.ServiceType;
import com.carcaret.trx.console.statistics.Statistics;
import com.carcaret.trx.console.statistics.StatisticsImpl;

public final class ReportServiceImpl implements ReportService {

	FileService fileService = new FileServiceImpl();
	
	@Override
	public Result generate(ReportType reportType, ServiceType serviceType, String date) {
		try {
			Visitor visitor = VisitorFactory.newInstance(reportType);
			TxStatistics txStatistics = fileService.getStatistics(date);
			Statistics statistics = new StatisticsImpl(txStatistics);
			Service service = statistics.getService(serviceType);
			service.accept(visitor);
			return visitor.getResult();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
