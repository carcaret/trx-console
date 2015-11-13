package com.carcaret.trx.console.server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class RestServer {

	public static void main(String[] args) throws Exception {
		WebAppContext context = new WebAppContext();
		context.setDescriptor("src/main/webapp/WEB-INF/web.xml");
		context.setResourceBase("src/main/webapp/");
		context.setContextPath("/");
		context.setParentLoaderPriority(true);

		Server server = new Server(9090);
		server.setHandler(context);
		server.start();
		server.join();
	}

}
