package com.soma.logical.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.soma.logical.main.StockPortfolio;
import com.soma.logical.main.UserDetails;
import com.soma.logical.main.linklist.Node;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Utility {
	private final String REGEX_NAME = "<<name>>";
	private final String REGEX_FULLNAME = "<<full name>> ";
	private final String REGEX_MOBILE_NO = "xxxxxxxxxx";
	private final String REGEX_DATE = "12/06/2016";
	
	public String convertString(UserDetails userDetails,String message){
		Pattern p = Pattern.compile(REGEX_NAME);
		Matcher m = p.matcher(message); 
		message = m.replaceAll(userDetails.getfName());

		p = Pattern.compile(REGEX_FULLNAME);
		m = p.matcher(message); 
		message = m.replaceAll(userDetails.getfName()+" "+userDetails.getlName());

		p = Pattern.compile(REGEX_MOBILE_NO);
		m = p.matcher(message); 
		message = m.replaceAll(userDetails.mobileNo());

		p = Pattern.compile(REGEX_DATE);
		m = p.matcher(message); 
		message = m.replaceAll(userDetails.date());

		return message;
	}
	public  void checkAnagram(String s, String s1) {
		int count=0;
		if(s.length()==s1.length()){
			for(int i=0;i<s.length();i++){
				for(int j=0;j<s1.length();j++){
					if(s.charAt(i)==s1.charAt(j)){
						count++;
					}
				}
			}
		}
		if(count==s.length()){
			System.out.println("anagram");
		}else
			System.out.println("not anagram");
	}
	public void readIntegerArray(int row, int col, Scanner sc) {
		int[][] b=new int[row][col];
		System.out.println("enter"+row*col+"elements");
		try{
			for(int i=0;i<row;i++){
				for(int j=0;j<col;j++){
					b[i][j]=sc.nextInt();
				}
			}
		}catch(Exception e){
			System.out.println("Enter integer no only");
		}
	}
	public void printIntArrayOnFile(int[][] b,int row, int col, PrintWriter printwriter){
		System.out.println("go to file to see array:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				printwriter.print(b[i][j]);
			}

			printwriter.println();
		}
		printwriter.flush();
		printwriter.close();
	}
	public  void readDoubleArray(int row, int col, Scanner sc) {
		double[][] b=new double[row][col];
		System.out.println("enter"+row*col+"elements");
		try{
			for(int i=0;i<row;i++){
				for(int j=0;j<col;j++){
					b[i][j]=sc.nextDouble();
				}
			}
		}catch(Exception e){
			System.out.println("Enter double data type only");
		}
	}
	public void printDoubleArrayOnFile(double[][] b,int row, int col, PrintWriter printwriter){
		System.out.println("go to file to see array:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				printwriter.print(b[i][j]);

			}

			printwriter.println();
		}
		printwriter.flush();
		printwriter.close();
	}
	
	public  void readBooleanArray(int row, int col, Scanner sc) {
		boolean[][] b=new boolean[row][col];
		System.out.println("enter"+row*col+"elements");
		try{
			for(int i=0;i<row;i++){
				for(int j=0;j<col;j++){
					b[i][j]=sc.nextBoolean();
				}
			}
		}catch(Exception e){
			System.out.println("Enter boolean data type only");
		}
	}
	public void printBooleanArrayOnFile(boolean[][] b,int row, int col, PrintWriter printwriter){
		System.out.println("print array:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				printwriter.print(b[i][j]);

			}

			printwriter.println();
		}
		printwriter.flush();
		printwriter.close();
	}
	public int generateRandomCoupon(int n){
		Random r=new Random();
		return r.nextInt(n);

	}
	public int collect(int n){
		int counter=0;
		int distinctValue=0;
		boolean[] collectedvalue=new boolean[n];
		while(distinctValue<n){
			int v=generateRandomCoupon(n);
			counter++;
			if(collectedvalue[v]){
				distinctValue++;
				collectedvalue[v]=true;
			}
		}
		return counter++;
	}
	public void triplet(int[] b,int n){
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n-1;j++){
				for(int k=j+1;k<n-2;k++){
					if(b[i]+b[j]+b[k]==0){
						System.out.println(b[i]+" "+b[j]+" "+b[k]);
						count++;
					}
				}
			}
		}
		System.out.println("no of distinct triplet is:"+count);	

	}
	public void findHarmonicNo(int n)
	   {
	    int harmonicNo=0;
	    for(int i=1;i<=n;i++)
	    {
	    System.out.print("1"+"/"+i+"+");
	    }
	   }


	
	public static ArrayList<StockPortfolio> fetchDataFromFile() {
		ArrayList<StockPortfolio> alStockPortfolios = new ArrayList<>();
		JSONParser parser= new JSONParser();
		try{
			JSONArray alStock=(JSONArray)parser.parse(new FileReader("src/resource/StockInformation.json"));
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
	public static void processData(ArrayList<StockPortfolio> alStockPortfolios) {
		try {
			FileWriter writer=new FileWriter(new File("src/resource/stockportFolioOutput.json"));
		    JSONArray stockArr=new JSONArray();
		    long totalPrice=0;
		    for (StockPortfolio objStockPortfolio : alStockPortfolios){
		    	JSONObject stockobj=new JSONObject();
			stockobj.put("Total price of each",objStockPortfolio.getNoOfShare()*objStockPortfolio.getPriceOfShare());
			totalPrice += objStockPortfolio.getNoOfShare()*objStockPortfolio.getPriceOfShare();
			stockArr.add(stockobj);
		    }
		    JSONObject objJson = new JSONObject();
		    objJson.put("totalPriceOfAllProducts", totalPrice);
		    stockArr.add(objJson);
			writer.write(stockArr.toJSONString());
			writer.flush();
			writer.close();
		
		} catch (IOException e) {
		e.printStackTrace();
		}
	}
	public void checkLeapYear(int year) {
	    int count=1;
	    int temp=year;
		while(temp>10){
			int r= temp%10;
			count++;
			temp=temp/10;
		}
		if(count>=3){
			if(year%4==0){
				System.out.println("given year is leap year:");
			}
			else{
				System.out.println("given year is not leap year:");
			}
		}else{
			System.out.println("please enter atleast 4 digit no to find leap year");
		}
}

	public void readArray(String s){
		String[] s1=s.split("");
		System.out.println("reading string array:-");
		for(int i=0;i<s1.length;i++){
			System.out.print(s1[i]);
		}System.out.println();
	}
	public void insertionSort(String[] s1) {
        for(int i=0;i<s1.length;i++){
        	Arrays.sort(s1);
        	System.out.println(s1[i]);
		}
	
    }
	public void gamblerGame(int stake,int trials,int goal){
		int bets=0;
		int wins=0,loose=0;
		int cashPrice = stake;
		for(int i=0;i<trials;i++)
		{
			if ((cashPrice > 0) && (cashPrice < goal)) {	
				bets++;
				if (Math.random() > 0.5){
					cashPrice++;
				    wins++;
				}
				else{
					cashPrice--;
				     loose++;
				}
			}
			else
				break;
		}
		System.out.println(wins+"wins of trials:"+trials);
		System.out.println(loose+"loose of trials"+trials);
		System.out.println("% of wins:-"+(wins*100)/trials);
		System.out.println("% of loose:-"+(loose*100)/trials);
		}
	public void checkPercOfHnT(int n){
		int h = 0;
		int t = 0;
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				if (Math.random() > 0.5) {
					h++;
				} else {
					t++;
				}
			}
			System.out.println("no of head"+h);
			System.out.println("no of tail"+t);
			System.out.println("precentage of head" + (h * 100) / n);
			System.out.println("precentage of tail" + (t * 100) / n);
		}
	
	}
	
	public int checktable(int powerOfTwo) {
		int table=0;
		for(int i=1;i<=powerOfTwo;i++){
			table=powerOfTwo*i;
		}
		return table;
	}

	public int checkPowerOfTwo(int n) {
		int powerOfTwo=1;
		if(n==0){
			powerOfTwo=1;
		}
		else{
		for(int i=0;i<n;i++){
			powerOfTwo =powerOfTwo*2 ;
		}
		}
		
		return powerOfTwo;
	    }
	public void replaceString(String s1){
		String s="Hello username, How are you?";
		if(s1.length()>=3){
			String s2=s.replace("username", s1);
			System.out.println(s2);
		}
		else{
			System.out.println("You have to enter min 3 character");
		}
		
	}
	public long startTime() {
		long startTime=System.currentTimeMillis();
		return startTime;
		}
	public long endTime(){
		long endTime=System.currentTimeMillis();
		return endTime;
	}
	public long elapsedTime(long startTime,long endTime){
		long elapsedTime=(endTime-startTime)/1000;
		return elapsedTime;
	}
	public void readIntArray(int n,int[] i,Scanner sc){
		for(int j=0;j<n;j++){
			i[j]=sc.nextInt();
		}
	}
	public void printIntArray(int[] i){
		for(int j=0;j<i.length;j++){
			System.out.print(i[j]+" ");
		}
	}
   public int binarySearchInteger(int[] arr,int start,int end,int search){
		int found=0;
		if(start>end){
			found=-1;
		}else{
			int mid=(start+end)/2;
			if(search==arr[mid]){
				found=mid;
			}else if(search>arr[mid]){
				found=binarySearchInteger(arr, mid+1, end, search);
			}else if(search<arr[mid]){
				found=binarySearchInteger(arr, start, mid, search);
			}
		}
		return found;
	}
   public int[] insertionSortInt(int[] input){
	   for(int i=1;i<input.length;i++){
		   for(int j=i;j>0;j--){
			   if(input[j-1]>input[j]){
					input[j-1]=input[j-1]+input[j];
					input[j]=input[j-1]-input[j];
					input[j-1]=input[j-1]-input[j];
				}
		   }
	   }return input;
   }
   public int[] bubbleSortInt(int[] input){
		for(int i=0;i<input.length;i++){
			for(int j=i+1;j<input.length;j++){
				if(input[i]>input[j]){
					input[i]=input[i]+input[j];
					input[j]=input[i]-input[j];
					input[i]=input[i]-input[j];
				}
			}
			
		}
		return input;
	}
	public int binarySearchString(String[] s,int start,int end,String search){
		start=0;
		end=s.length;
		while(start<end){
			int mid=(start+end)/2;
			if(search.compareTo(s[mid])<0){
				end=mid;
			}else if(search.compareTo(s[mid])>0){
				start=mid+1;
			}else{
				return mid;
				
			}

		}

		return -1;
	}
	public void printStringArr(String[] s) {
		for(int i=0;i<s.length;i++){
			System.out.print(s[i]+" ");
	    }System.out.println();
	}
	public String[] bubbleSortString(String[] input){
		String temp="";
		for(int i=0;i<input.length;i++){
			for(int j=i+1;j<input.length;j++){
	          if(input[i].compareTo(input[j])>0){
	        	  temp=input[i];
	        	  input[i]=input[j];
	        	  input[j]=temp;
	          }
			}
		}return input;
	}
	public String[] insertionSortString(String[] input){
		String temp="";
		for(int i=1;i<input.length;i++){
			for(int j=i;j>0;j--){
	          if(input[j-1].compareTo(input[j])>0){
	        	  temp=input[j-1];
	        	  input[j-1]=input[j];
	        	  input[j]=temp;
	          }
			}
		}return input;
	}
	public String[] FetchWordsFrom(File file){
		StringBuilder sb=new StringBuilder();
	   	Scanner scnr = null;
		try {
			scnr = new Scanner(file);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
	
	 	String s="";
	 	while(scnr.hasNextLine()){
	 		sb.append(scnr.nextLine());
	 		sb.append(" ");
	 		s=sb.toString();
	 	}
	String[] words = s.split(" ");
	scnr.close();
	return words;
	}
	public String getFormatedDate(Date date) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		return sdf.format(date);
	}
	public String FetchDataFromFile(File file) {
		StringBuilder sb=new StringBuilder();
		try {
			Scanner sc=new Scanner(file);
			while(sc.hasNextLine()){
				sb.append(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	public void insertAtStart(HashLinkList objLinkList,int data){
		Node node =new Node();
		node.setData(String.valueOf(data));
		objLinkList.setSize(objLinkList.getSize()+1);
		if(objLinkList.getStart()==null){
			objLinkList.setStart(node);
			objLinkList.setEnd(objLinkList.getStart());
		} else {
			node.setNext(objLinkList.getStart());
			objLinkList.setStart(node);
		}
	}
	public boolean  search(int data, HashLinkList hashLinkList) {
		boolean isFound=false;
        Node ptr=hashLinkList.getStart();
        for(int i=0;i<hashLinkList.getSize();i++){
        	if(Integer.parseInt(ptr.getData())==data){
        		isFound=true;
        		break;
        	}
        	ptr=ptr.getNext();
        }
        return isFound;
	}
	public boolean isQueueFull(Queue objQueue){
		return objQueue.getRare()==objQueue.getArrOueue().length;
	}
	public boolean isQueueEmpty(Queue objQueue){
		return objQueue.getRare()==-1;
	}
	public void enqueue(Queue objQueue,String data){
		if(isQueueFull(objQueue)){
			System.out.println("queue is already full");
		}
		else{
			objQueue.setRare(objQueue.getRare()+1);
			objQueue.getArrOueue()[objQueue.getRare()]=data;
		}
	}
	public String dequeue(Queue objQueue){
		String data="";
		if(isQueueEmpty(objQueue)){
			System.out.println("queue is empty unable to delete");
		} else {
//			objQueue.setSize(objQueue.getSize()-1);
			data=objQueue.getArrOueue()[objQueue.getRare()];
			objQueue.setRare(objQueue.getRare()-1);
		}
		return data;
	}
	
	
}

