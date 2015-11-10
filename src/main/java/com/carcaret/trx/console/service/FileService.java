package com.carcaret.trx.console.service;

import com.carcaret.trx.console.jaxb.TxStatistics;

public interface FileService {

	TxStatistics getStatistics(String date);
	
}
