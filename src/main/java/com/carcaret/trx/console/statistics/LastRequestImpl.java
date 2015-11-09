package com.carcaret.trx.console.statistics;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.carcaret.trx.console.statistics.Service.LastRequest;

class LastRequestImpl implements LastRequest {

  private final boolean success;
  private final DateTime finishTime;
  private final String result;
  private final int clientProcessingTime;
  private final int serverProcessingTime;

  public LastRequestImpl(boolean success, String finishTime, String result,
      int clientProcessingTime, int serverProcessingTime) {
    super();
    this.success = success;
    DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyyMMddHHmmss.SSSZ");
    this.finishTime = formatter.parseDateTime(finishTime);
    this.result = result;
    this.clientProcessingTime = clientProcessingTime;
    this.serverProcessingTime = serverProcessingTime;
  }

  @Override
  public boolean isSuccess() {
    return success;
  }

  @Override
  public DateTime getFinishTime() {
    return finishTime;
  }

  @Override
  public String getResult() {
    return result;
  }

  @Override
  public int getClientProcessingTime() {
    return clientProcessingTime;
  }

  @Override
  public int getServerProcessingTime() {
    return serverProcessingTime;
  }

}
