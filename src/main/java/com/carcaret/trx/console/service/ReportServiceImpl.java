package com.carcaret.trx.console.service;

import java.io.FileInputStream;

import com.carcaret.trx.console.dto.Result;
import com.carcaret.trx.console.jaxb.TxStatistics;
import com.carcaret.trx.console.jaxb.engine.Marshaller;
import com.carcaret.trx.console.report.ReportType;
import com.carcaret.trx.console.report.Visitor;
import com.carcaret.trx.console.report.VisitorFactory;
import com.carcaret.trx.console.statistics.Service;
import com.carcaret.trx.console.statistics.ServiceType;
import com.carcaret.trx.console.statistics.Statistics;
import com.carcaret.trx.console.statistics.StatisticsImpl;

public final class ReportServiceImpl implements ReportService {

	@Override
	public Result generate(ReportType reportType, ServiceType serviceType) {
		try {
			Visitor visitor = VisitorFactory.newInstance(reportType);
			TxStatistics txStatistics = Marshaller.unmarshall(new FileInputStream(
					"files/estadisticas.xml"));
			Statistics statistics = new StatisticsImpl(txStatistics);
			Service service = statistics.getService(serviceType);
			service.accept(visitor);
			return visitor.getResult();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
