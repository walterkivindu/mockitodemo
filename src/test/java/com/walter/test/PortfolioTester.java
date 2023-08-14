package com.walter.test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.walter.mockitodemo.Portfolio;
import com.walter.mockitodemo.Stock;
import com.walter.mockitodemo.service.StockService;
import com.walter.mockitodemo.service.StockServiceImpl;

public class PortfolioTester {
	Portfolio portfolio;
	StockService stockService;

	public static void main(String[] args) {
		PortfolioTester tester = new PortfolioTester();
		tester.setup();
		System.out.println(tester.testMarketValue() ? "pass" : "fail");
	}

	public void setup() {
		portfolio = new Portfolio();
		//Create the mock object of stock service
		stockService =   mock(StockService.class);
		//set the stockService to the portfolio
		portfolio.setService(stockService);
	}

	public boolean testMarketValue() {
		// Create a list of stocks to be added to the portfolio
		List<Stock> stocks = new ArrayList<Stock>();
		Stock googleStock = new Stock("1", "Google", 10);
		Stock microsoftStock = new Stock("2", "Microsoft", 100);

		stocks.addAll(List.of(googleStock,microsoftStock));

		// Add stocks to the portfolio
		portfolio.setStocks(stocks);

		// Mock the behavior of stock service to return the value of various stocks
		when(stockService.getPrice(googleStock)).thenReturn(50.00);
		when(stockService.getPrice(microsoftStock)).thenReturn(1000.00);

		double marketValue = portfolio.getMarkerValue();
		System.out.println("Market value = "+ marketValue);
		return marketValue == 100500.0;

	}

}
