package com.carcaret.trx.console.statistics;

public enum ServiceType {

  FIRMA("urn:safelayer:tws:services:ds"), VERIFICACION(
      "urn:safelayer:tws:services:dsv"), ACTUALIZACION("urn:safelayer:tws:services:dr"), CIFRADO(
          "urn:safelayer:tws:services:de:encrypt"), DESCIFRADO(
              "urn:safelayer:tws:services:de:decrypt");

  private final String uri;

  private ServiceType(String uri) {
    this.uri = uri;
  }

  public String getUri() {
    return uri;
  }

}
