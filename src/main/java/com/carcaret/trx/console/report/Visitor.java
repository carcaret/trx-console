package com.carcaret.trx.console.report;

import com.carcaret.trx.console.dto.Result;
import com.carcaret.trx.console.statistics.Service;

public interface Visitor {

	void visit(Service service);
	
	Result getResult();
	
}
