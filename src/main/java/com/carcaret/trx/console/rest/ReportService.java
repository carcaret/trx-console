package com.carcaret.trx.console.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.carcaret.trx.console.dto.Test;

@Path("/report")
public class ReportService {

	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public Test test() {
		Test test = new Test();
		test.setName("name--");
		return test;
	}
}
