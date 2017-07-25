package com.soma.logical.main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.soma.logical.StockPortfolio;
import com.soma.logical.util.Utility;

public class MainStockReport {
	public static void main(String[] a) throws IOException{
		Utility u=new Utility();
		u.writeDataToFile();
		ArrayList<StockPortfolio> alStockPortfolios =u.fetchDataFromFile();
		u.processData(alStockPortfolios);


	}
}
