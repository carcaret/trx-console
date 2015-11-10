package com.carcaret.trx.console.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.carcaret.trx.console.jaxb.TxStatistics;
import com.carcaret.trx.console.jaxb.engine.Marshaller;

public class FileServiceImpl implements FileService {

	@Override
	public TxStatistics getStatistics(String date) {
		try {
			if (date.isEmpty()) {
				date = "20151112";
			}
			return Marshaller.unmarshall(new FileInputStream(String.format(
					"files/estadisticas_%s.xml",
					date)));
		}catch(FileNotFoundException e){ 
			throw new RuntimeException(String.format("No input file for date '%s'", date));
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
