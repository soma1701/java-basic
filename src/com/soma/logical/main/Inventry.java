package com.soma.logical.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONObject;

public class Inventry {
	public static void a()
	{
	Scanner sc=new Scanner(System.in);
	
		JSONObject rice=new JSONObject();
		rice.put("name", sc.nextLine());
		rice.put("weight",sc.nextInt() );
		rice.put("price", sc.nextDouble());
		JSONObject pulses=new JSONObject();
		pulses.put("name", sc.nextLine());
		sc.nextLine();
		pulses.put("weight", sc.nextInt());
		pulses.put("price", sc.nextDouble());
		JSONObject weight=new JSONObject();
		pulses.put("name", sc.nextLine());
		sc.nextLine();
		pulses.put("weight", sc.nextInt());
		pulses.put("price", sc.nextDouble());
		File file=new File("/soma/java-basic/src/resource/Inventrydetails");
		
		try {
			FileOutputStream fos=new FileOutputStream(file);
			FileWriter fw=new FileWriter(file);
			fw.write(rice.toJSONString());
			fw.write(pulses.toJSONString());
			fw.write(weight.toJSONString());
		    fw.flush();
		    fw.close();
		    
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
     public static void main(String[] a){
	 Inventry.a();
     }
}
