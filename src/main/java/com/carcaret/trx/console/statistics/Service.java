package com.carcaret.trx.console.statistics;

import org.joda.time.DateTime;

public interface Service {

  ServiceType getType();

  AggregateValues getSuccessClient();

  AggregateValues getSuccessServer();

  ErrorCount getErrorCount();

  LastRequest getLastRequest();

  public interface AggregateValues {
    int avg();

    int min();

    int max();
  }

  public interface ErrorCount {
    int client();

    int server();
  }

  public interface LastRequest {
    boolean isSuccess();

    DateTime getFinishTime();

    String getResult();

    int getClientProcessingTime();

    int getServerProcessingTime();
  }

}
