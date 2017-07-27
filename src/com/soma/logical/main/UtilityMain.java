package com.soma.logical.main;

import java.util.Arrays;
import java.util.Scanner;

import com.soma.logical.util.Utility;

public class UtilityMain{
	private static String string;

	public static void main(String[] a){
		Utility u=new Utility();
		Scanner sc=new Scanner(System.in);
		long startTime=0,endTime=0,elapsedTime=0;
		String string="";
		String[] stringArr=new String[string.length()];
		int size=0;
		int[] integerArr=new int[size];
		System.out.println("Press 1 for binarysearch_integer:-");
	    System.out.println("Press 2 for binarysearch_String:-");
	    System.out.println("Press 3 for insertionSort_Integer:-");
	    System.out.println("Press 4 for insertionSort_String:-");
	    System.out.println("Press 5 for bubbleSort_Integer:-");
	    System.out.println("Press 6 for bubbleSort_String:-");
	    System.out.println("Enter your choice:-");
	    int choice=sc.nextInt();
	    switch (choice) {
		case 1:
			startTime=u.startTime();
			System.out.println("stopWatch has started at:-"+(startTime));
			System.out.println("Enter size of inreger arr:");
			size=sc.nextInt();
			System.out.println("Enter integer array:-");
			u.readIntArray(size, integerArr, sc);
			int[] sortedArr=u.insertionSortInt(integerArr);
			System.out.println("sorted array:-");
			u.printIntArray(sortedArr);
			System.out.println("Enter no to search:-");
			int search=sc.nextInt();
			int result=u.binarySearchInteger(sortedArr, 0, size, search);
			System.out.println("no is found at:-"+result);
			endTime=u.endTime();
			System.out.println("methods has stoped at:-"+(endTime));
			elapsedTime=u.elapsedTime(startTime, endTime);
			System.out.println("elpasedTime for this method is:-"+elapsedTime);
			break;
		case 2:
			startTime=u.startTime();
			System.out.println("stopWatch has started at:-"+startTime);
			System.out.println("Enter String");
			sc.nextLine();
			string=sc.nextLine();
			stringArr=string.split(" ");
			u.printStringArr(stringArr);
			String[] sortedStringArr=u.insertionSortString(stringArr);
			System.out.println("sorted string as follows:-");
			u.printStringArr(sortedStringArr);
			System.out.println("Enter word to be search:-");
		    String word=sc.next();
			int position=u.binarySearchString(sortedStringArr, 0, sortedStringArr.length, word);
			if(position==-1){
				System.out.println("word is not found:-");
			}
			else{
			System.out.println("word is found at:-"+position);
			}
			endTime=u.endTime();
			System.out.println("methods has stoped at:-"+endTime);
			elapsedTime=u.elapsedTime(startTime, endTime);
			System.out.println("elpasedTime for this method is:-"+elapsedTime);
			break;
		case 3:
			startTime=u.startTime();
			System.out.println("stopWatch has started at:-"+startTime);
			System.out.println("Enter size of inreger arr:");
			size=sc.nextInt();
			
			System.out.println("enter integer array");
			u.readIntArray(size, integerArr, sc);
			int[] resultantArr=u.insertionSortInt(integerArr);
			System.out.println("sorted arrays are:-");
			u.printIntArray(resultantArr);
			endTime=u.endTime();
			System.out.println("methods has stoped at:-"+endTime);
			elapsedTime=u.elapsedTime(startTime, endTime);
			System.out.println("elpasedTime for this method is:-"+elapsedTime);
			break;
		case 4:
			startTime=u.startTime();
			System.out.println("stopWatch has started at:-"+startTime);
			System.out.println("Enter String");
			sc.nextLine();
			string=sc.nextLine();
			stringArr=string.split(" ");
			String[] resultI=u.insertionSortString(stringArr);
			System.out.println("srted string arrays are:-");
			u.printStringArr(resultI);
			endTime=u.endTime();
			System.out.println("methods has stoped at:-"+endTime);
			elapsedTime=u.elapsedTime(startTime, endTime);
			System.out.println("elpasedTime for this method is:-"+elapsedTime);
			break;
		case 5:
			startTime=u.startTime();
			System.out.println("stopWatch has started at:-"+startTime);
			System.out.println("Enter size of inreger arr:");
			size=sc.nextInt();
			
			u.readIntArray(size, integerArr, sc);
			int[] bubbleSort=u.bubbleSortInt(integerArr);
			System.out.println("sorted arrays are:-");
			u.printIntArray(bubbleSort);
			endTime=u.endTime();
			System.out.println("methods has stoped at:-"+endTime);
			elapsedTime=u.elapsedTime(startTime, endTime);
			System.out.println("elpasedTime for this method is:-"+elapsedTime);
			break;
		case 6:
			startTime=u.startTime();
			System.out.println("stopWatch has started at:-"+startTime);
			System.out.println("Enter String");
			sc.nextLine();
			string=sc.nextLine();
			stringArr=string.split(" ");
			String[] resultB=u.bubbleSortString(stringArr);
			System.out.println("srted string arrays are:-");
			u.printStringArr(resultB);
			endTime=u.endTime();
			System.out.println("methods has stoped at:-"+endTime);
			elapsedTime=u.elapsedTime(startTime, endTime);
			System.out.println("elpasedTime for this method is:-"+elapsedTime);
			break;
			default:
				System.out.println("u have entered wrong choiec:-");
				}
	    	}	
}