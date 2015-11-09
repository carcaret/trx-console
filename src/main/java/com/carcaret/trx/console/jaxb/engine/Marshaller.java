package com.carcaret.trx.console.jaxb.engine;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.carcaret.trx.console.jaxb.TxStatistics;

public final class Marshaller {

  private Marshaller() {}

  private static final JAXBContext JAXB_CONTEXT;

  static {
    try {
      JAXB_CONTEXT = JAXBContext.newInstance(TxStatistics.class);
    } catch (Exception e) {
      throw new RuntimeException("Error initializing JAXBContext");
    }
  }

  public static OutputStream marshall(TxStatistics statistics) throws JAXBException {
    OutputStream os = new ByteArrayOutputStream();
    JAXB_CONTEXT.createMarshaller().marshal(statistics, os);
    return os;
  }

  public static TxStatistics unmarshall(InputStream is) throws JAXBException {
    return (TxStatistics) JAXB_CONTEXT.createUnmarshaller().unmarshal(is);
  }

}
