package com.carcaret.trx.console.statistics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.carcaet.trx.console.jaxb.engine.Marshaller;

public class StatisticsWrapperTest {

  private StatisticsWrapper statistics;

  @Before
  public void init() throws FileNotFoundException, JAXBException, XMLStreamException {
    statistics =
        new StatisticsWrapper(Marshaller.unmarshall(new FileInputStream("files/estadisticas.xml")));
  }

  @Test
  public void getSuccessNodes() {
    Assert.assertEquals(7, statistics.getSuccessNodes().size());
  }

}
