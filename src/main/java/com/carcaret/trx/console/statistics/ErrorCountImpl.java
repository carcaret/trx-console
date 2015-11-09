package com.carcaret.trx.console.statistics;

import com.carcaret.trx.console.statistics.Service.ErrorCount;

class ErrorCountImpl implements ErrorCount {

  private final int client;
  private final int server;

  public ErrorCountImpl(int client, int server) {
    super();
    this.client = client;
    this.server = server;
  }

  @Override
  public int client() {
    return client;
  }

  @Override
  public int server() {
    return server;
  }

}
