package com.carcaret.trx.console.dto;

import java.util.List;

public class Result {

	private List<String> labels;
	private List<Series> series;
	
	public List<String> getLabels() {
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public List<Series> getSeries() {
		return series;
	}

	public void setSeries(List<Series> series) {
		this.series = series;
	}

	public static class Series{
		private String name;
		private List<String> data;
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public List<String> getData() {
			return data;
		}
		
		public void setData(List<String> data) {
			this.data = data;
		}
		
	}
	
}
