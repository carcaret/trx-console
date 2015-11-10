package com.carcaret.trx.console.report;

import com.carcaret.trx.console.dto.Result;
import com.carcaret.trx.console.statistics.Statistics;

public interface Report {

	void visit(Statistics statistics);
	
	Result getResult();
	
}
