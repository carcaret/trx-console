package com.carcaret.trx.console.jaxb.engine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.carcaret.trx.console.jaxb.TxStatistics;
import com.carcaret.trx.console.jaxb.TxStatistics.GlobalStats;
import com.carcaret.trx.console.jaxb.engine.Marshaller;


public class MarshallTest {

  private InputStream xml;
  private TxStatistics statistics;

  @Before
  public void init() throws FileNotFoundException {
    xml = new FileInputStream("files/estadisticas.xml");
    statistics = new TxStatistics();
    GlobalStats stats = new GlobalStats();
    stats.setStartAt("20151022120009.335Z");
    statistics.setGlobalStats(stats);
  }

  @Test
  public void marshall() throws JAXBException {
    OutputStream os = Marshaller.marshall(statistics);
    Assert.assertEquals(STRING_STATISTICS, os.toString());
  }

  @Test
  public void unmarshall() throws JAXBException, XMLStreamException {
    TxStatistics statistics = Marshaller.unmarshall(xml);
    Assert.assertEquals("20151022120009.335Z", statistics.getGlobalStats().getStartAt());
  }

  private static final String STRING_STATISTICS =
      "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><TxStatistics xmlns=\"http://www.safelayer.com/TWS\"><GlobalStats><StartAt>20151022120009.335Z</StartAt></GlobalStats></TxStatistics>";

}
