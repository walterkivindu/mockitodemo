package com.walter.mockitodemo;

import java.util.List;

import com.walter.mockitodemo.service.StockService;

public class Portfolio {
	StockService service;
	List<Stock> stocks;

	public Portfolio() {
	}

	public Portfolio(StockService service, List<Stock> stocks) {
		this.service = service;
		this.stocks = stocks;
	}

	public StockService getService() {
		return service;
	}

	public void setService(StockService service) {
		this.service = service;
	}

	public List<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	
	public double getMarkerValue() {
		double marketValue = 0.0;
		for(Stock stock: stocks) {
			marketValue += service.getPrice(stock)* stock.getQuantity();
		}
		return marketValue;
	}
}
