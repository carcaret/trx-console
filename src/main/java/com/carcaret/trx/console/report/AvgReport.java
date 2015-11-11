package com.carcaret.trx.console.report;

import java.util.Arrays;

import com.carcaret.trx.console.dto.Result;
import com.carcaret.trx.console.statistics.Service;

public class AvgReport implements Visitor{

	private final Result result;
	
	public AvgReport(String... dates) {
		Result.Series client = new Result.Series();
		client.setName("Cliente");
		
		Result.Series server = new Result.Series();
		server.setName("Servidor");
		
		result = new Result();
		result.setLabels(Arrays.asList(dates));
		result.setSeries(Arrays.asList(client, server));
	}
	
	@Override
	public void visit(Service service) {
		for(Result.Series series : result.getSeries()){
			if(series.getName().equals("Cliente")){
				series.getData().add(Integer.toString(service.getSuccessClient().avg()));
			}
			if(series.getName().equals("Servidor")){
				series.getData().add(Integer.toString(service.getSuccessServer().avg()));
			}
		}
	}

	@Override
	public Result getResult() {
		return result;
	}

}
