package com.soma.logical.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Inventry {
	public static void main(String args[]){
		fetchDataFromFile();
	}
	public static void fetchDataFromFile()
	{
		File file=new File("src/resource/Inventrydetails.json");
		FileReader reader = null;
		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONParser parser =new 	JSONParser(); 
        try {
        	 JSONArray objJsonArray = (JSONArray) parser.parse(reader);
        	 List<InventryBean> alInventry = new ArrayList<>();
	    	 for (Object json : objJsonArray){
	    		 JSONObject objInventry = (JSONObject) json;
	    		 InventryBean objInventryBean = new InventryBean();
	    		 objInventryBean.setProductName(objInventry.get("productName").toString());
	    		 objInventryBean.setBrandName(objInventry.get("brandName").toString());
	    		 objInventryBean.setWeight(Double.parseDouble(objInventry.get("weight").toString()));
	    		 objInventryBean.setPrice(Double.parseDouble(objInventry.get("price").toString()));
	    		 alInventry.add(objInventryBean);
	    	 }
	    	 JSONArray objJsonArr = new JSONArray();
	    	 for(InventryBean objInventryBean : alInventry){
	    		 JSONObject objJSon = new JSONObject();
	    		 objJSon.put("productName", objInventryBean.getProductName());
	    		 objJSon.put("InventryPrice", objInventryBean.getWeight()*objInventryBean.getPrice());
	    		 objJsonArr.add(objJSon);
	    	 }
	    	 FileWriter objFile=new FileWriter("src/resource/inventry-details.json");
	    	 objFile.write(objJsonArr.toJSONString());
	    	 objFile.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
     }
}
