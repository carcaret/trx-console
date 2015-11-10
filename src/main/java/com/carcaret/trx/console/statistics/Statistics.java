package com.carcaret.trx.console.statistics;

import com.carcaret.trx.console.report.Report;

public interface Statistics {

  Service getService(ServiceType type);
  
  void accept(Report report);

}
