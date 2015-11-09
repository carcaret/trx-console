package com.carcaet.trx.console.jaxb.engine;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.stream.StreamFilter;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;

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

  public static TxStatistics unmarshall(InputStream is) throws JAXBException, XMLStreamException {
    XMLInputFactory xif = XMLInputFactory.newFactory();
    XMLStreamReader xsr = xif.createXMLStreamReader(new StreamSource(is));
    xsr = xif.createFilteredReader(xsr, new StreamFilter() {
      @Override
      public boolean accept(XMLStreamReader reader) {
        if (reader.getEventType() == XMLStreamReader.CHARACTERS) {
          return reader.getText().trim().length() > 0;
        }
        return true;
      }
    });
    return (TxStatistics) JAXB_CONTEXT.createUnmarshaller().unmarshal(xsr);
  }

}
