package com.soma.logical.main;

import java.util.Scanner;

import com.soma.logical.util.Utility;

public class LeapYear {
	public static void main(String[] a){
		System.out.println("Enter year:");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		Utility.checkLeapYear(year);

	}

	

}