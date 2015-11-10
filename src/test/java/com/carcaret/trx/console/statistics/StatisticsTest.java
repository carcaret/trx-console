package com.carcaret.trx.console.statistics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.carcaret.trx.console.jaxb.engine.Marshaller;

public class StatisticsTest {

  private Statistics statistics;

  @Before
  public void init() throws FileNotFoundException, JAXBException, XMLStreamException {
    statistics =
        new StatisticsImpl(Marshaller.unmarshall(new FileInputStream("src/test/resources/estadisticas.xml")));
  }

  @Test
  public void loadService() {
    Service service = statistics.getService(ServiceType.FIRMA);
    Assert.assertEquals(ServiceType.FIRMA, service.getType());
  }

  @Test
  public void loadAggregateValues() {
    Service service = statistics.getService(ServiceType.FIRMA);
    Assert.assertEquals(51, service.getSuccessClient().avg());
    Assert.assertEquals(42, service.getSuccessServer().avg());
  }

  @Test
  public void loadErrorCount() {
    Service service = statistics.getService(ServiceType.FIRMA);
    Assert.assertEquals(6, service.getErrorCount().server());
  }

  @Test
  public void loadLastRequest() {
    Service service = statistics.getService(ServiceType.FIRMA);
    Assert.assertEquals(47, service.getLastRequest().getClientProcessingTime());
  }

}
