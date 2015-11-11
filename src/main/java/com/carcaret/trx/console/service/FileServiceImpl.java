package com.carcaret.trx.console.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.carcaret.trx.console.jaxb.TxStatistics;
import com.carcaret.trx.console.jaxb.engine.Marshaller;
import com.carcaret.trx.console.util.Date;

public class FileServiceImpl implements FileService {

	@Override
	public List<TxStatistics> getStatistics(String date, int interval) {
		if(interval == 0){
			return getStatistics(date);
		}
		List<TxStatistics> statistics = new ArrayList<TxStatistics>();
		for(String auxDate : Date.getDateInterval(date, interval)){
			statistics.addAll(getStatistics(auxDate));
		}
		return statistics;
	}
	
	private List<TxStatistics> getStatistics(String date) {
		try {
			if (date.isEmpty()) {
				date = "20151112";
			}
			return Arrays.asList(Marshaller.unmarshall(new FileInputStream(String.format(
					"files/estadisticas_%s.xml",
					date))));
		}catch(FileNotFoundException e){ 
			throw new RuntimeException(String.format("No input file for date '%s'", date));
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
