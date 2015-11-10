package com.carcaret.trx.console.service;

import java.io.FileInputStream;

import com.carcaret.trx.console.dto.Result;
import com.carcaret.trx.console.jaxb.TxStatistics;
import com.carcaret.trx.console.jaxb.engine.Marshaller;
import com.carcaret.trx.console.report.Report;
import com.carcaret.trx.console.report.ReportFactory;
import com.carcaret.trx.console.report.ReportType;
import com.carcaret.trx.console.statistics.Statistics;
import com.carcaret.trx.console.statistics.StatisticsImpl;

public final class ReportServiceImpl implements ReportService {

	@Override
	public Result generate(ReportType type) {
		try {
			Report report = ReportFactory.newInstance(type);
			TxStatistics txStatistics = Marshaller.unmarshall(new FileInputStream(
					"files/estadisticas.xml"));
			Statistics statistics = new StatisticsImpl(txStatistics);
			statistics.accept(report);
			return report.getResult();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
