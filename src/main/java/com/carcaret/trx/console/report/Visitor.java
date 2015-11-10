package com.carcaret.trx.console.report;

import com.carcaret.trx.console.dto.Result;
import com.carcaret.trx.console.statistics.Service;
import com.carcaret.trx.console.statistics.Statistics;

public interface Visitor {

	void visit(Statistics statistics);
	
	void visit(Service service);
	
	Result getResult();
	
}
