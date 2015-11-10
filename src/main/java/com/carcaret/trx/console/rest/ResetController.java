package com.carcaret.trx.console.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class ResetController {

	@POST
	@Path("/reset")
	@Produces(MediaType.TEXT_PLAIN)
	public String reset(){
		
		return "OK";
	}
	
}
