package com.carcaret.trx.console.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.carcaret.trx.console.dto.Result;
import com.carcaret.trx.console.report.ReportType;
import com.carcaret.trx.console.service.ReportService;
import com.carcaret.trx.console.service.ReportServiceImpl;
import com.carcaret.trx.console.statistics.ServiceType;

@Path("/report")
public class ReportController {

	@GET
	@Path("/service/{reportType}/{serviceType}")
	@Produces(MediaType.APPLICATION_JSON)
	public Result serviceReport(@PathParam("reportType") String reportType,
			@PathParam("serviceType") String serviceType) {
		ReportService service = new ReportServiceImpl();
		return service.generate(ReportType.getType(reportType), ServiceType.getType(serviceType));
	}
}
