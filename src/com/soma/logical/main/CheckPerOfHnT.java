package com.soma.logical.main;

import java.util.Scanner;

import com.soma.logical.util.Utility;

public class CheckPerOfHnT {
	public static void main(String a[]) {
		Utility u=new Utility();
		System.out.println("Print number of times to flip coin:-");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		u.checkPercOfHnT(n);
	}
	
}
	