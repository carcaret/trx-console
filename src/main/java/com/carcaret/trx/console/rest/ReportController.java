package com.carcaret.trx.console.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.carcaret.trx.console.dto.Result;
import com.carcaret.trx.console.report.ReportType;
import com.carcaret.trx.console.service.ReportService;
import com.carcaret.trx.console.service.ReportServiceImpl;

@Path("/report")
public class ReportController {

	@GET
	@Path("/service")
	@Produces(MediaType.APPLICATION_JSON)
	public Result serviceReport() {
		ReportService service = new ReportServiceImpl();
		return service.generate(ReportType.SERVICE);
	}
}
