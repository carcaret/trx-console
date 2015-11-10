package com.carcaret.trx.console.report;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

import javax.xml.bind.JAXBException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.carcaret.trx.console.dto.Result;
import com.carcaret.trx.console.jaxb.TxStatistics;
import com.carcaret.trx.console.jaxb.engine.Marshaller;
import com.carcaret.trx.console.statistics.Statistics;
import com.carcaret.trx.console.statistics.StatisticsImpl;

public class ServiceReportTest {

	private Statistics statistics;
	
	@Before
	public void init() throws FileNotFoundException, JAXBException{
		TxStatistics txStatistics = Marshaller.unmarshall(new FileInputStream(
				"src/test/resources/estadisticas.xml"));
		statistics = new StatisticsImpl(txStatistics);
	}
	
	@Test
	public void generateServiceReport(){
		Visitor visitor = new GeneralReport();
		visitor.visit(statistics);
		Result result = visitor.getResult();
		Assert.assertEquals(Arrays.asList("Avg", "Min", "Max"), result.getLabels());
	}
	
}
