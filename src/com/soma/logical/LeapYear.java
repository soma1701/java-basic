package com.soma.logical;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] a){
		System.out.println("Enter year:");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		int count=1;
		while(year>10)
		{
			int r=year%10;
			count++;
			year=year/10;
		}if(count>3){
			checkLeapYear(year);
		}
		else{
			System.out.println("Please Enter 4 digit no:-");
		}
		
	}

	private static void checkLeapYear(int year) {
      if(year%4==0){
    	  System.out.println("given year is leap year:");
      }
      else{
    	  System.out.println("given year is not leap year:");
      }
	}

}
