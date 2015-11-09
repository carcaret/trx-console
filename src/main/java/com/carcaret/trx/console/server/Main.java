package com.carcaret.trx.console.server;

import org.eclipse.jetty.server.Server;

import com.carcaret.trx.console.handler.ReportHandler;

public class Main {

  public static void main(String[] args) throws Exception {
    Server server = new Server(8080);
    server.setHandler(new ReportHandler());

    server.start();
    server.join();
  }

}
