package com.carcaret.trx.console.statistics;

import com.carcaret.trx.console.report.Visitor;

public interface Statistics {

  Service getService(ServiceType type);
  
  void accept(Visitor visitor);

}
