package com.carcaret.trx.console.statistics;

import com.carcaret.trx.console.report.Visitor;

public class ServiceImpl implements Service {

	private final ServiceType type;
	private final AggregateValues client;
	private final AggregateValues server;
	private final int successCounter;
	private final ErrorCount errors;
	private final LastRequest last;

	public ServiceImpl(ServiceType type, AggregateValues client, AggregateValues server,
			int successCounter, ErrorCount errors, LastRequest last) {
		super();
		this.type = type;
		this.client = client;
		this.server = server;
		this.successCounter = successCounter;
		this.errors = errors;
		this.last = last;
	}

	@Override
	public ServiceType getType() {
		return type;
	}

	@Override
	public AggregateValues getSuccessClient() {
		return client;
	}

	@Override
	public AggregateValues getSuccessServer() {
		return server;
	}

	@Override
	public int getSuccessCounter() {
		return successCounter;
	}
	
	@Override
	public ErrorCount getErrorCount() {
		return errors;
	}

	@Override
	public LastRequest getLastRequest() {
		return last;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
