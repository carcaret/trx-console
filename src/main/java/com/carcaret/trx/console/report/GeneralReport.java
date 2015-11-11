package com.carcaret.trx.console.report;

import java.util.Arrays;

import com.carcaret.trx.console.dto.Result;
import com.carcaret.trx.console.statistics.Service;

final class GeneralReport implements Visitor {

	private final Result result;

	public GeneralReport() {
		Result.Series client = new Result.Series();
		client.setName("Cliente");

		Result.Series server = new Result.Series();
		server.setName("Servidor");

		result = new Result();
		result.setLabels(Arrays.asList("Avg", "Min", "Max"));
		result.setSeries(Arrays.asList(client, server));
	}

	@Override
	public void visit(Service service) {
		for (Result.Series series : result.getSeries()) {
			if (series.getName().equals("Cliente")) {
				series.getData().addAll(
						Arrays.asList(
								Integer.toString(service.getSuccessClient().avg()),
								Integer.toString(service.getSuccessClient().min()),
								Integer.toString(service.getSuccessClient().max())));
			}
			if (series.getName().equals("Servidor")) {
				series.getData().addAll(
						Arrays.asList(
								Integer.toString(service.getSuccessServer().avg()),
								Integer.toString(service.getSuccessServer().min()),
								Integer.toString(service.getSuccessServer().max())));
			}
		}
	}

	@Override
	public Result getResult() {
		return result;
	}

}
