package com.carcaret.trx.console.report;

import java.util.Arrays;

import com.carcaret.trx.console.dto.Result;
import com.carcaret.trx.console.statistics.Service;
import com.carcaret.trx.console.statistics.ServiceType;
import com.carcaret.trx.console.statistics.Statistics;

final class GeneralReport implements Visitor {

	private Result result = new Result();

	@Override
	public void visit(Statistics statistics) {
		Service service = statistics.getService(ServiceType.FIRMA);
		visit(service);
	}

	@Override
	public void visit(Service service) {
		Result.Series client = new Result.Series();
		client.setName("Cliente");
		client.setData(Arrays.asList(
				Integer.toString(service.getSuccessClient().avg()),
				Integer.toString(service.getSuccessClient().min()),
				Integer.toString(service.getSuccessClient().max())));
		
		Result.Series server = new Result.Series();
		server.setName("Servidor");
		server.setData(Arrays.asList(
				Integer.toString(service.getSuccessServer().avg()),
				Integer.toString(service.getSuccessServer().min()),
				Integer.toString(service.getSuccessServer().max())));
		
		result.setLabels(Arrays.asList("Avg", "Min", "Max"));
		result.setSeries(Arrays.asList(client, server));
	}

	@Override
	public Result getResult() {
		return result;
	}
	
}
