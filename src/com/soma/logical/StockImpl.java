package com.soma.logical;

import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class StockImpl {
	public static void main(String[] args) {
		long grossPrice=0;
		ArrayList<StockPortfolio> alStockPortfolios = fetchDataFromFile();
		processData(alStockPortfolios);
		
	}

	private static void processData(ArrayList<StockPortfolio> alStockPortfolios) {
		long totalPrice = 0;
		for (StockPortfolio objStockPortfolio : alStockPortfolios){
			System.out.println("Total price of each"+objStockPortfolio.getNoOfShare()*objStockPortfolio.getPriceOfShare());
			totalPrice += objStockPortfolio.getNoOfShare()*objStockPortfolio.getPriceOfShare();
		}
		System.out.println("Total share:-"+totalPrice);
	}

	private static ArrayList<StockPortfolio> fetchDataFromFile() {
		ArrayList<StockPortfolio> alStockPortfolios = new ArrayList<>();
		JSONParser parser= new JSONParser();
		try{
			JSONArray alStock=(JSONArray)parser.parse(new FileReader("src/com/soma/logical/StockInformation.json"));
			for(Object stock:alStock){
			   JSONObject stockJson=(JSONObject) stock;
			   StockPortfolio objStockPortfolio = new StockPortfolio();
			   objStockPortfolio.setName(stockJson.get("name").toString());
			   objStockPortfolio.setNoOfShare((Long)stockJson.get("noOfShare"));
			   objStockPortfolio.setPriceOfShare((Long)stockJson.get("priceOfShare"));
			   alStockPortfolios.add(objStockPortfolio); 
			}
		}catch(Exception e){
		e.getMessage();
		}
		return alStockPortfolios;
	}
}
