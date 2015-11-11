package com.carcaret.trx.console.service;

import java.util.List;

import com.carcaret.trx.console.jaxb.TxStatistics;

public interface FileService {

	List<TxStatistics> getStatistics(String date, int interval);
	
}
