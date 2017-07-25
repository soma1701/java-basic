package com.soma.logical.main;


import java.util.Random;
import java.util.Scanner;

import com.soma.logical.util.Utility;

public class CouponNumbers{
	public static void main(String[] a){
		Utility u=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int n=sc.nextInt();
		System.out.println(u.generateRandomCoupon(n));
		int counter=u.collect(n);
		System.out.println(counter);
	}
}






