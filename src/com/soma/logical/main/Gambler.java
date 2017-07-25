package com.soma.logical.main;

import java.util.Scanner;

import com.soma.logical.util.Utility;

public class Gambler {
	public static void main(String[] a){
		Utility u=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter stake amount:-");
		int stake=sc.nextInt();
		System.out.println("Enter no of trials:-");
		int trials=sc.nextInt();
		System.out.println("Enter your goal:-");
		int goal=sc.nextInt();
		u.gamblerGame(stake,trials,goal);
		}
		
}

	


