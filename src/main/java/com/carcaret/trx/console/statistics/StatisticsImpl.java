package com.carcaret.trx.console.statistics;

import com.carcaret.trx.console.jaxb.TxStatistics;
import com.carcaret.trx.console.statistics.Service.AggregateValues;
import com.carcaret.trx.console.statistics.Service.ErrorCount;
import com.carcaret.trx.console.statistics.Service.LastRequest;

public final class StatisticsImpl implements Statistics {

	private final TxStatistics statistics;

	public StatisticsImpl(TxStatistics statistics) {
		this.statistics = statistics;
	}

	@Override
	public Service getService(ServiceType type) {
		for (TxStatistics.Service service : statistics.getService()) {
			if (service.getName().equals(type.getUri())) {
				AggregateValues client = new AggregateValuesImpl(
						service.getSuccessClientAvg(),
						service.getSuccessClientMin(),
						service.getSuccessClientMax());
				AggregateValues server = new AggregateValuesImpl(
						service.getSuccessServerAvg(),
						service.getSuccessServerMin(),
						service.getSuccessServerMax());
				ErrorCount errors = new ErrorCountImpl(
						service.getRequesterErrorCounter(),
						service.getResponderErrorCounter());
				LastRequest last = new LastRequestImpl(
						service.getLastRequest().isSuccess(),
						service.getLastRequest().getFinishTime(),
						service.getLastRequest().getResult(),
						service.getLastRequest().getClientProcessingTime(),
						service.getLastRequest().getServerProcessingTime());
				return new ServiceImpl(type, client, server, service.getSuccessCounter(), errors, last);
			}
		}
		throw new IllegalArgumentException(String.format(
				"Service type '%s' not found",
				type.getUri()));
	}

}
