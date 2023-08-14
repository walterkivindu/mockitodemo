package com.walter.mockitodemo.service;

import com.walter.mockitodemo.Stock;

public class StockServiceImpl implements StockService {

	@Override
	public double getPrice(Stock stock) {
		return stock.getQuantity();
	}

}
