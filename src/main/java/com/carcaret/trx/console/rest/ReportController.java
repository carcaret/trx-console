package com.carcaret.trx.console.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.carcaret.trx.console.dto.Result;
import com.carcaret.trx.console.report.ReportType;
import com.carcaret.trx.console.service.ReportService;
import com.carcaret.trx.console.service.ReportServiceImpl;
import com.carcaret.trx.console.statistics.ServiceType;

@Path("/report")
public class ReportController {

	private ReportService service = new ReportServiceImpl();

	@GET
	@Path("/service/{reportType}/{serviceType}")
	@Produces(MediaType.APPLICATION_JSON)
	public Result serviceReport(@PathParam("reportType") String reportType,
			@PathParam("serviceType") String serviceType) {
		try {
			return service.generate(
					ReportType.getType(reportType),
					ServiceType.getType(serviceType),
					"", 0);
		} catch (Exception e) {
			throw new ServerException(e);
		}
	}

	@GET
	@Path("/service/{reportType}/{serviceType}/{date}")
	@Produces(MediaType.APPLICATION_JSON)
	public Result serviceReport(@PathParam("reportType") String reportType,
			@PathParam("serviceType") String serviceType, @PathParam("date") String date) {
		try {
			return service.generate(
					ReportType.getType(reportType),
					ServiceType.getType(serviceType),
					date, 0);
		} catch (Exception e) {
			throw new ServerException(e);
		}
	}
	
	@GET
	@Path("/service/{reportType}/{serviceType}/{date}/{interval}")
	@Produces(MediaType.APPLICATION_JSON)
	public Result serviceReport(@PathParam("reportType") String reportType,
			@PathParam("serviceType") String serviceType, @PathParam("date") String date,
			@PathParam("interval") int interval) {
		try {
			return service.generate(
					ReportType.getType(reportType),
					ServiceType.getType(serviceType),
					date, interval);
		} catch (Exception e) {
			throw new ServerException(e);
		}
	}

	@SuppressWarnings("serial")
	private static class ServerException extends WebApplicationException {
		public ServerException(Exception e) {
			super(Response
					.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(e.getMessage())
					.type(MediaType.TEXT_PLAIN)
					.build());
		}
	}

}
