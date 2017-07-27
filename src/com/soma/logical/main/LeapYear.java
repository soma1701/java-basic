package com.soma.logical.main;

import java.util.Scanner;

import com.soma.logical.util.Utility;

public class LeapYear {
	public static void main(String[] a){
        Utility u=new Utility();
		System.out.println("Enter year:");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		u.checkLeapYear(year);

	}

	

}
