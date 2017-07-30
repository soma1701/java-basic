package com.soma.logical.main;

import java.io.IOException;
import java.util.ArrayList;

import com.soma.logical.util.Utility;


public class MainStockReport {
	public static void main(String[] a) throws IOException{
		Utility objUtility=new Utility();
		ArrayList<StockPortfolio> alStockPortfolios =objUtility.fetchDataFromFile();
		objUtility.processData(alStockPortfolios);


	}
}
