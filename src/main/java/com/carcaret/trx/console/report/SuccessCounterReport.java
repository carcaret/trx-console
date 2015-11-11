package com.carcaret.trx.console.report;

import java.util.Arrays;

import com.carcaret.trx.console.dto.Result;
import com.carcaret.trx.console.statistics.Service;

public class SuccessCounterReport implements Visitor {

	private final Result result;

	public SuccessCounterReport(String... dates) {
		Result.Series series = new Result.Series();
		series.setName("Requests");

		result = new Result();
		result.setLabels(Arrays.asList(dates));
		result.setSeries(Arrays.asList(series));
	}

	@Override
	public void visit(Service service) {
		result.getSeries().get(0).getData().add(Integer.toString(service.getSuccessCounter()));
	}

	@Override
	public Result getResult() {
		return result;
	}

}
