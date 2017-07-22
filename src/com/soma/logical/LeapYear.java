package com.soma.logical;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] a){
		System.out.println("Enter year:");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		checkLeapYear(year);

	}

	public static void checkLeapYear(int year) {
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


}
